package com.novarepotential.Model;
import java.util.ArrayList;

public class CompanyCustomer extends Customer{
    
    String corprorateId;
    
   public CompanyCustomer(){
       
   }
   public CompanyCustomer(String name, String address, String phoneNumber, String corprorateId) {
	super(name, address, phoneNumber);
	this.corprorateId = corprorateId;
   }
   public CompanyCustomer(String name, String address, String phoneNumber) {
	super(name, address, phoneNumber);
	// TODO Auto-generated constructor stub
   }
   
    public String getCorprorateId() {
        return corprorateId;
    }
    public void setCorprorateId(String corprorateId) {
        this.corprorateId = corprorateId;
    }
    

    
    

}
