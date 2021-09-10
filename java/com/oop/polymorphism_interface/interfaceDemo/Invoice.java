package com.oop.polymorphism_interface.interfaceDemo;

public class Invoice implements Payable {

    private final String partNumber;
    private final String partDiscription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDiscription, int quantity, double pricePerItem) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be >= 0");
        }

        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per Item must be >= 0");
        }

        this.partNumber = partNumber;
        this.partDiscription = partDiscription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDiscription() {
        return partDiscription;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quentity must be >= 0");
        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0) {
            throw new IllegalArgumentException("Price per Item must be >= 0");
        }
        this.pricePerItem = pricePerItem;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }
    
     // return String representation of Invoice object 
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDiscription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    @Override
    public double getPaymentAmount() {
         // calculate total cost 
        return getQuantity() * getPricePerItem();
    }

}
