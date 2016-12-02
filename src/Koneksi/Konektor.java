package Koneksi;

import java.sql.*;

public class Konektor
{



    private Connection connect;

    public Konektor()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/kankerprostat", "root", "");
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public Connection getconnection()
    {
        return connect;
    }
}
