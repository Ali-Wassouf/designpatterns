package com.wassouf.ali.objectspool.classes;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ConnectionPoolTest
{
    ConnectionPool connectionPool = new ConnectionPool("jdbc:h2:~/test", "sa", "", "org.h2.Drive");

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void testCreatingConnectionPool()
    {
        Assert.assertNotNull(connectionPool);
    }

    @Test
    public void testCreatingConnectionFromConnectionPool()
    {
        Assert.assertNotNull(connectionPool.create());
    }


    @Test
    public void testValidateFunction() throws SQLException
    {
        Connection connection = connectionPool.create();
        connection.close();
        Assert.assertFalse(connectionPool.validate(connection));
    }
}