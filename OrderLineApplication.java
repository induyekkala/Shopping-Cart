package com.novarepotential.View;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Color;
import java.awt.EventQueue;
import com.novarepotential.Register.*;
import com.novarepotential.Model.*;
import com.novarepotential.View.ArticleApplication;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class OrderLineApplication {

    public JFrame frame1;
    public  JTextField textFeield;
    private JTextField textField_3;
    private JTable table;
    String articleId;
    Controller c;
    private JButton btnPlaceOrder;
    private JButton btnListOrder;
    private JLabel lblQuantity;
    private JTextField textField_5;
    private Order order ;
    private Article article ;
    private ArrayList<Article> articleList ;
    private ArticleReg articlereg ;
    private JTextField textField_4;
    private JTextField textField_6;
    private OrderLine orderLine ;
    private JComboBox comboBox;
    private CustomerReg customerReg; 
    private JLabel lblOrdrApplication;
    String orderNumber;
    String date;
    Date df = new Date();
    private JLabel lblCustomerSsnOr;
    public JTextField textField_1;
    private JFrame frame;
    private JButton btnGenearteInvoice;
    private JButton button;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    OrderLineApplication window = new OrderLineApplication();
		    window.frame1.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public OrderLineApplication() {
	initialize();

    }

    /*
     * public OrderLineApplication(String OrderNumber,String date) { initialize();
     * 
     * textField.setText(OrderNumber); textField_6.setText(date); }
     */

    

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	
	 frame = new JFrame();
	     customerReg=new CustomerReg();
	     article = new Article();
	     articleList = new ArrayList<Article>();
	     articlereg = new ArticleReg();
	     order = new Order();
	      orderLine = new OrderLine();
	     
	frame1 = new JFrame();
	frame1.setBounds(100, 100, 682, 446);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame1.getContentPane().setLayout(null);

	frame1.getContentPane().setBackground( Color.lightGray);
	btnPlaceOrder = new JButton("Order Placed");
	c = new Controller( order, customerReg, articlereg, frame1);

	JLabel lblOrdernumber = new JLabel("OrderNumber");
	lblOrdernumber.setBounds(31, 124, 94, 16);
	frame1.getContentPane().add(lblOrdernumber);

	textFeield = new JTextField();
	textFeield.setEnabled(false);
	textFeield.setEditable(false);
	textFeield.setBounds(150, 119, 130, 26);
	frame1.getContentPane().add(textFeield);
	textFeield.setColumns(10);

	JLabel lblAtricleId = new JLabel("Article ID");
	lblAtricleId.setBounds(41, 209, 61, 16);
	frame1.getContentPane().add(lblAtricleId);

	JLabel lblArticleName = new JLabel("Article Name");
	lblArticleName.setBounds(31, 254, 84, 16);
	frame1.getContentPane().add(lblArticleName);

	textField_3 = new JTextField();
	textField_3.setBounds(150, 249, 130, 26);
	frame1.getContentPane().add(textField_3);
	textField_3.setColumns(10);

	 
	 
	  String articleId[]=new String[] {"1","2","3","4","5","6","7","8","9","10"};
	   comboBox = new JComboBox(articleId); comboBox.setBounds(150, 205,
	  130, 27);
	  frame1.getContentPane().add(comboBox);

	
	  comboBox.addActionListener(new ActionListener() { 
	      public void
	  actionPerformed(ActionEvent event) { 
	  
	  comboBox = (JComboBox) event.getSource();
	  
	  Object selected = comboBox.getSelectedItem();
	  if(selected.toString().equals("1")) textField_3.setText("Pen");
	  textField_4.setText(String.valueOf(40));
	  
	  if(selected.toString().equals("2")) textField_3.setText("Pencil");
	  textField_4.setText(String.valueOf(20));
	  
	  if(selected.toString().equals("3")) textField_3.setText("Box");
	  textField_4.setText(String.valueOf(25));
	  
	  if(selected.toString().equals("4")) textField_3.setText("Eraser");
	  textField_4.setText(String.valueOf(15));
	  
	  if(selected.toString().equals("5")) textField_3.setText("Bottle");
	  textField_4.setText(String.valueOf(50));
	  
	  if(selected.toString().equals("6")) textField_3.setText("Sharpener");
	  textField_4.setText(String.valueOf(20));
	  
	  if(selected.toString().equals("7")) textField_3.setText("Toys");
	  textField_4.setText(String.valueOf(100));
	  
	  if(selected.toString().equals("8")) textField_3.setText("Shoes");
	  textField_4.setText(String.valueOf(100));
	  
	  if(selected.toString().equals("9")) textField_3.setText("colour pencil");
	  textField_4.setText(String.valueOf(30));
	  
	  if(selected.toString().equals("10")) textField_3.setText("crayons");
	  textField_4.setText(String.valueOf(20));
	  
	  int randomNum = 10 + (int)(Math.random() * 20);
	    textFeield.setText(String.valueOf(randomNum));
	  
	// date = textField_6.getText();

	Date dNow = new Date();
	SimpleDateFormat ft = new SimpleDateFormat(" yyyy.MM.dd ");
	String reportDate = ft.format(dNow);
	
	textField_6.setText(reportDate);
	
	
	
	try {

	    df = new SimpleDateFormat(" yyyy.MM.dd ").parse(reportDate);
//	    String reportDate = ft.format(dNow);
	     textField_1.setText(reportDate);
	} catch (ParseException x) {
	    x.printStackTrace();
	}
	       
	  
	  } }); frame1.getContentPane().add(comboBox);
	  
	 

	btnPlaceOrder.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		
		
		orderNumber=textFeield.getText();
		System.out.println("Ordernumber: " + orderNumber);
	        		 

//		     articleId= textField_2.getText();

//		   comboBox = (JComboBox)event

		
		  System.out.println(articleId); int i=0;
		  
		  String articleName=textField_3.getText(); System.out.println(articleName);
		  double price=Double.parseDouble(textField_4.getText());
		  System.out.println(price);
		 
		int Quantity = Integer.parseInt(textField_5.getText());
		System.out.println(Quantity);
		
		String value = comboBox.getSelectedItem().toString();
		article=new Article(value,articleName,price);
		
			
		
		c.createOrder(orderNumber,df,orderLine);
		
		c.addOrderLines(article, Quantity);
		
		
		

		JOptionPane.showMessageDialog(null, "Order Created");
		
		
	    }
	    
	});
	btnPlaceOrder.setBounds(31, 367, 117, 29);
	frame1.getContentPane().add(btnPlaceOrder);

	btnListOrder = new JButton("LIST ORDER");
	btnListOrder.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		
		
		int i=0;
		List<OrderLine> orderLinesList = c.listOrderLines();
		System.out.println("size" + orderLinesList.size());
		
		
		System.out.println(order.getOrderLine().get(i).getArticle().getId());
		System.out.println(order.getOrderLine().get(i).getArticle().getName());
		System.out.println(order.getOrderLine().get(i).getArticle().getPrice());
