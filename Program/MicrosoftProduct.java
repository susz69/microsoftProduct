/*
 * MicrosoftProduct is a class that has four attributes namely; productNo, productName, activationKey and price.
 * These attributes will store the input values passed from the GUI through object created and passing those
   value as parameters in the constructor.
 * Getter method are used to access the value stored in this class to other class or sub class.
 * Author: Susan Shrestha
 */
public class MicrosoftProduct {
    //declaring attributes as private access modifier
    private int productNo;
    private String productName;
    private String activationKey;
    private int price;
    
    //creating constructor method of MicrosoftProduct class
    public MicrosoftProduct(int productNo, String productName) {//passing parameter values to attributes of this class through constructor
        this.productNo = productNo;
        this.productName = productName;
        this.activationKey = "";
        this.price = 0;
    }
    
    //using getter and setter method for productNo, productName, activationKey, price;
    public int getProductNo() {
        return productNo; //returns productNo
    }
    
    public String getProductName() {
        return productName; //returns productName
    }
    
    public String getActivationKey() {
        return activationKey; //returns ActivationKey
    }
    
    public void setActivationKey (String activationKey) {//retrieving value using parameter
        this.activationKey = activationKey; //setting 'activationKey' attribute value of this class using 'this' keyword.
    }
    
    public int getPrice() {
        return price; //returns price
    }
    
    public void setPrice (int price) {//retrieving value using parameter
        this.price = price;//setting 'price' attribute value of this class using 'this' keyword.
    }
    
    //defining display method to display the product details stored in the object of this class
    public void display() { 
        System.out.println("Product Number: " + getProductNo());
        System.out.println("Product Name: " + getProductName());
        if(!activationKey.equals("") && price != 0)
        System.out.println("Activation Key: " + getActivationKey() + "\nPrice: " + getPrice());	
    }
}