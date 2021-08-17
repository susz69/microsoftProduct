/*
 * EnterpriseEdition is a sub-class of MicrosoftProduct class that inherits all properties of it's super-class
   which has seven attributes namely; clientCompanyName, pricePerUser, numberOfUser, activationDate, licenseExpireDate, isActivated and isExpired.
 * These attributes will store the input values passed from the GUI through object created and passing those
   value as parameters in the constructor.
 * Accessor method are used to get the value stored in this class to other class or sub class.
 * Author: Susan Shrestha
 */
public class EnterpriseEdition extends MicrosoftProduct {//inheriting MicrosoftProduct class using 'extends' keyword
    //declaring attributes as private access modifier
    private String clientCompanyName;
    private int pricePerUser;
    private int numberOfUser;
    private String activationDate;
    private String licenseExpireDate;
    private boolean isActivated;
    private boolean isExpired;
    
    //creating constructor method of EnterpriseEdition class
    public EnterpriseEdition(int productNo, String productName, int pricePerUser) {//passing parameter values to super class and setting initial values for attributes.   
        super(productNo, productName);
        this.pricePerUser = pricePerUser;
        this.numberOfUser = 0;
        this.activationDate = "";
        this.licenseExpireDate = "";
        this.isActivated = false;
        this.isExpired = false;
    }

    //accessor method for all attributes
    public String getClientCompanyName() {
        return clientCompanyName;
    }
    
    public int getPricePerUser() {
        return pricePerUser;
    }

    public int getNumberOfUser() {
        return numberOfUser;
    }
    
    public String getActivationDate() {
        return activationDate;
    }
    
    public String getLicenseExpireDate() {
        return licenseExpireDate;
    }

    public boolean getIsActivated() {
    return isActivated;
    }

    public boolean getIsExpired() {
        return isExpired;
    } 

    public void setPricePerUser(int pricePerUser) { //setter method to set the value of 'pricePerUser' by passing value through parameter
        if(isActivated == false) { //checks if isActivated status is true or false
            this.pricePerUser = pricePerUser; //sets pricePerUser
            System.out.println("New Price per user is set.\n"); //prints message
        }
        else 
            System.out.println("License is already activated, Cannot change the Price per User.\n");   //prints message in else condition
    }

    //method to Activate the License for the particular product
    public void activateLicense(String clientCompanyName, int numberOfUser, String activationDate, String licenseExpireDate, String activationKey) { //passing values using parameter through this method
        if(isActivated == true) //checks if license is activated
            System.out.println("License is already Activated! \nRegistered Company Name: " + clientCompanyName + "\nNo. of users: " + numberOfUser + "\n"); //print already activated
        else {//if license is not activated, activating it
            this.clientCompanyName = clientCompanyName;
            this.numberOfUser = numberOfUser;
            this.activationDate = activationDate;
            this.licenseExpireDate = licenseExpireDate;
            this.isActivated = true;
            this.isExpired = false;
            super.setActivationKey(activationKey);
            super.setPrice(numberOfUser * pricePerUser);
            System.out.println("Sucessfully Activated!!!"); //prints activated
        }
    }

    //method to Terminate the License for the particular product
    public void terminateLicense() {
        if(isExpired == true)//checks if license is expired
            System.out.println("This License is not activated.\n"); //prints not activated
        else { //if license is activated, terminating it by resetting the values to null
            this.clientCompanyName = "";
            this.activationDate = "";
            this.licenseExpireDate = "";
            this.numberOfUser = 0;
            this.isActivated = false;
            this.isExpired = true;
            System.out.println("This license has been sucessfully terminated.\n"); //prints terminated
        }
    }

    //defining display method to display the product details stored in the object of this class
    public void display() {
        super.display();
        if (isActivated == true) {
            System.out.println("Client company name: " + getClientCompanyName());
            System.out.println("Number of user: " + getNumberOfUser());
            System.out.println("Price per user: " + getPricePerUser());
            System.out.println("Total price: " + numberOfUser*pricePerUser);
            System.out.println("Activation date: " + getActivationDate());
            System.out.println("License expire date: " + getLicenseExpireDate());
            //System.out.println("Activation Key: " + getActivationKey());
            System.out.println("Activation status: " + getIsActivated());
            System.out.println("\n");
        }
    }
}