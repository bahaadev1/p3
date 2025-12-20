/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import static com.mycompany.p3.ErrorLoger.log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bhaal
 */
public class inventory {
    
   ArrayList <Item>items = new ArrayList ();
    ArrayList <Product>products = new ArrayList ();

    
     Scanner input= new Scanner(System.in);
    public ArrayList getItems() {
        return items;
    }

    public ArrayList getProducts() {
        return products;
    }
     
     public void addItem (Item e){items.add(e);}
     
    public void removeItem (Item e){items.remove(e);}
    
    public void addProduct (Product e){products.add(e);}
     
    public void removeProduct (Product e){products.remove(e);}
    

    
    ///عرض محتويات المخزون        
    public void showInventory (){
        System.out.println("items: ");
    for (Item e : items){System.out.println(e);}
        System.out.println(" products: ");
        for (Product e :products ){System.out.println(e);}
        }
    
        
    
    ///search
    
   
 public   List<Item>  searchItemByName(String name) {

    ArrayList<Item> result = new ArrayList<>();

    for (Item e : items) {
        if (e.getName().contains(name)) {
            result.add(e);
        }
    }

    return result;
}
 
 
    ///search
 
    public   List<Item>  searchItemByCatagery(String category) {

    ArrayList<Item> result = new ArrayList<>();

    for (Item e : items) {
        if (e.getCategory().contains(category)) {
            result.add(e);
        }
    }

    return result;
}
    
     public   List<Item>  searchItemByStatus(ItemStatus s) {

    ArrayList<Item> result = new ArrayList<>();

    for (Item e : items) {
        if (e.getStatus()==s) {
            result.add(e);
        }
    }

    return result;
}
     
     
     
     
     
     
     
    ///search
    
    public   List<Product>  searchProductByName(String name) {

    ArrayList<Product> result = new ArrayList<>();

    for (Product e : products) {
        if (e.getName().contains(name)) {
            result.add(e);
        }
    }

    return result;
}
    
    
    
    
    
    
    
    
    public void saveInventoryToFile(String fileName) {

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

        // حفظ المواد الخام
        for (Item i : items) {
            writer.write(
                "ITEM;" +
                i.toString()
            );
            writer.newLine();
        }

        // حفظ المنتجات
        for (Product p : products) {
            writer.write(
                "PRODUCT;" +
               p.toString()
            );
            writer.newLine();
        }

    } catch (IOException e) {
        log(e); // أو طباعة / تسجيل
    }
    
}
    
    ///////////////////////////////////////////////////////
    
    
    public void updateQuantity(Item i,int amount){
       for(Item c:items){
        if (c.equals(i)){
        System.out.println("enter '1' to  increase or '0' to decrease ");
        
        int a = input.nextInt();
        switch (a){case 1 :c.increaseQuantity(amount);System.out.println("added successfuly");
        case 0 :c.decreaseQuantity(amount);System.out.println("removed successfuly");}
        } 
       else System.out.println("Item not found ");
       }
    }
    
     public boolean isExist(Object o){
         boolean a = false;
       for(Item c:items){
        if (c.equals(o)){
       a=true;
       }
    else{
       for (Product e : products){
           if (e.equals(o))
               a=true;}}
        }
       
       return a;
}
     
     
     public void reserveItem(Item i , int a){
       for ( Item e :items){
           if (e.equals(i))
           i.decreaseQuantity(a);
           else System.out.println("Item not found");
       }
     } 
     
      public void releaseReservedItem(Item i , int a){
       for ( Item e :items){
           if (e.equals(i))
           i.increaseQuantity(a);
           else System.out.println("Item not found");
       }
     } 
     
     
     
     
     
     
     
     
}