package controller;

import model.MCustomerDetails;

public class CCustomerDetails 
{
    public void submitcustomerdetail(int cid,String cname,int pno,String address ) 
    {
        MCustomerDetails mcusreg = new MCustomerDetails();
        mcusreg.submitcustomerdetail(cid,cname,pno,address);
    }
}
