package se.lexicon.model;

public interface IVendingMachine {
    void addCurrency(int amount); //Add money to Deposit Pool
    int getBalance(); //Show total avalible money
    Product request(int id); //Request a product
    int endSession(); //End session and return any change
    String getDescription(int id); //Describe a product based on ID
    String[] getProducts(); //Display the products


}
