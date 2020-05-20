package io.swagger.api.impl;
import javax.validation.constraints.Null;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresSql{
    public Connection getConnection() throws SQLException
    {
        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "postgres"))
        {
            return connection;
        }
        catch (SQLException e)
        {
            System.out.println(e.getStackTrace());
            return null;
        }

    }

}