package com.novarepotential.Register;
import java.util.*;

import com.novarepotential.Model.Article;
import com.novarepotential.Model.Customer;
import com.novarepotential.Model.Order;
import com.novarepotential.Model.OrderLine;

import  java.text.*;

import java.text.*;


public class CustomerReg 
{
    
    Scanner input=new  Scanner(System.in); 
    Order order;
    String articleId,articleName;
    double articlePrice=0.0;
    double total_price=0.0;
    int no_of_articles=0;
//   OrderLine orderLine=new OrderLine();
     ArrayList<Customer> Customers=new ArrayList<Customer>();
     

    public ArrayList<Customer> getCustomers() {
        return Customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        Customers = customers;
    }

    public void addCustomer(Customer customer) {
	Customers.add(customer);
    }
    
   
    
    public Customer findCustomer(String customerName) {
   	for(Customer cust:Customers)
   	{
   	    if(cust.equals(customerName))
   	    {
   		return cust;
   	    }
   	}
   	return null;
    }
    
    public void removeCustomer(String customerName)
    {
	int size=Customers.size();
	for(int i=0;i<size;i++) {
	    
	    if(Customers.get(i).getName().equals(customerName))
	    {
		Customers.remove(i);
	    }
	    
	    
	}
	
    }
   	
    public ArrayList<Customer> printAll()
    
    {
	
	return this.getCustomers();
	
	
    }
       
     
    
    /*
     * public void placeOrder() throws ParseException {
     * 
     * 
     * 
     * System.out.println("Enter the order Id"); String orderId=input.next(); ;
     * //System.out.println(dateString); System.out.println("Enter the Date");
     * String dateString = input.next(); DateFormat formatter = new
     * SimpleDateFormat("dd-MM-yyyy"); Date date = formatter.parse(dateString);
     * 
     * 
     * System.out.println("Enter the Quantity"); int quantity=input.nextInt();
     * 
     * order.setOrderNumber(orderId); order.setDate(date);
     * orderLine.setOrder(order); orderLine.setQuantity(quantity);
     * System.out.println("Enter the no of articles");
     * 
     * int no_of_articles=input.nextInt();
     * 
     * ArrayList<Article> articleList=new ArrayList<Article>();
     * 
     * for(int i=0;i<no_of_articles;i++) {
     * 
     * System.out.println("Enter article Id"); articleId=input.next();
     * System.out.println("Enter article Name"); articleName=input.next();
     * System.out.println("Enter article articlePrice");
     * articlePrice=input.nextDouble(); Article article1=new
     * Article(articleId,articleName,articlePrice); articleList.add(article1);
     * orderLine.setArticle(article1);
     * total_price=orderLine.getQuantity()*article1.getPrice();
     * 
     * }
     * 
     * 
     * } public void displayOrder()
     * 
     * {
     * 
     * // System.out.println("OrderId"+order.OrderNumber);
     * System.out.println("Order Date"+order.getDate());
     * System.out.println("Quantity"+orderLine.getQuantity());
     * 
     * System.out.println("Order Date"+orderLine.getOrder().getDate());
     * System.out.println("Article Id"+orderLine.getArticle().getId());
     * System.out.println("Article Name"+orderLine.getArticle().getName());
     * System.out.println("Article Price"+orderLine.getArticle().getPrice());
     * System.out.println("Total Price"+total_price);
     * 
     * 
     * 
     * }
     * 
     * 
     */
      
      
      
      
      
      
      
      }
      
      
      
      
      
      
      
       
      
     
	    
	
	
	
    
     

