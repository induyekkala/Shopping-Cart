package com.novarepotential.View;
import java.util.*;

import com.novarepotential.Model.Article;


public class ArticleReg {
    
    
    public ArrayList<Article> articlelist=new ArrayList<Article>();
    
    public ArrayList<Article> getArticlelist() {
        return articlelist;
    }


    public void setArticlelist(ArrayList<Article> articlelist) {
        this.articlelist = articlelist;
    }


    void add(Article article) {
	articlelist.add(article);
    }
    	
	
   int size=getArticlelist().size();
   
    
    
    public Article find(String articleid)
    {
	int i=0;
	Article article;
	int size=getArticlelist().size();
	for(i=0;i<size;i++) {
	      
	    article=articlelist.get(i);
	    if(article.getId().equals(articleid))
	    {
		return article;
		
	    }
	    
	}
	return null;
	
    }
    public void remove(String articleid) {
	
	int i=0;
	Article article=new Article();
	
	for(i=0;i<size;i++) {
	    if(article.getId().equals(articleid))	        
	    articlelist.remove(i);
	      	    
	}
    }
    
    public ArrayList<Article> printAll()
    {
	/*int i=0;
	Article article=new Article();*/
	
	/*
	 * for(i=0;i<size;i++) { System.out.println("All the records of articles");
	 * System.out.println("Article ID"+article.getId()+"\n"+"Article Name"+article.
	 * getName()+"\n"+"Article Price"+article.getPrice());
	 * 
	 * }
	 */
	return this.getArticlelist();
    }
    
    public void print(String id)
    {
	int i=0;
	Article article=new Article();
	
	for(i=0;i<size;i++)
	{
	    if(article.getId().equals(id))
	    
	    System.out.println("Article ID"+article.getId()+"\n"+"Article Name"+article.getName()+"\n"+"Article Price"+article.getPrice());
	    
	}
	
    }
    
}  




