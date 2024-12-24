package org.training.sqills.pattern.creational.objectpooling;

import java.io.IOException;

public class DbConnectionPoolMain {
    public static void main(String[] args) throws IOException {

        try(DbConnection connectionLoc = DbConnectionPool.dbConnectionPool.getConnection()) {
            // impl
            connectionLoc.insert("insert");
        }
    }
}
