package com.novarepotential.View;

import java.awt.EventQueue;
import javax.swing.JFormattedTextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

import com.novarepotential.Register.*;
import com.novarepotential.Model.*;
public class OrderApplication {

    public JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    Controller c;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    OrderApplication window = new OrderApplication();
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
    public OrderApplication() {
	initialize();
	
	
    }
    
    public OrderApplication(String ssn)  {
	
	
	initialize();
	textField_2.setText(ssn);
	
	
	
	
	
	
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblOrdernumber = new JLabel("OrderNumber");
	lblOrdernumber.setBounds(20, 64, 92, 16);
	frame.getContentPane().add(lblOrdernumber);
	
	textField = new JTextField();
	textField.setBounds(136, 54, 130, 26);
	frame.getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblDate = new JLabel("Date");
	lblDate.setBounds(31, 114, 61, 16);
	frame.getContentPane().add(lblDate);
	
	c=new Controller();
	
	JButton btnNewButton = new JButton("ADD ORDER");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		   
		    //OrderLine orderLine=new OrderLine();
		    String orderNumber=textField.getText();
		    int randomNum = 10 + (int)(Math.random() * 20);
		    textField.setText(String.valueOf(randomNum));
		    String date=textField_1.getText();
		    
		    Date  df=new Date(); 
		    SimpleDateFormat ft = new   SimpleDateFormat(" yyyy.MM.dd "); 
	            String reportDate = ft.format(df);
		    textField_1.setText(reportDate);
		    try
		    {
			 
			 df = new SimpleDateFormat(" yyyy.MM.dd ").parse(date);
		    
		    }
		    catch(ParseException x)
		    {
			x.printStackTrace();
		    }
		    
		    Order order=new Order(orderNumber,df);
		    //order.addOrderLine(orderLine);
		    c.createOrder(orderNumber, df);
		    JOptionPane.showMessageDialog(null, "Order Placed");
		    
		   
		    
		    
		}
	});
	btnNewButton.setBounds(39, 142, 117, 29);
	frame.getContentPane().add(btnNewButton);
	
	textField_1 = new JTextField();
	textField_1.setBounds(136, 92, 130, 26);
	frame.getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JButton btnClear = new JButton("Clear");
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    textField.setText("");
		    textField_1.setText("");
		    
		}
	});
	btnClear.setBounds(279, 142, 117, 29);
	frame.getContentPane().add(btnClear);
	
	textField_2 = new JTextField();
	textField_2.setBounds(136, 22, 130, 26);
	frame.getContentPane().add(textField_2);
	textField_2.setColumns(10);
	
	JLabel lblCustomerSsnOr = new JLabel("Customer Ssn or CorparatedId");
	lblCustomerSsnOr.setBounds(20, 27, 104, 16);
	frame.getContentPane().add(lblCustomerSsnOr);
	
	JButton btnNewButton_1 = new JButton("OrderLine");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		    
		    
		    
		    
		}
	});
	btnNewButton_1.setBounds(164, 142, 117, 29);
	frame.getContentPane().add(btnNewButton_1);
	
	
    }
}
