/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MProductDetail;
import java.sql.*;
/**
 *
 * @author AKITH
 */
public class CProductDetail 
{
    ResultSet rst;
    public ResultSet searchById(String id)
    {
        MProductDetail delpro = new MProductDetail();
        rst = delpro.searchById(id);
        
        return rst;
    }
        public void submitproductdetail(String pid,String pname,String price,String warranty,int quantity) 
    {
        MProductDetail mprodet = new MProductDetail();
        mprodet.submitproductdetail(pid,pname,price,warranty,quantity);
    }

    public void deletetproduct(String dpid) 
    {
        MProductDetail mprodel = new MProductDetail();
        mprodel.deleteproduct(dpid);
    }

    public void updateproduct(String upid, String upname, String uprice, String uwarranty)
    {
        MProductDetail mprodel = new MProductDetail();
        mprodel.updateproduct(upid,upname,uprice,uwarranty);
    }
}
