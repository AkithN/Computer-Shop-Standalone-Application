/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AKITH
 */
public class MCustomerDetails 
{
    public void submitcustomerdetail(int cid,String cname,int pno,String address) 
   {
       try
       {
           Statement st = MyDatabaseConnection.getMyConnection().createStatement();
           int rowcount = st.executeUpdate("insert into customer_detail values('"+cid+"','"+cname+"','"+pno+"','"+address+"')");
           if(rowcount > 0)
           {
               JOptionPane.showMessageDialog(null, "Successfully Submitted");
           }
       }
       catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,e.getMessage());    
           }
   }
}
