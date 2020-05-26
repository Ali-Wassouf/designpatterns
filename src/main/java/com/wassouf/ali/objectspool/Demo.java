package com.wassouf.ali.objectspool;

import com.wassouf.ali.objectspool.classes.ConnectionPool;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo
{
    public static void main(String... args)
    {
//        ConnectionPool connectionPool = new ConnectionPool("jdbc:h2:~/test", "sa", "", "org.h2.Drive");
//        System.out.println("Connecting to database...");
//        Connection connection = connectionPool.checkOut();
//        try (Statement stmt = connection.createStatement())
//        {
//            //STEP 3: Execute a query
//            System.out.println("Creating table in given database...");
//            String sql = "DROP ALL OBJECTS ;CREATE TABLE RandomName " +
//                "(id INTEGER not NULL, " +
//                " first VARCHAR(255), " +
//                " last VARCHAR(255), " +
//                " age INTEGER, " +
//                " PRIMARY KEY ( id ))";
//            stmt.executeUpdate(sql);
//            System.out.println("Created table in given database...");
//
//            // STEP 4: Clean-up environment
//            stmt.close();
//            connection.close();
//        }
//        catch (SQLException throwables)
//        {
//            throwables.printStackTrace();
//        }
//        catch (Exception e)
//        {
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        }
//        System.out.println("GOODBYE");
    }
}
