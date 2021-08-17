/*
* ProductGUI class is the main class to which MicrosoftProduct and EnterpriseEdition class are connected and their methods
and attributes will be used in this class to store GUI inputs to their attributes.
* This class will result a GUI frame that will be the User Interface in which user can interact with the forms and components for microsoft product details.
* Author: Susan Shrestha
*/

//importing all awt and swing components for GUI design
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.SystemColor;

public class ProductGUI extends JFrame { //extending JFrame for creating application window frame
    private JPanel contentPane; //creating panel for adding components
    //creating textfields
    private JTextField tfProductNo;
    private JTextField tfProductName;
    private JTextField tfTotalPrice;
    private JTextField tfClientCompanyName;
    private JTextField tfLicenseActivationDate;
    private JTextField tfLicenseExpireDate;
    private JTextField tfActivationKey;
    private JTextField tfNumOfUsers;
    private JTextField tfPricePerUser;
    private JTextField tfStatus;   
    private JTextField tfProductNo2;

    public static void main(String[] args) { //main method from where the execution starts
        //initializing frame and making GUI visible to the user
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProductGUI frame = new ProductGUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /*
     * In this method, all the designs are made i.e components are added and structured to make
       the user easily understand and use the application.   
     */
    public ProductGUI() {
        setResizable(false);
        setTitle("Microsoft Product Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 635, 498);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    
        JLabel lblProductNo1 = new JLabel("Product Number:");
        lblProductNo1.setFont(new Font("Arial", Font.PLAIN, 13));
        lblProductNo1.setBounds(20, 32, 148, 14);
        contentPane.add(lblProductNo1);
    
        tfProductNo = new JTextField();
        tfProductNo.setFont(new Font("Arial", Font.PLAIN, 13));
        tfProductNo.setBounds(168, 27, 236, 26);
        contentPane.add(tfProductNo);
        tfProductNo.setColumns(10);
    
        JLabel lblProductName = new JLabel("Product Name:");
        lblProductName.setFont(new Font("Arial", Font.PLAIN, 13));
        lblProductName.setBounds(20, 71, 148, 14);
        contentPane.add(lblProductName);
    
        JLabel lblTotalPrice = new JLabel("Total Price:");
        lblTotalPrice.setFont(new Font("Arial", Font.PLAIN, 13));
        lblTotalPrice.setBounds(20, 399, 148, 14);
        contentPane.add(lblTotalPrice);
    
        tfProductName = new JTextField();
        tfProductName.setFont(new Font("Arial", Font.PLAIN, 13));
        tfProductName.setBounds(168, 66, 236, 26);
        contentPane.add(tfProductName);
        tfProductName.setColumns(10);
    
        tfTotalPrice = new JTextField();
        tfTotalPrice.setEditable(false);
        tfTotalPrice.setFont(new Font("Arial", Font.PLAIN, 13));
        tfTotalPrice.setBounds(168, 394, 236, 26);
        contentPane.add(tfTotalPrice);
        tfTotalPrice.setColumns(10);
    
        JLabel lblClientCompanyName = new JLabel("Client Company Name:");
        lblClientCompanyName.setFont(new Font("Arial", Font.PLAIN, 13));
        lblClientCompanyName.setBounds(20, 246, 148, 21);
        contentPane.add(lblClientCompanyName);
    
        JLabel lblLicenseActivationDate = new JLabel("License Activation Date:");
        lblLicenseActivationDate.setFont(new Font("Arial", Font.PLAIN, 13));
        lblLicenseActivationDate.setBounds(20, 288, 148, 14);
        contentPane.add(lblLicenseActivationDate);
    
        JLabel lblLicenseExpireDate = new JLabel("License Expire Date:");
        lblLicenseExpireDate.setFont(new Font("Arial", Font.PLAIN, 13));
        lblLicenseExpireDate.setBounds(20, 325, 148, 14);
        contentPane.add(lblLicenseExpireDate);
    
        JLabel lblActivationKey = new JLabel("Activation Key:");
        lblActivationKey.setFont(new Font("Arial", Font.PLAIN, 13));
        lblActivationKey.setBounds(20, 362, 148, 14);
        contentPane.add(lblActivationKey);
    
        JLabel lblNumOfUser = new JLabel("Number of Users:");
        lblNumOfUser.setFont(new Font("Arial", Font.PLAIN, 13));
        lblNumOfUser.setBounds(20, 209, 148, 14);
        contentPane.add(lblNumOfUser);
    
        JLabel lblPricePerUser = new JLabel("Price/User:");
        lblPricePerUser.setFont(new Font("Arial", Font.PLAIN, 13));
        lblPricePerUser.setBounds(20, 108, 148, 14);
        contentPane.add(lblPricePerUser);
    
        tfClientCompanyName = new JTextField();
        tfClientCompanyName.setFont(new Font("Arial", Font.PLAIN, 13));
        tfClientCompanyName.setBounds(168, 244, 236, 26);
        contentPane.add(tfClientCompanyName);
        tfClientCompanyName.setColumns(10);
    
        tfLicenseActivationDate = new JTextField();
        tfLicenseActivationDate.setFont(new Font("Arial", Font.PLAIN, 13));
        tfLicenseActivationDate.setBounds(168, 283, 236, 26);
        contentPane.add(tfLicenseActivationDate);
        tfLicenseActivationDate.setColumns(10);
    
        tfLicenseExpireDate = new JTextField();
        tfLicenseExpireDate.setFont(new Font("Arial", Font.PLAIN, 13));
        tfLicenseExpireDate.setBounds(168, 320, 236, 26);
        contentPane.add(tfLicenseExpireDate);
        tfLicenseExpireDate.setColumns(10);
    
        tfActivationKey = new JTextField();
        tfActivationKey.setFont(new Font("Arial", Font.PLAIN, 13));
        tfActivationKey.setBounds(168, 357, 236, 26);
        contentPane.add(tfActivationKey);
        tfActivationKey.setColumns(10);
    
        tfNumOfUsers = new JTextField();
        tfNumOfUsers.setFont(new Font("Arial", Font.PLAIN, 13));
        tfNumOfUsers.setBounds(168, 204, 236, 26);
        contentPane.add(tfNumOfUsers);
        tfNumOfUsers.setColumns(10);
    
        tfPricePerUser = new JTextField();
        tfPricePerUser.setFont(new Font("Arial", Font.PLAIN, 13));
        tfPricePerUser.setBounds(168, 103, 236, 26);
        contentPane.add(tfPricePerUser);
        tfPricePerUser.setColumns(10);
    
        JButton btnAddProduct = new JButton("Add Product");
        btnAddProduct.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });
        btnAddProduct.setFont(new Font("Arial", Font.BOLD, 13));
    
        btnAddProduct.setBounds(424, 32, 180, 39);
        contentPane.add(btnAddProduct);
    
        JButton btnActivateLicense = new JButton("Activate License");
        btnActivateLicense.setFont(new Font("Arial", Font.BOLD, 13));
        btnActivateLicense.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    activate();
            }
        });
        btnActivateLicense.setBounds(424, 163, 180, 39);
        contentPane.add(btnActivateLicense);
    
        JButton btnTerminateLicense = new JButton("Terminate License");
        btnTerminateLicense.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                terminate();
            }
        });
        btnTerminateLicense.setFont(new Font("Arial", Font.BOLD, 13));
        btnTerminateLicense.setBounds(424, 218, 180, 39);
        contentPane.add(btnTerminateLicense);
    
        JButton btnSetPricePerUser = new JButton("Set Product Price/User");
        btnSetPricePerUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setPricePerUser();
            }
        });
        btnSetPricePerUser.setFont(new Font("Arial", Font.BOLD, 13));
        btnSetPricePerUser.setBounds(424, 82, 180, 39);
        contentPane.add(btnSetPricePerUser);
    
        JButton btnDisplay = new JButton("Display");
        btnDisplay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display();
            }
        });
        btnDisplay.setFont(new Font("Arial", Font.BOLD, 13));
        btnDisplay.setBounds(424, 273, 180, 37);
        contentPane.add(btnDisplay);
    
        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                clear();
            }
        });
        btnClear.setFont(new Font("Arial", Font.BOLD, 13));
        btnClear.setBounds(424, 328, 180, 37);
        contentPane.add(btnClear);
    
        JLabel lbStatus = new JLabel("Status:");
        lbStatus.setFont(new Font("Arial", Font.BOLD, 12));
        lbStatus.setBounds(0, 435, 49, 25);
        contentPane.add(lbStatus);
    
        tfStatus = new JTextField();
        tfStatus.setFont(new Font("Arial", Font.PLAIN, 12));
        tfStatus.setText("Welcome...");
        tfStatus.setEditable(false);
        tfStatus.setBounds(47, 437, 582, 20);
        contentPane.add(tfStatus);
        tfStatus.setColumns(10);
    
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        btnExit.setForeground(Color.RED);
        btnExit.setFont(new Font("Arial", Font.BOLD, 13));
        btnExit.setBounds(424, 383, 180, 37);
        contentPane.add(btnExit);
        
        JLabel lblProductNo2 = new JLabel("Product Number:");
        lblProductNo2.setFont(new Font("Arial", Font.PLAIN, 13));
        lblProductNo2.setBounds(20, 177, 148, 14);
        contentPane.add(lblProductNo2);
        
        tfProductNo2 = new JTextField();
        tfProductNo2.setFont(new Font("Arial", Font.PLAIN, 13));
        tfProductNo2.setBounds(168, 167, 236, 26);
        contentPane.add(tfProductNo2);
        tfProductNo2.setColumns(10);
        
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.controlHighlight);
        panel.setBounds(10, 11, 609, 134);
        contentPane.add(panel);
    }

    //Creating Arraylist of MicrosoftProduct class
    ArrayList<MicrosoftProduct> productList =new ArrayList<>();

    //method to add product in the arraylist
    private void addProduct() {
        //storing user input in variables of type String
        String strProductNumber = tfProductNo.getText();
        String strProductName = tfProductName.getText();
        String strPricePerUser = tfPricePerUser.getText();
        int productNo,pricePerUser;
        //checking if field are empty or not
        if(strProductNumber.trim().equals("") || strProductName.trim().equals("") || strPricePerUser.trim().equals("")) {
            JOptionPane.showMessageDialog(contentPane,"Please fill all the forms","Error" ,0);
        }
        else {
            try {
                //converting String to integer type
                productNo = Integer.parseInt(strProductNumber);
                pricePerUser = Integer.parseInt(strPricePerUser);
            }
            //exception handling if invalid input is given by user and to continue the program instead of crashing
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(contentPane,"Please check your input format and try again" ,"Error", 0);
                return;
            }
            //for-each loop for checking if the product entered by the user is already in the list or not
            for(MicrosoftProduct mp : productList) {
                if (mp instanceof EnterpriseEdition) {
                    EnterpriseEdition ee = (EnterpriseEdition)mp; //class casting; storing object of superclass Microsoft product in subclass EnterpriseEdition
                    if(ee.getProductNo() == productNo) {
                        JOptionPane.showMessageDialog(contentPane,"This product is already added!", "Error" ,0);
                        return;
                    }
                }
            }
            
            EnterpriseEdition eeList = new EnterpriseEdition(productNo,strProductName,pricePerUser);//passing user input values to constructor of EnterpriseEdition class
            productList.add(eeList);//adds input values to arraylist of MicrosoftProduct
            String eeDetails =
                "Product Number: " + productNo +
                "\n Product Name: " + strProductName +
                "\n Price Per User: " +pricePerUser;
            JOptionPane.showMessageDialog(contentPane, eeDetails, "Product sucessfully added." , (1)); //Displays product added
            tfStatus.setText("Product " + strProductName + " added to the list.");    
        }
    }

    //method to activate the License of product that are stored in the arraylist
    private void activate() {
        //storing user input in variables of type String
        String productNumber = tfProductNo2.getText();
        String numOfUser = tfNumOfUsers.getText();
        String clientCompanyName = tfClientCompanyName.getText();
        String licenseActivationDate = tfLicenseActivationDate.getText();
        String licenseExpireDate = tfLicenseExpireDate.getText();
        String activationKey = tfActivationKey.getText();
        int productNo,noOfUser;
        //checking if field are empty or not
        if(productNumber.trim().equals("") || numOfUser.trim().equals("") || clientCompanyName.trim().equals("") || licenseActivationDate.trim().equals("")|| 
        licenseExpireDate.trim().equals("") || activationKey.trim().equals("")) {
            JOptionPane.showMessageDialog(contentPane,"Please fill all the fields.","Error",0);
        }
        else {
            try {
                //converting String to integer type
                productNo = Integer.parseInt(productNumber);
                noOfUser = Integer.parseInt(numOfUser); 
            }
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(contentPane,"Please check your input format and try again.", "Error",0);
                return;
            }
            boolean flag = false;
            for(int i = 0; i < productList.size(); ++i) { //loop continues till the size of arraylist
                MicrosoftProduct mp = productList.get(i);
                if(mp instanceof EnterpriseEdition) {
                    EnterpriseEdition ee = (EnterpriseEdition)mp; //class casting
                    if(ee.getProductNo() == productNo) { //checking if the entered product number is already in the list or not
                        flag= true;
                        if(ee.getIsActivated() == true) { //checking if the entered product number is already activated or not
                            JOptionPane.showMessageDialog(contentPane,"The product is already activated.","info!",2);
                        }
                        /*if the product number is not activated, it will activate license by calling the activateLicense method of class EnterpriseEdition
                          and passing the user input details as parameter in activateLicense method.
                        */
                        else {
                            ee.activateLicense(clientCompanyName,noOfUser, licenseActivationDate, licenseExpireDate, activationKey);
                            JOptionPane.showMessageDialog(contentPane,"Product activated sucessfully.","Congratulations",1);
                            int totalPrice = ee.getPrice(); //retrieving total price of the product from class EnterpriseEdition
                            String strTP = String.valueOf(totalPrice);
                            tfTotalPrice.setText(strTP);
                            tfStatus.setText("Product activation done.");
                            break;
                        }
                    }
                }
            }
            if(flag == false) { //if entered product not in the list
                JOptionPane.showMessageDialog(contentPane,"Product is not added, please add the product first.", "info" ,1);
            }
        }
    }
    
    //method to terminate the product License
    private void terminate() {
        int productNo;
        //asks user to input product number to terminate the license
        String strProductNo = JOptionPane.showInputDialog(contentPane, "Enter the Product Number to terminate the license.","Terminate License",3);
        try {
            if(strProductNo.trim().equals("")) {
                JOptionPane.showMessageDialog(contentPane,"Please Enter the Product Number.","info",1);
                return;
            }
        }
        catch(NullPointerException npe) {
            return;
        }
        
        try{
            productNo = Integer.parseInt(strProductNo);//converting string to integer type
        }
        catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(contentPane,"Please enter a valid product number.","Error",0);
            return;
        }
        boolean active = false;
        for(MicrosoftProduct mp : productList) {
            if(mp instanceof EnterpriseEdition) {
                EnterpriseEdition ee = (EnterpriseEdition)mp; //class casting so as to access all objects of class MicrosoftProduct and EnterpriseEdition
                if(mp.getProductNo() == productNo) { //checking the entered product number is already in the list or not
                    active = true;
                    ee.terminateLicense(); //calls the terminateLicense method from EnterpriseEdition class
                    JOptionPane.showMessageDialog(contentPane,"The Product License has been terminated successfully.","Terminated",1);
                    tfStatus.setText("Product No. " + productNo + " license terminated.");
                    break;
                }
                if(active == false) //if product number not in the list
                    JOptionPane.showMessageDialog(contentPane,"Product Number not found.","Error",0);
            }
        }
    }
    
    //method to set the price per user of the given product
    private void setPricePerUser() {
        String strProductNo = tfProductNo.getText();
        String strPricePerUser = tfPricePerUser.getText();
        int productNo, pricePerUser;
        //try catch for exception handling 
        try {
            if(strProductNo.trim().equals("") || strPricePerUser.trim().equals("") || strPricePerUser.trim().equals("0")) { //checks if null value is passed
                JOptionPane.showMessageDialog(contentPane,"Please Enter the Product Number and Price per User correctly.","Error",0);
                return;
            }
        }
        catch(NullPointerException npe) {
            return;
        }
        try {
            //converting String to integer type
            productNo = Integer.parseInt(strProductNo);
            pricePerUser = Integer.parseInt(strPricePerUser);
        }
        catch(NumberFormatException nfe) {//displays error message if valid input is not provided
            JOptionPane.showMessageDialog(contentPane,"Please enter valid Product Number and Price per User.","Error",0);
            return;
        }
        boolean flag = false;
        for(MicrosoftProduct mp : productList) { //for-each loop for accessing 
            EnterpriseEdition ee = (EnterpriseEdition)mp; //class casting
            if(mp.getProductNo() == productNo) { //compares provided product number and product number in arraylist then moves to next line
                flag = true;
                if(ee.getPricePerUser() == pricePerUser) { //checks if user input same price per user
                    JOptionPane.showMessageDialog(contentPane,"You have entered the same Price per User, please try different price per user.","Warning!",2); //if same price then displays message
                }else if(ee.getIsActivated() == true) { //checks if license is activated, if already activated displays message cannot set new price per user
                    JOptionPane.showMessageDialog(contentPane,"License is already activated for this product, cannot change the price per user for the product.","Warning!",2);
                }
                else {
                    ee.setPricePerUser(pricePerUser); //calls setPricePerUser() method from EnterpriseEdition class
                    tfStatus.setText("New price per user set for the product no: " + productNo + ".");
                    break;
                }
            }
        }
        if(flag == false) {
            JOptionPane.showMessageDialog(contentPane,"Product not found, please try again.","error",0);
        }
    }
    
    //method to display arraylist in terminal
    private void display() {
        boolean flag = false;
        for(MicrosoftProduct mp : productList) {
            if(mp instanceof EnterpriseEdition)  {
                EnterpriseEdition ee= (EnterpriseEdition)mp; //class casting
                flag = true;
                ee.display(); //calls display() method of EnterpriseEdition class that overrides display() method of MicrosoftProduct class
                tfStatus.setText("Product list details displayed in terminal."); //arraylist displayed
            }
        }
        
        if(flag == false) {
            JOptionPane.showMessageDialog(contentPane,"No product added, please add the product first.","info",1);
        }
    }
    
    //method to clear form
    private void clear() {
        int opt = JOptionPane.showConfirmDialog(contentPane,"Do you want to clear all fields?","clear form",JOptionPane.YES_NO_OPTION);//asks user to clear the form 
        if(opt == JOptionPane.YES_OPTION) { //if yes is clicked, clears form else return
            tfProductNo.setText(null);
            tfProductName.setText(null);
            tfPricePerUser.setText(null);
            tfNumOfUsers.setText(null);
            tfClientCompanyName.setText(null);
            tfLicenseActivationDate.setText(null);
            tfLicenseExpireDate.setText(null);
            tfActivationKey.setText(null);
            tfTotalPrice.setText(null);
            tfProductNo2.setText(null);
            tfStatus.setText("Form cleared.");
        }
    }
}