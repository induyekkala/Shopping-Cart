package com.novarepotential.Model;
import java.util.*;
public class Supplier {
    
    String id;
    String name;
    String PhoneNr;
    
    ArrayList<Article> articleList=new ArrayList<Article>();
    
    

    public ArrayList<Article> articleList() {
        return articleList;
    }

    public void setarticleList(ArrayList<Article> articleList) {
        this.articleList = articleList;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNr() {
        return PhoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        PhoneNr = phoneNr;
    }

    public Supplier() {
	super();
	// TODO Auto-generated constructor stub
    }
    

    public Supplier(String id, String name, String phoneNr) {
	super();
	this.id = id;
	this.name = name;
	PhoneNr = phoneNr;
    }
    
    public void generateInvoice() {
	
	
    }
    
    
    

}
