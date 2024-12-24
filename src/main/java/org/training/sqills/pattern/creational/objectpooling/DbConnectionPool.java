package org.training.sqills.pattern.creational.objectpooling;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DbConnectionPool {
    public static DbConnectionPool    dbConnectionPool = new DbConnectionPool();
    private       Queue<DbConnection> dbConnections    = new ArrayBlockingQueue<>(200);

    private DbConnectionPool() {
        for (int i = 0; i < 100; i++) {
            DbConnection dbConnectionLoc = new DbConnection();
            dbConnections.add(dbConnectionLoc);
        }
    }

    public DbConnection getConnection() {
        return dbConnections.poll();
    }

    public void close(final DbConnection dbConnectionParam) {
        dbConnections.add(dbConnectionParam);
    }
}
