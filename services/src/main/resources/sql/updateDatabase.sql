DROP PROCEDURE IF EXISTS `fillStorageInfo`;
CREATE PROCEDURE `fillStorageInfo`()
BEGIN
    -- 清除项目一级目录
    delete from maoding_storage where (type_id = 20 or type_id = 30);
		update
				maoding_storage src
				inner join
				(select *
				 from (
							select node.id, node.path,node.type_id,node.pid
									,task.issue_id, task.id as task_id, task.project_id, task.company_id
									,if(position(task.path in node.path) > 0,substring(node.path, position(task.path in node.path) + char_length(task.path) + 1),node.path) as new_path
							from maoding_storage node
									left join maoding_storage parent1 on (node.pid=parent1.id)
									left join maoding_storage parent2 on (parent1.pid=parent2.id)
									left join maoding_storage parent3 on (parent2.pid=parent3.id)
									left join maoding_storage parent4 on (parent3.pid=parent4.id)
									left join maoding_storage parent5 on (parent4.pid=parent5.id)
									left join maoding_storage parent6 on (parent5.pid=parent6.id)
									left join maoding_storage parent7 on (parent6.pid=parent7.id)
									left join maoding_storage parent8 on (parent7.pid=parent8.id)
									left join maoding_storage parent9 on (parent8.pid=parent9.id)
									inner join maoding_task task on (concat(ifnull(parent9.pid,''),
																													ifnull(parent8.pid,''),
																													ifnull(parent7.pid,''),
																													ifnull(parent6.pid,''),
																													ifnull(parent5.pid,''),
																													ifnull(parent4.pid,''),
																													ifnull(parent3.pid,''),
																													ifnull(parent2.pid,''),
																													ifnull(parent1.pid,''),
																													ifnull(node.pid,''))
																									 like concat('%',task.id,'%'))
							order by length(task.path) desc
							) tmp
				 group by id
				) dst on (dst.id = src.id)
		set src.task_id=ifnull(dst.task_id,dst.issue_id),src.path=dst.new_path,
			src.type_id=if(src.type_id > 10 and dst.new_path like '建筑%',33,if(src.type_id=18,23,src.type_id));
END;

# DROP PROCEDURE IF EXISTS `transStorageData`;
# CREATE PROCEDURE `transStorageData`()
# BEGIN
# 		if ((select count(*) from information_schema.TABLES where TABLE_SCHEMA=database() and
# 				(TABLE_NAME in ('maoding_web_project_sky_drive','maoding_web_project','maoding_web_project_task',
# 													'maoding_web_exp_main','maoding_web_notice','maoding_web_company'))) = 6) then
# 			BEGIN
# 				-- 导入文档
# 				replace into maoding_storage (id,create_time,last_modify_time,last_modify_user_id,pid,path,node_name,type_id,file_length)
# 					select a.id,a.create_date,ifnull(a.update_date,a.create_date),ifnull(a.update_by,a.create_by),a.pid,
# 						if(e.id is not null,concat('/',f.company_name,'/',e.notice_title,'/',a.file_name),
# 							 if(d.id is not null,concat('/',f.company_name,'/',d.exp_no,'/',a.file_name),
# 									if(c.id is not null,concat('/',b.project_name,'/',
# 																						 (select GROUP_CONCAT(y.task_name order by length(y.task_path) SEPARATOR '/')
# 																							from maoding_web_project_task x
# 																								inner join maoding_web_project_task y on (x.task_path like concat(y.task_path,'%'))
# 																							where x.id = c.id),'/',a.file_name),
# 										 if(b.id is not null,concat('/',b.project_name,'/',a.file_name),
# 												concat('/',f.company_name,'/',a.file_name))))) as path,
# 						a.file_name,
# 						if((a.file_path is not null) or (a.file_size!=0) or (a.file_ext_name is not null),0,11),
# 						ifnull(a.file_size,0)
# 					from maoding_web_project_sky_drive a
# 						left join maoding_web_project b on (a.project_id=b.id)
# 						left join maoding_web_project_task c on (a.task_id=c.id)
# 						left join maoding_web_exp_main d on (a.target_id=d.id)
# 						left join maoding_web_notice e on (a.target_id=e.id)
# 						left join maoding_web_company f on (a.company_id=f.id)
# 					where ((b.id is not null) or (c.id is not null) or (d.id is not null) or (e.id is not null) or (f.company_name is not null))
# 								and ((c.id is null) or ((c.id is not null) and ((a.file_path is not null) or (a.file_size!=0) or (a.file_ext_name is not null))))
# 								and (a.file_name is not null) and (a.file_name != '');
#
# 				-- 更新目录id及对应的表类型
# 				drop table if exists id_convert;
# 				create temporary table id_convert (id char(32) NOT NULL,pid char(32),ptype smallint(4));
# 				insert into id_convert (id,pid,ptype) select x.id,
# 																						ifnull(e.id,ifnull(d.id,ifnull(c.id,ifnull(b.id,ifnull(f.id,x.pid))))),
# 																						if(e.id is not null,1,if(d.id is not null,2,
# 																																		 if(c.id is not null,3,if(b.id is not null,4,
# 																																															if(f.id is not null,5,0)))))
# 																					from maoding_storage x
# 																						left join maoding_storage y on (x.pid = y.id)
# 																						left join maoding_web_project_sky_drive a on (x.id=a.id)
# 																						left join maoding_web_project b on (a.project_id=b.id)
# 																						left join maoding_web_project_task c on (a.task_id=c.id)
# 																						left join maoding_web_exp_main d on (a.target_id=d.id)
# 																						left join maoding_web_notice e on (a.target_id=e.id)
# 																						left join maoding_web_company f on (a.company_id=f.id);
#
# 				update maoding_storage a inner join id_convert b on (a.id=b.id) set a.pid=b.pid,a.pid_type_id=b.ptype;
# 				drop table id_convert;
# 			END;
# 		end if;
# END;

