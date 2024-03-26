package se.lexicon.model;

public class Snack extends Product {
    //Fields
    private String snackItemType;
    private boolean isSalted;

    //Getters & Setters
    public String getSnackItemType() {return snackItemType;}
    public void setSnackItemType(String snackItemType) {this.snackItemType = snackItemType;}
    public boolean isSalted() {return isSalted;}
    public void setSalted(boolean salted) {isSalted = salted;}

    //Constructor
    public Snack(double price, String productName, String snackItemType, boolean isSalted) {
        super(price, productName);
        setSnackItemType(snackItemType);
        setSalted(isSalted);
    }

    //Methods
    @Override
    public String examine() {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getId()).append("\n");
        productInfo.append("Product name: ").append(getProductName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getPrice()).append("\n");
        productInfo.append("Type of Snack: ").append(snackItemType).append("\n");
        productInfo.append("Salted: ").append(isSalted ? "Yes" : "No").append("\n");
        return productInfo.toString();
    }
    @Override
    public String use() {
        return "\nProductnumber: " + getId() +
                "\nName: " + getProductName();
    }

}
