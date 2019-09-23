package com.novarepotential.View;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import com.novarepotential.Register.*;
import com.novarepotential.Model.*;
public class CustomerApplication {

    public JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private CustomerReg customerReg;
    public JTextField textField_2;
    private Customer cust;
    private Order order = new Order();
    private Article article = new Article();
    private ArrayList<Article> articleList = new ArrayList<Article>();
    private ArticleReg articlereg = new ArticleReg();
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private OrderLine orderLine = new OrderLine();
    public  Controller control;
    private PrivateCustomer privateCustomer=new PrivateCustomer();
    private CompanyCustomer companyCustomer=new CompanyCustomer();
    private JTable table;
    public String ssn;
    public String corporateId;
    private JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    CustomerApplication window = new CustomerApplication();
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
    public CustomerApplication() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 519, 520);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	frame.getContentPane().setBackground(Color.lightGray);
	customerReg=new CustomerReg();
	
	     article = new Article();
	     articleList = new ArrayList<Article>();
	     articlereg = new ArticleReg();
	     order = new Order();
	      orderLine = new OrderLine();
	     
	      control=new Controller();
	
	control = new Controller( order, customerReg, articlereg, frame);
	
	JLabel lblNewLabel = new JLabel("CustomerName");
	lblNewLabel.setBounds(6, 45, 134, 16);
	frame.getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(152, 40, 130, 26);
	frame.getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("CustomerAddress");
	lblNewLabel_1.setBounds(6, 77, 116, 16);
	frame.getContentPane().add(lblNewLabel_1);
	
	textField_1 = new JTextField();
	textField_1.setBounds(152, 72, 130, 26);
	frame.getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_3 = new JLabel("PhoneNO");
	lblNewLabel_3.setBounds(28, 128, 61, 16);
	frame.getContentPane().add(lblNewLabel_3);
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Private Customer");
	buttonGroup.add(rdbtnNewRadioButton);
	rdbtnNewRadioButton.setBounds(125, 189, 157, 23);
	frame.getContentPane().add(rdbtnNewRadioButton);
	
	JRadioButton rdbtnComapanyCustomer = new JRadioButton("Comapany Customer");
	buttonGroup.add(rdbtnComapanyCustomer);
	rdbtnComapanyCustomer.setBounds(125, 220, 141, 23);
	frame.getContentPane().add(rdbtnComapanyCustomer);
	
	textField_2 = new JTextField();
	textField_2.setBounds(152, 166, 130, 26);
	frame.getContentPane().add(textField_2);
	textField_2.setColumns(10);
	JButton btnAdd = new JButton("ADD");
	btnAdd.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		    String customerName=textField.getText();
		    System.out.println(customerName);
		    String customerAddress=textField_1.getText();
		    System.out.println(customerAddress);
		    String customerPhoneNumber=textField_3.getText();
		    System.out.println(customerPhoneNumber);
		    String typecustomer=rdbtnComapanyCustomer.getText();
		    //String type=typecustomer.toString();
		    System.out.println(typecustomer);
		    
		        
			//PrivateCustomer privatecustomer=new PrivateCustomer(customerName,customerAddress,customerPhoneNumber);
			//CompanyCustomer companycustomer=new CompanyCustomer(customerName,customerAddress,customerPhoneNumber);
			
			
			
			if (rdbtnNewRadioButton.isSelected()){
			    
			     ssn=textField_2.getText();
			    System.out.println(ssn);
		    
		     privateCustomer=new
		      PrivateCustomer(customerName,customerAddress,customerPhoneNumber,ssn);
		    
		      cust=privateCustomer ;
		      System.out.println(cust.getName());
		     
		      control.addCustomer(cust);
		      System.out.println(cust.getName());
				
		            
		        }else{
		            
		             corporateId=textField_2.getText();
		            System.out.println(corporateId);
		          
		    
		     companyCustomer=new   CompanyCustomer(customerName,customerAddress,customerPhoneNumber,corporateId)
		      ; 
		     cust=companyCustomer;
		     
		            control.addCustomer(cust);
		            
		           
		         	
		         	
		         	
		            
		        }
			
			 if(textField_1.getText().isEmpty() || textField.getText().isEmpty() || textField_2.getText().isEmpty() || textField_3.getText().isEmpty())
			    	{
			    	    JOptionPane.showMessageDialog(null, "All field need to be entered");
			    	    
			    	}
			 else
			 {
			     JOptionPane.showMessageDialog(null, "Customer Added to the records");
			 }
			
		    
		    
		}
	});
	btnAdd.setBounds(49, 273, 117, 29);
	frame.getContentPane().add(btnAdd);
	
	
	
	
	
	JButton btnFind = new JButton("Find");
	btnFind.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		/*
		 * String customerName=textField.getText();
		 * cust=control.findCustomer(customerName); PrivateCustomer privatecustomer=new
		 * PrivateCustomer(); CompanyCustomer companycustomer=new CompanyCustomer();
		 * 
		 * 
		 * 
		 * int i=0; // System.out.println(getCustomers().size());
		 * while(i<(customerReg.getCustomers().size()))
		 * 
		 * { cust=privatecustomer; cust=control.findCustomer(customerName);
		 * if(cust.getName().equals(customerName))
		 * 
		 * 
		 * JOptionPane.showMessageDialog(null, "Customer Found in the Records"); else
		 * 
		 * JOptionPane.showMessageDialog(null, "Customer not Found in the Records");
		 * i++; }
		 */
		    Iterator iterator = customerReg.getCustomers().iterator();
	                String custName = textField.getText();
	                System.out.println("customerList.size() :"+customerReg.getCustomers().size());
	                for(Customer customer:customerReg.getCustomers())
	                {
	                if (custName != "") {
	                    ArrayList<Customer> customerList = control.listCustomer();
	                    if (customerList.size() > 0) {
	                       
	                     
	                            if (customer.getName().equals(custName)) {
	                                JOptionPane.showMessageDialog(null, "Customer exists...");
	                                break;
	                            } else {
	                                JOptionPane.showMessageDialog(null, "Customer does not exists !!!");
	                                break;
	                            }
	                        }
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Customer List is empty");
	                    }
	                }
		
		    
		    
		    
		    
		}
		});
	btnFind.setBounds(49, 316, 117, 29);
	frame.getContentPane().add(btnFind);
	
	JLabel lblEnterSsnOr = new JLabel("Enter Ssn or CorpateId");
	lblEnterSsnOr.setBounds(6, 171, 166, 16);
	frame.getContentPane().add(lblEnterSsnOr);
	
	JLabel lblCustomerDetails = new JLabel("CUSTOMER DETAILS");
	lblCustomerDetails.setBounds(162, 6, 156, 16);
	frame.getContentPane().add(lblCustomerDetails);
	
	JButton btnNewButton = new JButton("Remove");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		    
		    String customerName=textField.getText();
		    control.removeCustomer(customerName);
		    JOptionPane.showMessageDialog(null, "Customer Removed");
		    
		    
		}
	});
	btnNewButton.setBounds(49, 357, 117, 29);
	frame.getContentPane().add(btnNewButton);
	
	JButton btnClearFields = new JButton("CLear Fields");
	btnClearFields.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		    textField.setText("");
		    textField_1.setText("");
		    textField_2.setText("");
		    
		    textField_3.setText("");
		  
		    
		    
		    
		}
	});
	btnClearFields.setBounds(49, 412, 117, 29);
	frame.getContentPane().add(btnClearFields);
	
	JButton btnPlaceOrder = new JButton("PLACE ORDER");
	btnPlaceOrder.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		     
			   
		    OrderLineApplication window = new OrderLineApplication();
		    
			    
			    ssn=textField_2.getText();
			    
			    window.textField_1.setText(ssn);
			    window.frame1.setVisible(true);
			   	        
		    
		}
	});
	btnPlaceOrder.setBounds(339, 412, 117, 29);
	frame.getContentPane().add(btnPlaceOrder);
	
	JButton btnListCustomers = new JButton("List Customers");
	btnListCustomers.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    
		    ArrayList<Customer> customerList = control.listCustomer();
	                System.out.println("size"+customerList.size());
	            if(customerList.size() > 0) {
	                String[] columnNames = { "Name", "Address", "Phone","SSN or CorporateId","Customer Type" };
	                frame.getContentPane().setLayout(null);
	                Object[][] data = new Object[customerList.size()][5];
	                for (int i = 0; i < customerList.size(); i++) {
	                    data[i][0] = customerList.get(i).getName();
	                    data[i][1] = customerList.get(i).getAddress();
	                    data[i][2] = customerList.get(i).getPhoneNumber();
	                    
	                    String tmpName = customerList.get(i).getClass().getName();
	                    String className = tmpName.substring((tmpName.indexOf('.')+1),tmpName.length()); 
	                    System.out.println(className.toString());
	                 
	                    if(className.equals("novarepotential.Model.PrivateCustomer")) {
	                        PrivateCustomer tmpCust = (PrivateCustomer)customerList.get(i);
	                        data[i][3] = tmpCust.getSocialSecurityNumber();
	                        data[i][4] = "Private";
	                    }
	                    if(className.equals("novarepotential.Model.CompanyCustomer")) {
	                        CompanyCustomer tmpCust = (CompanyCustomer)customerList.get(i);
	                        data[i][3] = tmpCust.getCorprorateId();
	                        data[i][4] = "Company";
	                    }
	                }
	                table = new JTable(data, columnNames);
	                JScrollPane scrollPane = new JScrollPane(table);
	                scrollPane.setBounds(300,512,800,150);
	                frame.getContentPane().add(scrollPane);
	                
	                control.listCustomer();
	            }else {
	                JOptionPane.showMessageDialog(null, "No Customer records");
	            }
	            table.setEnabled(false);
		    
		    
		}
	});
	btnListCustomers.setBounds(188, 412, 130, 29);
	frame.getContentPane().add(btnListCustomers);
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane.setBounds(297, 1, 21, 21);
	frame.getContentPane().add(tabbedPane);
	
	JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
	tabbedPane_1.setBounds(313, 1, 21, 21);
	frame.getContentPane().add(tabbedPane_1);
	
	JLabel lblEnterCustomerName = new JLabel("Enter Customer Name");
	lblEnterCustomerName.setBounds(178, 326, 166, 16);
	frame.getContentPane().add(lblEnterCustomerName);
	
	textField_3 = new JTextField();
	
	
	    
    
	     
	    
	
	
	
	textField_3.setBounds(152, 110, 130, 26);
	frame.getContentPane().add(textField_3);
	textField_3.setColumns(10);
	
	
    }
	}
    

