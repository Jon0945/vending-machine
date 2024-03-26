package se.lexicon.model;

public abstract class Product {
    //Static Field
    private static int productSequencer = 1;

    //Field
    private int id;
    private double price;
    private String productName;

    //Getters & Setters
    public int getId() {return id;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public String getProductName() {return productName;}
    public void setProductName(String productName) {this.productName = productName;}

    //Constructor
    public Product(double price, String productName) {
        id = productSequencer++;
        setPrice(price);
        setProductName(productName);
    }

    //Methods
    public abstract String examine();
    public abstract String use();
}
