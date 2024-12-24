package org.training.sqills.pattern.creational.objectpooling;


import java.io.Closeable;
import java.io.IOException;

public class DbConnection implements Closeable {
    private String name;


    public void insert(String sql){
        // impl
    }

    @Override
    public void close() throws IOException {
        DbConnectionPool.dbConnectionPool.close(this);
    }
}
