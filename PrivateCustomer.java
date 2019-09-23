package com.novarepotential.Model;
import java.util.*;
public class PrivateCustomer extends Customer{
    
    String socialSecurityNumber;
  
public PrivateCustomer(){
    
}
    
    public PrivateCustomer(String name, String address, String phoneNumber) {
	super(name, address, phoneNumber);
	// TODO Auto-generated constructor stub
    }

    public PrivateCustomer(String name, String address, String phoneNumber, String socialSecurityNumber) {
	super(name, address, phoneNumber);
	this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

   
    
    
	
	
	
	
	
	
    }
    
    


