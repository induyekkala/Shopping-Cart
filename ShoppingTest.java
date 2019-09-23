package com.novarepotential.Register;

import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;

import com.novarepotential.Model.CompanyCustomer;
import com.novarepotential.Model.Customer;
import com.novarepotential.Model.PrivateCustomer;


public class ShoppingTest {
    public static void main(String args[]) throws ParseException{
	
	CustomerReg customerReg=new CustomerReg();
	Customer cust; 
	Scanner input=new Scanner(System.in);

	        
	PrivateCustomer privatecustomer=new PrivateCustomer("indu","XXX","123","111");
	CompanyCustomer companycustomer=new CompanyCustomer("veena","YYY","124","122");
	
	cust=privatecustomer;
	customerReg.addCustomer(cust);
	if(cust.equals(privatecustomer))
	{
	   
	    customerReg.placeOrder();
	    
	}
	if(cust.equals(privatecustomer))
	{
	    customerReg.displayOrder();
	    
	}
	
	cust=companycustomer;
	customerReg.addCustomer(cust);
	
	if(cust.equals(companycustomer))
	{
	    customerReg.placeOrder();
	    
	}
	
	    
	
    }

}
