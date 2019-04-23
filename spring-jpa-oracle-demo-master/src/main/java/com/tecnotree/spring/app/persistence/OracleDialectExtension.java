package com.tecnotree.spring.app.persistence;

import java.sql.Types;

public class OracleDialectExtension extends org.hibernate.dialect.Oracle10gDialect {
    public OracleDialectExtension() {
        super();
        registerColumnType(Types.CLOB, "xmltype");
    }

    @Override
    public boolean useInputStreamToInsertBlob() {
        return false;
    }
}