DROP PROCEDURE IF EXISTS `updateFieldForQA`;
CREATE PROCEDURE `updateFieldForQA`()
BEGIN
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file_his' and column_name='action_id') then
		alter table maoding_storage_file_his add column `action_id` smallint(4) unsigned NOT NULL DEFAULT '0' COMMENT '校审动作类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='file_server_type_id') then
		alter table maoding_storage_file add column `file_server_type_id` smallint(4) unsigned DEFAULT '1' COMMENT '文件服务器类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='file_type_id') then
		alter table maoding_storage_file add column `file_type_id` smallint(4) unsigned DEFAULT '0' COMMENT '同步模式，0-手动同步，1-自动更新';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='lock_user_id') then
		alter table maoding_storage add column `lock_user_id` varchar(32) DEFAULT NULL COMMENT '锁定的用户id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='file_length') then
		alter table maoding_storage add column `file_length` bigint(16) unsigned DEFAULT '0' COMMENT '文件长度，如果节点是目录则固定为0';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='upload_file_server_type_id') then
		alter table maoding_storage_file add column `upload_file_server_type_id` smallint(4) unsigned DEFAULT '1' COMMENT '上传时使用的文件服务器类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='upload_scope') then
		alter table maoding_storage_file add column `upload_scope` varchar(255) DEFAULT NULL COMMENT '上传时使用的文件服务器存储位置';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='upload_key') then
		alter table maoding_storage_file add column `upload_key` varchar(255) DEFAULT NULL COMMENT '上传时使用的文件服务器存储名称';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='upload_id') then
		alter table maoding_storage_file add column `upload_id` varchar(255) DEFAULT NULL COMMENT '上传时使用的文件服务器上传任务编号';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='creator_org_id') then
		alter table maoding_storage_file add column `creator_org_id` char(32) DEFAULT NULL COMMENT '协同文件创建者所属组织的id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='creator_user_id') then
		alter table maoding_storage_file add column `creator_user_id` char(32) DEFAULT NULL COMMENT '协同文件创建者的用户id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='pid_type_id') then
		alter table maoding_storage add column `pid_type_id` smallint(4) unsigned NOT NULL DEFAULT '0' COMMENT '父节点类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='project_id') then
		alter table maoding_storage_file add column `project_id` char(32) DEFAULT NULL COMMENT '文件所属项目id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='organization_id') then
		alter table maoding_storage_file add column `organization_id` char(32) DEFAULT NULL COMMENT '文件所属组织id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='issue_id') then
		alter table maoding_storage_file add column `issue_id` char(32) DEFAULT NULL COMMENT '文件所属签发任务id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='task_id') then
		alter table maoding_storage_file add column `task_id` char(32) DEFAULT NULL COMMENT '文件所属生产任务id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='project_id') then
		alter table maoding_storage add column `project_id` char(32) DEFAULT NULL COMMENT '节点所属项目id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='issue_id') then
		alter table maoding_storage add column `issue_id` char(32) DEFAULT NULL COMMENT '节点所属签发任务id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='task_id') then
		alter table maoding_storage add column `task_id` char(32) DEFAULT NULL COMMENT '节点所属生产任务id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage' and column_name='company_id') then
		alter table maoding_storage add column `company_id` char(32) DEFAULT NULL COMMENT '文件所属组织id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='read_server_type_id') then
		alter table maoding_storage_file add column `read_server_type_id` smallint(4) unsigned DEFAULT '1' COMMENT '文件服务器类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='read_file_scope') then
		alter table maoding_storage_file add column `read_file_scope` varchar(255) DEFAULT NULL COMMENT '在文件服务器上的存储位置';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='read_file_key') then
		alter table maoding_storage_file add column `read_file_key` varchar(255) DEFAULT NULL COMMENT '在文件服务器上的存储名称';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='write_server_type_id') then
		alter table maoding_storage_file add column `write_server_type_id` smallint(4) unsigned DEFAULT '1' COMMENT '用于更改的文件服务器类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='write_file_scope') then
		alter table maoding_storage_file add column `write_file_scope` varchar(255) DEFAULT NULL COMMENT '用于更改的文件服务器存储位置';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='write_file_key') then
		alter table maoding_storage_file add column `write_file_key` varchar(255) DEFAULT NULL COMMENT '用于更改的文件服务器存储名称';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file_his' and column_name='remark') then
		alter table maoding_storage_file_his add column `remark` text(2048) DEFAULT NULL COMMENT '文件注释';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file_his' and column_name='action_type_id') then
		alter table maoding_storage_file_his add column `action_type_id` smallint(4) unsigned NOT NULL DEFAULT '0' COMMENT '校审动作类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='server_type_id') then
		alter table maoding_storage_file add column `server_type_id` smallint(4) unsigned DEFAULT '1' COMMENT '文件服务器类型';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='server_address') then
		alter table maoding_storage_file add column `server_address` varchar(255) DEFAULT NULL COMMENT '文件服务器地址';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='major_id') then
		alter table maoding_storage_file add column `major_id` char(32) DEFAULT NULL COMMENT '文件所属专业id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='main_file_id') then
		alter table maoding_storage_file add column `main_file_id` char(32) DEFAULT NULL COMMENT '所对应的原始文件id';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='read_file_scope') then
		alter table maoding_storage_file add column `read_file_scope` varchar(255) DEFAULT NULL COMMENT '只读文件在文件服务器上的存储位置';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='read_file_key') then
		alter table maoding_storage_file add column `read_file_key` varchar(255) DEFAULT NULL COMMENT '只读文件在文件服务器上的存储名称';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='write_file_scope') then
		alter table maoding_storage_file add column `write_file_scope` varchar(255) DEFAULT NULL COMMENT '可写文件在文件服务器上的存储位置';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='write_file_key') then
		alter table maoding_storage_file add column `write_file_key` varchar(255) DEFAULT NULL COMMENT '可写文件在文件服务器上的存储名称';
	end if;
	if not exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='file_checksum') then
		alter table maoding_storage_file add column `file_checksum` varchar(64) DEFAULT NULL COMMENT '文件校验和';
	else
		alter table maoding_storage_file MODIFY column `file_checksum` varchar(64) DEFAULT NULL COMMENT '文件校验和';
	end if;

