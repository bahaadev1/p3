/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bhaal
 */
public class Product {
    private int number;
    private String name;
   Map <Item,Integer> requiredItem  = new HashMap <>();
public Product (){}
    public Product(int number, String name,Map<Item, Integer> requiredItem) {
        this.number = number;
        this.name = name;
       this.requiredItem = requiredItem;
    
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

    
    
    /////// اضافة عناصر المطلوبة للمنتج
    
    public void addRequiredItem(Item item, int amount) {
    if (item == null)
        throw new IllegalArgumentException("Item is null");

    if (amount <= 0)
        throw new IllegalArgumentException("Invalid amount");
else
    requiredItem.put(item, amount);
}
    //////////  ازالة عناصر من منتج
    
    public void removeRequiredItem(Item item) {
    if (!requiredItem.containsKey(item))
        throw new IllegalArgumentException("Item not found in product");
else
    requiredItem.remove(item);
}
    
    
    
    //////////  المواد المطلوبة
    public Map<Item, Integer> getRequiredItems() {
    return new HashMap<>(requiredItem);
}
    
    
    
    
    
    
    
    
    
    
    
    
    ///////////////  طباعة معلومات المنتج
    
    @Override
    public String toString() {
        return "Product{" + "number=" + number + ", name=" + name + 
                ", requiredItem=" + requiredItem + '}';
    }
    
        
  
    
}
