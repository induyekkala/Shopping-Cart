package com.novarepotential.View;
import com.novarepotential.Model.*;
import com.novarepotential.Register.*;
import java.util.*;

import javax.swing.JFrame;
public class Controller {
    
   ArrayList<Customer> customers=new ArrayList<Customer>(); 
   Customer cust; 
   Order order=new Order();
   OrderLine orderline=new OrderLine();
   ArticleReg articleReg=new ArticleReg();
   CustomerReg customerReg=new CustomerReg();
 private ArrayList<Order> orderList = new ArrayList<Order>();
 private ArrayList<OrderLine> orderLine=new ArrayList<OrderLine>();
 JFrame OrderLine;
 public ArrayList<Order> listOrder(){
     return orderList;
 }
 public Controller()
 {
     
 }
 public Controller(Order order,CustomerReg customerReg,ArticleReg artReg, JFrame OrderLine)
 {
     this.order=order;
     this.customerReg=customerReg;
     this.articleReg=articleReg;
     this.OrderLine=OrderLine;
 }
 
 
 public void addCustomer(Customer customer) 
 {    
    
     customerReg.addCustomer(customer) ;
    
 }
 
 public Customer findCustomer(String customerName) 
 {   
    
    return  customerReg.findCustomer(customerName);     
    
 }
 
 public ArrayList<Customer> listCustomer(){
     return customerReg.printAll();
 }
 
 
 public void removeCustomer(String customerName) 
 { 
  
      customerReg.removeCustomer(customerName);  
    
 }
 
 public void addArticle(String articleId,String articleName, double price)
 {
     articleReg.add(new Article(articleId,articleName,price));
 }

 
 public List<OrderLine> listOrderLines(){
     return order.getOrderLine();
 }
 
 
 public void addOrderLines(Article article,int quantity)
 {
     OrderLine orderLine = new OrderLine();
     orderLine.setArticle(article);
     orderLine.setQuantity(quantity);
     
     order.addOrderLine(orderLine);
 }
     
   
 public Order createOrder(String orderNumber,Date date,OrderLine orderLine) {
       
	try
	{
     Order   order=new Order(orderNumber,date,orderLine);
        order.setOrderNumber(orderNumber);
        order.setDate(date);
        
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
	return order;
        
    }
    
    
    
    /*
     * public void createOrderLine(Article article,Order order,int quantity) {
     * orderLine.add(new OrderLine(article,order,quantity)); }
     */
   
    
    

}
