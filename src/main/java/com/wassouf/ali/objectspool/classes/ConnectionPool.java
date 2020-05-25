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
    private String host;
    private String username;
    private String password;


    public ConnectionPool(String host, String username, String password, String driver)
    {
        super();
        try
        {
            Class.forName(driver);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        this.host = host;
        this.username = username;
        this.password = password;

    }


    @Override
    protected Connection create()
    {
        try
        {
            return (DriverManager.getConnection(host, username, password));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return (null);
        }
    }


    @Override
    public boolean validate(Connection o)
    {
        try
        {
            return (!o.isClosed());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return (false);
        }
    }


    @Override
    public void expire(Connection o)
    {
        try
        {
            o.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