END;

-- 创建升级数据库存储过程
DROP PROCEDURE IF EXISTS `updateDatabase`;
CREATE PROCEDURE `updateDatabase`()
BEGIN
	-- -- -- -- 备份原有数据
	-- call backupData();

	-- -- -- -- 创建表结构,忽略已有的表
 	call createTables();
	call updateViews();

	-- -- -- -- 添加字段，忽略已存在的字段
	call updateFieldForQA();

	-- -- -- -- 重新建立索引
	-- call createIndex();

	-- -- -- -- 补充新架构数据
	-- 添加用户
  if not exists (select 1 from maoding_web_account where cellphone='13680809727') then
    REPLACE INTO maoding_web_account (id,user_name,password,cellphone,status,create_date,active_time)
      VALUES ('5ffee496fa814ea4b6d26a9208b00a0b','sun','E10ADC3949BA59ABBE56E057F20F883E','13680809727','0','2017-07-04 11:59:37','2017-07-03 18:57:36');
  end if;
	-- 复制FileScope，FileKey
	if exists (select 1 from information_schema.COLUMNS where TABLE_SCHEMA=database() and table_name='maoding_storage_file' and column_name='file_scope') then
		if not exists (select 1 from maoding_storage_file where read_file_scope is not null) then
			update maoding_storage_file set
				read_file_scope=file_scope,
				read_file_key=file_key,
				write_file_scope=upload_scope,
				write_file_key=upload_key,
				server_type_id=file_server_type_id,
				server_address=last_modify_address;
		end if;
	end if;


	-- 补充storage内project_id等数据
  -- call fillStorageInfo();

	-- -- -- -- 更改或删除数据（需证明的确有必要）
	call initConst();

	-- -- -- -- 更改或删除字段（小心，需经过充分测试）

	-- -- -- -- 清理无效表（小心，需经过充分测试）

END;
call updateDatabase();