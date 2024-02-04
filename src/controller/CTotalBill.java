/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import model.MTotalBill;

/**
 *
 * @author AKITH
 */
public class CTotalBill 
{
    ResultSet rst;
    public ResultSet searchById(String id)
    {
        MTotalBill totbill = new MTotalBill();
        rst = totbill.searchById(id);
        
        return rst;
    }

    public int Calculatebill(int uprice, int quantity)
    {    MTotalBill ccalc = new MTotalBill();
        return ccalc.Calculatebill(uprice,quantity);
    }
}
    
