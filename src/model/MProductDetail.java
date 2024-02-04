package model;

import java.sql.*;
import javax.swing.JOptionPane;
import static model.MyDatabaseConnection.con;

public class MProductDetail 
{
    ResultSet rst;
    PreparedStatement pst;
    
    public ResultSet searchById(String ProductId)
    {
        try
        {
        pst = MyDatabaseConnection.getMyConnection().prepareStatement("select item_name,price,warranty from item_detail where item_code='"+ProductId+"'"); 
        rst = pst.executeQuery();
        }
        catch(SQLException ex)
           {
               JOptionPane.showMessageDialog(null, ex.getMessage());    
           }
        
        return rst;
    }
    
    public void submitproductdetail(String pid, String pname, String price, String warranty, int quantity) 
    {
        try
       {
           Statement st = MyDatabaseConnection.getMyConnection().createStatement();
           int rowcount = st.executeUpdate("insert into item_detail values('"+pid+"','"+pname+"','"+price+"','"+warranty+"','"+quantity+"')");
           if(rowcount > 0)
           {
               JOptionPane.showMessageDialog(null, "Successfully Submitted");
           }
       }
       catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null, e.getMessage());    
           }
    }

    public void deleteproduct(String dpid) 
    {
        try 
        {
            Statement st = MyDatabaseConnection.getMyConnection().createStatement();
            int deletedRows = st.executeUpdate("DELETE FROM item_detail WHERE item_code = '" + dpid + "'");
            if (deletedRows > 0) 
            {
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                //setVisible(false);
                //new ProductDetail().setVisible(true);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "No record found with the given item code");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 

    public void updateproduct(String upid, String upname, String uprice, String uwarranty) 
    {
         try
        {
            Statement st = MyDatabaseConnection.getMyConnection().createStatement();
            int rowcount = st.executeUpdate("update item_detail set item_name = '" + upname + "', price = '" + uprice + "', warranty = '" + uwarranty + "' where item_code='"+upid+"'");
            con.close();
            if(rowcount > 0)
            {
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

