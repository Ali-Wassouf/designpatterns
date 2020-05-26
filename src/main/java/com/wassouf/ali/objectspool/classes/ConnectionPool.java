package com.wassouf.ali.objectspool.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ConnectionPool extends ObjectPool<Connection>
{
    private String url;
    private String username;
    private String password;


    public ConnectionPool(String url, String username, String password, String driver)
    {
        try
        {
            Class.forName(driver);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        this.url = url;
        this.username = username;
        this.password = password;

    }


    @Override
    protected Connection create()
    {
        try
        {
            return DriverManager.getConnection(url, username, password);
        }
        catch (SQLException throwable)
        {
            throwable.printStackTrace();
            return null;
        }
    }


    @Override
    public boolean validate(Connection o)
    {
        try
        {
            return !o.isClosed();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
            return false;
        }
    }


    @Override
    public void expire(Connection o)
    {
        try
        {
            o.close();
        }
        catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
