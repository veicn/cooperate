DROP PROCEDURE IF EXISTS firstPinyin;
CREATE PROCEDURE firstPinyin()
BEGIN
    DECLARE V_RETURN VARCHAR(255);
    DECLARE V_BOOL INT DEFAULT 0;
          DECLARE FIRST_VARCHAR VARCHAR(1);

    SET FIRST_VARCHAR = left(CONVERT(P_NAME USING gbk),1);
    SELECT FIRST_VARCHAR REGEXP '[a-zA-Z]' INTO V_BOOL;
    IF V_BOOL = 1 THEN
      SET V_RETURN = FIRST_VARCHAR;
    ELSE
      SET V_RETURN = ELT(INTERVAL(CONV(HEX(left(CONVERT(P_NAME USING gbk),1)),16,10),
          0xB0A1,0xB0C5,0xB2C1,0xB4EE,0xB6EA,0xB7A2,0xB8C1,0xB9FE,0xBBF7,
          0xBFA6,0xC0AC,0xC2E8,0xC4C3,0xC5B6,0xC5BE,0xC6DA,0xC8BB,
          0xC8F6,0xCBFA,0xCDDA,0xCEF4,0xD1B9,0xD4D1),
      'A','B','C','D','E','F','G','H','J','K','L','M','N','O','P','Q','R','S','T','W','X','Y','Z');
    END IF;
    RETURN V_RETURN;
END