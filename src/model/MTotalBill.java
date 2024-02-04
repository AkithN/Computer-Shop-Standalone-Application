/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.Region;

/**
 *
 * @author AKITH
 */
public class MTotalBill 
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

    public int Calculatebill(int uprice, int quantity) 
    {
        int total = quantity * uprice;
        return total;
    }
}
