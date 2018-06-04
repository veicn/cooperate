package com.maoding.coreMybatis.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Denormalize your schema, using text fields to store your properties.
 * Note! Will read properties on field load, thus all parsing errors will occur inside mybatis.
 * Plus such properties parsing may have performance impact.
 * <p>
 * If you read properties rarely, than I suggest you to use {@link MapTypeHandler} that
 * parse properties string only on demand.
 */
@MappedTypes({Properties.class})
public class PropertiesTypeHandler extends BaseTypeHandler<Properties> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Properties parameter, JdbcType jdbcType) throws SQLException {
        Properties properties = new Properties();
        properties.putAll(parameter);
        StringWriter sw = new StringWriter();
        try {
            properties.store(sw, "Generated by mybatis-types");
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
        ps.setString(i, sw.toString());
    }

    @Override
    public Properties getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String value = rs.getString(columnName);
        return value == null ? null : toProperties(value);
    }

    @Override
    public Properties getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String value = rs.getString(columnIndex);
        return value == null ? null : toProperties(value);
    }

    @Override
    public Properties getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String value = cs.getString(columnIndex);
        return value == null ? null : toProperties(value);
    }

    private Properties toProperties(String value) {
        Properties p = new Properties();
        try {
            p.load(new StringReader(value));
        } catch (IOException ex) {
            throw new RuntimeException("Can not load k->v properties from string.\n"
                    + ex.getMessage(), ex);
        }
        return p;
    }
}
