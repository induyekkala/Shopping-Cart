package com.novarepotential.Register;
import java.util.*;

import com.novarepotential.Model.Supplier;
public class SupplierReg {
    
    
   ArrayList<Supplier> supplierlist=new ArrayList<Supplier>();

   Supplier supplier=new Supplier();
   
public ArrayList<Supplier> getSupplierlist() {
    return supplierlist;
}

public void setSupplierlist(ArrayList<Supplier> supplierlist) {
    this.supplierlist = supplierlist;
}

       void add(Supplier supplier) 
       {
	supplierlist.add(supplier);
	}
   	
         int size=getSupplierlist().size();
         public Supplier find(String supplierid)
         {
     	int i=0;
     	
     	int size=getSupplierlist().size();
     	for(i=0;i<size;i++) {
     	      
     	    supplier=supplierlist.get(i);
     	    if(supplier.getId().equals(supplierid))
     	    {
     		return supplier;
     		
     	    }
     	    
     	}
     	return null;
     	
         }
         public void remove(String supplierid) 
         {
     	
     	 	int i=0;
     	 	  	
     	 	for(i=0;i<size;i++) {
     	 	    if(supplier.getId().equals(supplierid))	        
     	 		supplierlist.remove(i);
     	      	    
     	 	}
         }
         
        public void printAll()
        {
     		int i=0;
     	
     		for(i=0;i<size;i++)
     			{
     		    	System.out.println("All the records of articles");
     		    	System.out.println("Supplier ID"+supplier.getId()+"\n"+"Supplier Name"+supplier.getName()+"\n"+"Supplier PhoneNumber"+supplier.getPhoneNr());
     	    
     			}
     	
        }
         
         public void print(String supplierid)
         {
     		int i=0;
     		
     	
     		for(i=0;i<size;i++)
     			{
     		    		if(supplier.getId().equals(supplierid))
     	    
     		    	        System.out.println("Supplier ID"+supplier.getId()+"\n"+"Supplie Name"+supplier.getName()+"\n"+"Supplier Phone Number"+supplier.getPhoneNr());
     	    
     			}
     	
         }
         
         public void update(int index) {
             //String supplierid=supplierlist.get(index);
         }
         
     }  


  
  
   
   
   


