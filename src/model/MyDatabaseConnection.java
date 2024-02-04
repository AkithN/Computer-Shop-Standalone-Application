
package model;
import java.sql.*;
import javax.swing.JOptionPane;

public class MyDatabaseConnection
{
   static Connection con;
    public static Connection getMyConnection()
    {
        try{
            String dbpath="jdbc:mysql://localhost/computer_shop";
            con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return con;
    } 
}
