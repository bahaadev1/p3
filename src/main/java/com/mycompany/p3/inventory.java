/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author bhaal
 */
public class inventory {
    
   ArrayList <Item>items = new ArrayList ();
    ArrayList <Product>products = new ArrayList ();

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
    
//    public void search (Object e){
//    if (e instanceof Item)
//            System.out.println(e+" is an Item ");
//    else if (e instanceof Product)
//            System.out.println(e+" is a Product");
//    else throw new IllegalArgumentException("object must be Item or product");}
    
    ///عرض محتويات المخزون        
    public void showInventory (){
        System.out.println("items: ");
    for (Item e : items){System.out.println(e);}
        System.out.println(" products: ");
        for (Product e :products ){System.out.println(e);}
        }
    
    
    
    
    
    
    
    
    
//     public void serachByName ( Object o,String n){
//     
//          if (o instanceof Item)
//           
//    else if (o instanceof Product)
//          
//    else throw new IllegalArgumentException("object must be Item or product");
//         
//         
//     
//     
//     }
//    
    
    
    
    
    
    
    
    
    
    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
