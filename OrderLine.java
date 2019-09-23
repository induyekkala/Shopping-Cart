package com.novarepotential.Model;
import java.util.*;
public class OrderLine {
    
    public Article article=new Article();
    private int quantity;
    public Order order;
     public OrderLine orderline;
     public OrderLine() {
	 
     }
    
   public OrderLine(Article article,int quantity){
	
       article.getId();
       article.getName();
       article.getPrice();
	this.quantity=quantity;
	
	
    }
  
   
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
   




    





    public void setOrderline(OrderLine orderline) {
        this.orderline = orderline;
    }
    
   
    
    
    
    

}
