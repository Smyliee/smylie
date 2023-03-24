package com.scanner.ques10;

public class Item {
    private String item;
    private String paymentInformation;

    public String getPaymentInformation() {
        return paymentInformation;
    }

    /*public Item(String item, String paymentInformation) {
        this.item = item;
        this.paymentInformation = paymentInformation;
    }*/

    public void setPaymentInformation(String paymentInformation) {
        this.paymentInformation = paymentInformation;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item='" + item + '\'' +
                ", paymentInformation='" + paymentInformation + '\'' +
                '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
