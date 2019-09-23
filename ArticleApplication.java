package com.novarepotential.View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.table.*;




import java.awt.*;
import java.util.*;
import com.novarepotential.Register.*;
import com.novarepotential.Model.*;
public class ArticleApplication {

    public JFrame frame,frame1;
    private JTextField text_articleid;
    public JTextField articleN;
    public JTextField articleP;
    TableColumn column1=new TableColumn();
    public Controller control;
    
    String id; 
    String Name ;
    
    double price;
    public ArticleReg articlereg=new ArticleReg();
    public Article article;
    private JButton btnListArticles;
    public ArrayList<Article> articleList=new ArrayList<Article>();
    private DefaultTableModel model=new DefaultTableModel();
   
   
    private JTable tableArticle;
    /**
     * @wbp.nonvisual location=150,441
     */
    private final JLabel label = new JLabel("New label");
    
 // ScrollPane for Table
  
    
    
    
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    ArticleApplication window = new ArticleApplication();
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public ArticleApplication() {
	initialize();
	 control=new Controller();
	
	
    }
    
    

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	
	JLabel lblArticleid = new JLabel("ArticleId");
	lblArticleid.setBounds(55, 86, 61, 16);
	frame.getContentPane().add(lblArticleid);
	
	JLabel lblArticlename = new JLabel("ArticleName");
	lblArticlename.setBounds(55, 127, 84, 16);
	frame.getContentPane().add(lblArticlename);
	
	JLabel lblArticlaPrice = new JLabel("Article Price");
	lblArticlaPrice.setBounds(55, 155, 84, 16);
	frame.getContentPane().add(lblArticlaPrice);
	
	text_articleid = new JTextField();
	text_articleid.setBounds(151, 81, 130, 26);
	frame.getContentPane().add(text_articleid);
	text_articleid.setColumns(10);
	
	articleN = new JTextField();
	articleN.setBounds(151, 117, 130, 26);
	frame.getContentPane().add(articleN);
	articleN.setColumns(10);
	
	articleP = new JTextField();
	articleP.setBounds(151, 150, 130, 26);
	frame.getContentPane().add(articleP);
	articleP.setColumns(10);
	
	JButton btnAdd = new JButton("Add");
	btnAdd.setBounds(74, 183, 117, 29);
	frame.getContentPane().add(btnAdd);
	
	btnListArticles = new JButton("List Articles");
	btnListArticles.setBounds(208, 183, 117, 29);
	frame.getContentPane().add(btnListArticles);
	
	JLabel lblArticlesList = new JLabel("Articles List");
	lblArticlesList.setBounds(149, 24, 110, 29);
	frame.getContentPane().add(lblArticlesList);
	
	JButton btnOrderitems = new JButton("OrderItems");
	btnOrderitems.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		    double price=Double.parseDouble(articleP.getText());
		    
		    
		}
	});
	btnOrderitems.setBounds(327, 183, 117, 29);
	frame.getContentPane().add(btnOrderitems);
	 
	
	
	btnAdd.addActionListener(new ActionListener() { 
	    public void actionPerformed(ActionEvent e) {
	    String id = text_articleid.getText(); 
	    String Name = articleN.getText(); 
	    
	    double price =Double.parseDouble(articleP.getText()); 
	    
	    System.out.println(id);
	   
	    control.addArticle(id, Name, price);
	    JOptionPane.showMessageDialog(null, "Article Added");
	    
	    
		  
	    } });
	
	   
	  /*  DefaultTableModel dtm=new DefaultTableModel(cols,rows);
	    table_1.setModel(dtm);
	    JScrollPane spn=new JScrollPane();
	    spn.setViewportView( table_1);
	    frame.add(spn)*/
	
	
	
	
	
	/*
	 * table_1.setModel(model); JScrollPane spn=new JScrollPane();
	 * spn.setViewportView( table_1); frame.add(spn);
	 */
	
	JButton btnShow=new JButton("LIST ARTICLES");
	   btnListArticles.addActionListener(new ActionListener() { 
		    public void actionPerformed(ActionEvent e) {
		    int i=0;
		   
		/*
		 * int size=articlereg.getArticlelist().size(); System.out.println(size);
		 * articleList.add(article); for(i=0;i<size;i++) {
		 * System.out.println(articleList.get(i).getId()); } String rows[]=
		 * {"ArticleID","ArticleName","ArticlePrice"};
		 * 
		 * int row = 10, col = 7;s String[][] cols = new String[row][col];
		 * for(i=0;i<size;i++) { cols[row][cols]=
		 * {{article.getId()},{article.getName()},{String.valueOf(article.getPrice())}};
		 * 
		 * }
		 * 
		 * 
		 * ;
		 */
		    
		    ArrayList<Article> articleList = articlereg.printAll();
	                String[] columnNames = { "Article ID", "Article Name", "Article Price" };
	                //Object[][] data = {{}};
	                Object[][] data = new Object[articleList.size()][3];
	                for ( i = 0; i < articleList.size(); i++) {
	                    /*
	                     * articleIDString = articleIDString.concat(articleList.get(i).getId());
	                     * articleNameString = articleNameString.concat(articleList.get(i).getName());
	                     * articlePriceSting =
	                     * articlePriceSting.concat(Double.toString(articleList.get(i).getPrice()));
	                     */
	                    //Object[][] data = {{ articleList.get(i).getId(), articleList.get(i).getName(), Double.toString(articleList.get(i).getPrice()) } };
	                    data[i][0] = articleList.get(i).getId();
	                    data[i][1] = articleList.get(i).getName();
	                    data[i][2] = Double.toString(articleList.get(i).getPrice());
	                    //tableArticle = new JTable(data, columnNames);
	                }
	                    
	                
	                tableArticle = new JTable(data, columnNames);
//	                tableArticle.getTableHeader().setDefaultRenderer(new SimpleHeaderRenderer());
	                 
	                frame.getContentPane().add(new JScrollPane(tableArticle));
	                tableArticle.setBounds(51, 270, 291, 179);
	                frame.getContentPane().add(tableArticle);
		    
		    
	                
			    
		        
		    } });
		   
	
	
    }
}
