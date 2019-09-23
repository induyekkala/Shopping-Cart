package com.novarepotential.Model;

import java.util.ArrayList;

public abstract class Customer {
    String name;
    String address;
    String phoneNumber;
    ArrayList<Order> orderList=new ArrayList<Order>();
    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    public Customer() {
	
    }
    public Customer(String name, String address, String phoneNumber) {
	super();
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    

}