//		System.out.println("ordernumber"+order.getOrderLine().get(i).getOrder().getOrderNumber());
		
		
	
		
		if (orderLinesList.size() > 0) {
		    String[] columnNames = { "OrderNumber", "Date", "ArticleId", "ArticleName", "Price", "Qunatity",
			    "Total Price" };
		    frame1.getContentPane().setLayout(null);
		    try
		    {
		    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		    Object[][] data = new Object[orderLinesList.size()][7];
		    for ( i = 0; i < orderLinesList.size(); i++) {

//			data[i][0] = orderLinesList.get(i).getOrder().getOrderNumber();
			System.out.println(data[i][0]);
//			data[i][1] = dateFormat.format((orderLinesList.get(i).getOrder().getDate()));
			data[i][2] = orderLinesList.get(i).getArticle().getId();
			data[i][3] = orderLinesList.get(i).getArticle().getName();
			data[i][4] = orderLinesList.get(i).getArticle().getPrice();
			data[i][5] = orderLinesList.get(i).getQuantity();
			double total_price = orderLinesList.get(i).getArticle().getPrice()
				* orderLinesList.get(i).getQuantity();
			data[i][6] = total_price;
			table = new JTable(data, columnNames);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(250, 450, 600, 150);
			frame1.getContentPane().add(scrollPane);
			// table.setBounds(230,300, 400, 150); //table.setBounds(x,y,width,height) x is
			// to move table up and down , y is for table to move right or left
			// frmCustomer.getContentPane().add(table);
			
			
			table.setEnabled(false);
		    }
		    }
		    catch(Exception x)
		    {
			x.printStackTrace();
		    }
		    
		} else {
		    JOptionPane.showMessageDialog(null, "No Customer records");
		}
		

	    }

		
	    });
	btnListOrder.setBounds(150, 367, 117, 29);
	frame1.getContentPane().add(btnListOrder);

	lblQuantity = new JLabel("Quantity");
	lblQuantity.setBounds(41, 339, 74, 16);
	frame1.getContentPane().add(lblQuantity);

	textField_5 = new JTextField();
	textField_5.setBounds(150, 329, 130, 26);
	frame1.getContentPane().add(textField_5);
	textField_5.setColumns(10);

	JLabel lblPrice = new JLabel("Price");
	lblPrice.setBounds(54, 296, 61, 16);
	frame1.getContentPane().add(lblPrice);

	textField_4 = new JTextField();
	textField_4.setBounds(150, 291, 130, 26);
	frame1.getContentPane().add(textField_4);
	textField_4.setColumns(10);

	JLabel lblNewLabel = new JLabel("Date");
	lblNewLabel.setBounds(54, 169, 61, 16);
	frame1.getContentPane().add(lblNewLabel);

	textField_6 = new JTextField();
	textField_6.setEnabled(false);
	textField_6.setEditable(false);
	textField_6.setBounds(150, 164, 130, 26);
	frame1.getContentPane().add(textField_6);
	textField_6.setColumns(10);
	 lblCustomerSsnOr = new JLabel("Customer Ssn or CorporateId");
         lblCustomerSsnOr.setBounds(17, 75, 129, 16);
         frame1.getContentPane().add(lblCustomerSsnOr);
         
         textField_1 = new JTextField();
         textField_1.setBounds(150, 70, 130, 26);
         frame1.getContentPane().add(textField_1);
         textField_1.setColumns(10);
         
         lblOrdrApplication = new JLabel("Order Application");
         lblOrdrApplication.setBounds(78, 34, 173, 22);
         frame1.getContentPane().add(lblOrdrApplication);
         
         JLabel lblListOfArticles = new JLabel("List Of Articles");
         lblListOfArticles.setBounds(405, 56, 130, 16);
         frame1.getContentPane().add(lblListOfArticles);
         
	
        
         
	JTextArea textArea = new JTextArea(1000, 1000);
	textArea.setEnabled(false);
	textArea.setEditable(false);
	textArea.setBounds(304, 87, 361, 268);
	textArea.requestFocus();
	frame1.getContentPane().add(textArea);
	
	textArea.setColumns(3);
	textArea.setRows(10);
	
	
	textArea.setLineWrap(true);
	textArea.setWrapStyleWord(true);
	
	try
	{
    
    FileReader reader = new FileReader( "/Users/induyekkala/eclipse-workspace/MyProject/src/com/novarepotential/Model/Article.txt" );
    BufferedReader br = new BufferedReader(reader);
    textArea.read( br, null );
    br.close();
    textArea.requestFocus();
	}
	catch(Exception x) {
	    x.printStackTrace();
	}
	
	try
        {
            FileWriter writer = new FileWriter( "MyProject/src/com/novarepotential/Model/Article.txt");
            BufferedWriter bw = new BufferedWriter( writer );
            textArea.write( bw );
            bw.close();
            textArea.setText("");
            
            button = new JButton("New button");
            button.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            	    
            	    
            	    
            	    
            	    
            	    
            	    
            	    
            	}
            });
            button.setBounds(366, 367, 117, 29);
            frame1.getContentPane().add(button);
                   
           
        }
        catch(Exception e2) {}
	
	 
	
	

    }
}
