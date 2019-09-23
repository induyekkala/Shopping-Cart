package com.novarepotential.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JList;

public class SupplierApplication {

    public JFrame frame;
    private JTextField textField;
    private JTextField txtDealer;
    public JList list_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    SupplierApplication window = new SupplierApplication();
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
    public SupplierApplication() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.getContentPane().setEnabled(false);
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblSuppierId = new JLabel("Suppöier Id");
	lblSuppierId.setBounds(87, 30, 90, 16);
	frame.getContentPane().add(lblSuppierId);
	
	JLabel lblSupplierName = new JLabel("Supplier Name");
	lblSupplierName.setBounds(87, 69, 101, 16);
	frame.getContentPane().add(lblSupplierName);
	
	JLabel lblOrderNumber = new JLabel("order Number");
	lblOrderNumber.setBounds(87, 97, 101, 16);
	frame.getContentPane().add(lblOrderNumber);
	
	JLabel lblArticleNames = new JLabel("Article Names");
	lblArticleNames.setBounds(87, 138, 90, 16);
	frame.getContentPane().add(lblArticleNames);
	
	JLabel lblTotalCost = new JLabel("Total Cost");
	lblTotalCost.setBounds(99, 188, 65, 16);
	frame.getContentPane().add(lblTotalCost);
	
	JLabel lblNewLabel_4 = new JLabel("New label");
	lblNewLabel_4.setEnabled(false);
	lblNewLabel_4.setBounds(217, 188, 61, 16);
	frame.getContentPane().add(lblNewLabel_4);
	 
	textField = new JTextField();
	textField.setEnabled(false);
	textField.setEditable(false);
	textField.setText("101");
	textField.setBounds(189, 25, 130, 26);
	frame.getContentPane().add(textField);
	textField.setColumns(10);
	
	txtDealer = new JTextField();
	txtDealer.setEnabled(false);
	txtDealer.setEditable(false);
	txtDealer.setText("Dealer");
	txtDealer.setBounds(199, 64, 130, 26);
	frame.getContentPane().add(txtDealer);
	txtDealer.setColumns(10);
	
	
	 list_1 = new JList();
	list_1.setBounds(234, 121, 1, 1);
	frame.getContentPane().add(list_1);
	
	
    }
}
