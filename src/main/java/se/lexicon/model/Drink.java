package se.lexicon.model;

public class Drink extends Product {
    //Fields
    private int canSize;
    private boolean isCarbonated;

    //Getters & Setters
    public int getCanSize() {return canSize;}
    public void setCanSize(int canSize) {this.canSize = canSize;}
    public boolean isCarbonated() {return isCarbonated;}
    public void setCarbonated(boolean carbonated) {isCarbonated = carbonated;}

    //Constructor
    public Drink(double price, String productName, int canSize, boolean isCarbonated) {
        super(price, productName);
        setCanSize(canSize);
        setCarbonated(isCarbonated);
    }
    @Override
    public String examine() {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getId()).append("\n");
        productInfo.append("Product name: ").append(getProductName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getPrice()).append("\n");
        productInfo.append("Can size (ml): ").append(canSize).append("\n");
        productInfo.append("Carbonated: ").append(isCarbonated ? "Yes" : "No").append("\n");
        return productInfo.toString();
    }
    @Override
    public String use() {
        return "\nProductnumber: " + getId() +
                "\nName: " + getProductName();
    }


}
