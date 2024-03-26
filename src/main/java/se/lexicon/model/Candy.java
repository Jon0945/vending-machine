package se.lexicon.model;

public class Candy extends Product {
    //Fields
    private String candyType;
    private String candyFlavor;
    private boolean isSugarFree;

    //Getters & Setters
    public String getCandyType() {return candyType;}
    public void setCandyType(String candyType) {this.candyType = candyType;}
    public String getCandyFlavor() {return candyFlavor;}
    public void setCandyFlavor(String candyFlavor) {this.candyFlavor = candyFlavor;}
    public boolean isSugarFree() {return isSugarFree;}
    public void setSugarFree(boolean sugarFree) {isSugarFree = sugarFree;}

    //Constructor
    public Candy(double price, String productName, String candyType, String candyFlavor, boolean isSugarFree) {
        super(price, productName);
        setCandyType(candyType);
        setCandyFlavor(candyFlavor);
        setSugarFree(isSugarFree);
    }

    //Methods
    @Override
    public String examine() {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getId()).append("\n");
        productInfo.append("Product name: ").append(getProductName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getPrice()).append("\n");
        productInfo.append("Type of Candy: ").append(candyType).append("\n");
        productInfo.append("Flavor: ").append(candyFlavor).append("\n");
        productInfo.append("Carbonated: ").append(isSugarFree ? "Yes" : "No").append("\n");
        return productInfo.toString();
    }

    @Override
    public String use() {
        return "\nProductnumber: " + getId() +
                "\nName: " + getProductName();
    }
}
