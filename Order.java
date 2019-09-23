package com.novarepotential.Model;
import java.util.*;
public class Order {
    
    private String OrderNumber;
    private Date date;
    private OrderLine orderline;
   private    ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();
    
    
    public OrderLine getOrderline() {
        return orderline;
    }

    public void setOrderline(OrderLine orderline) {
        this.orderline = orderline;
    }

    public Order()
    {
    }
    
    public Order(String orderNumber,Date date,OrderLine orderline) {
	super();
	OrderNumber = orderNumber;
	this.date=date;
	this.orderline=orderline;
	
	
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   

   
    public ArrayList<OrderLine> getOrderLine() {
        return orderLine;
    }
    public void setOrderLine(ArrayList<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }
    public String getOrderNumber() {
        return OrderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }
   
    
    public void addOrderLine(OrderLine orderline)
    {
	this.orderLine.add(orderline);
	
    }
    
    
    
    

}
