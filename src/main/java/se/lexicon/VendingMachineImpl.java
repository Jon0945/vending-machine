package se.lexicon;

import se.lexicon.model.*;
public class VendingMachineImpl implements IVendingMachine {
    //Fields
    private int depositPool;
    private int change;
    private Product[] products = new Product[8];
    private int[] acceptedDenominations = {1,2, 5, 10, 20, 50, 100,200, 500, 1000};

    //Getters & Setters
    public int getDepositPool() {return depositPool;}
    public void setDepositPool(int depositPool) {this.depositPool = depositPool;}
    public int getChange() {return change;}
    public void setChange(int change) {this.change = change;}
    public int getProductsLength() {return products.length;}

    //Methods
    public void VendingMachineImpl() {
        products[0] = new Drink(15, "Coca Cola", 330, true);
        products[1] = new Drink(20, "Festis Apelsin", 500, false);
        products[2] = new Snack(10, "Estrella Salt & Vinegar Chips", "Chips",true);
        products[3] = new Snack(30, "Bag of Candied Almonds", "Nuts", false);
        products[4] = new Snack(24, "Bag of Dried Fruit Mix", "Fruit",false);
        products[5] = new Candy(12,"Extra Chewing Gum","Chewing Gum","Cool Mint",true);
        products[6] = new Candy(25,"Kungen av Dannmark","Hard Candy","Anise",false);
        products[7] = new Candy(19,"Haribo Matador Mix","Soft Candy","Fruit/Liquorice",false);
    }


    @Override
    public void addCurrency(int amount) {
        for (int x : acceptedDenominations) {
            if (amount == x) {
                setDepositPool(depositPool + amount);
                break;
            }
        }
    }
    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int productNumber) {
        if (depositPool > products[productNumber -1].getPrice()) {
            depositPool = (getDepositPool() - (int)products[productNumber - 1].getPrice());
            return products[productNumber - 1];
        }
        else {
            return null;
        }
    }
    @Override
    public int endSession() {
        setChange(getDepositPool());
        setDepositPool(0);
        return getChange();
    }
    @Override
    public String getDescription(int productnumber) {
        return products[productnumber - 1].examine();
    }
    @Override
    public String[] getProducts() {
        String[] result = new String[getProductsLength()];
        for (int i = 0; i<products.length; i++) {
            result[i] = products[i].getProductName();
        }
        return  result;
    }



}
