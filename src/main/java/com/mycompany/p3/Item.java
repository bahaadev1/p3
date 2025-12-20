/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

/**
 *
 * @author bhaal
 */
public class Item {
    private int number;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private  int minAllowed;
public Item (){}
    public Item(int number, String name, String category, double price, int quantity,int minAllowed) {
        this.number = number;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.minAllowed=minAllowed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0) throw new IllegalArgumentException("invalid amount");
        this.quantity = quantity;
    }

    public int getMinAllowed() {
        return minAllowed;
    }

    public void setMinAllowed(int minAllowed) {
        this.minAllowed = minAllowed;
    }
    
    
    public void increaseQuantity(int amount){
        if (amount <=0)
            throw new IllegalArgumentException("invalid amount");
        quantity+=amount;
    }
    public void decreaseQuantity(int amount){
    if (amount>quantity)
            throw new IllegalArgumentException("not enough quantity" );
        quantity-=amount;
        }
     public boolean isBelowMinimum (){
        return quantity<minAllowed;
    }
    //codeeee
    
    public ItemStatus getStatus() {
    if (quantity == 0) return ItemStatus.OUT_OF_STOCK;
    if (quantity < minAllowed) return ItemStatus.BELOW_MINIMUM;
    return ItemStatus.AVAILABLE;
}
    
    // bhabha says welcome to you   

    @Override
    public String toString() {
        return "Item{" + "number=" + number + ", name=" + name + ", category=" + category + ", price=" + price + ", quantity=" + quantity + ", minAllowed=" + minAllowed + '}';
    }
    
    
    
    
    
     
    
    
}
