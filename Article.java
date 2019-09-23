package com.novarepotential.Model;

public class Article {
    
    
    private String id;
    private String name;
    private  double price;
    private Supplier supplier;
    public Supplier getSupplier() {
        return supplier;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public Article(){
	
    }
    public Article(String id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    

}
