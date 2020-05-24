package com.designpatterns.creational.objectpool;

import java.sql.Connection;

//JDBCConnectionPool will allow the application to borrow and return database connections:

public class Main {
    public static void main(String[] args) {
        // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection

        // Return the connection:
        pool.checkIn(con);
    }
}
