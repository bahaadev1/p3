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
import java.util.Map;


/**
 *
 * @author bhaal
 */
public class inventory {
    
   private final List <Item>items = new ArrayList ();
  private final List <Product>products = new ArrayList ();

    
     
//    public ArrayList getItems() {
//        return items;
//    }
//
//    public ArrayList getProducts() {
//        return products;
//    }
     ////////      اضافة و حذف عنصر خام
     public synchronized void addItem (Item e){
         if (items.contains(e))
            throw new IllegalArgumentException("Item already exists" );
         else 
             items.add(e);}
    public synchronized void removeItem (Item e){
       if ( !items.remove(e))
    throw new IllegalArgumentException("Item not found" );
    }
    
    ////////        اضافة و حذف  منتج
    
    
    
    public synchronized void   addProduct (Product e){
        if (products.contains(e))
        throw new IllegalArgumentException("product already exists" );
        else 
            products.add(e);}
    public synchronized void removeProduct (Product e){ 
    if (!products.remove(e))
       throw new IllegalArgumentException("product not found" );
    }
    

    
    ///////عرض محتويات المخزون        
    public void showInventory (){
        System.out.println("items: ");
    for (Item e : items){System.out.println(e);}
        System.out.println(" products: ");
        for (Product e :products ){System.out.println(e);}
        }
    
        
    
    /////////// البحث عن عنصر خام عن طريق الاسم
    
   
 public  synchronized  List<Item>  searchItemByName(String name) {

    List<Item> result = new ArrayList<>();

    for (Item e : items) {
        if (e.getName().toLowerCase().contains(name.toLowerCase())) {
            result.add(e);
        }
    }

    return result;
}
 
 
////////////  البحث عن عنصر خام عن طريق الفئة
 
    public  synchronized List<Item>  searchItemByCatagery(String category) {

   List<Item> result = new ArrayList<>();

    for (Item e : items) {
        if (e.getCategory().toLowerCase().contains(category.toLowerCase())) {
            result.add(e);
        }
    }

    return result;
}
    
    
    /////////////   البحث عن عنصر خام عن طريق الحالة
    
     public  synchronized List<Item>  searchItemByStatus(ItemStatus s) {

    List<Item> result = new ArrayList<>();

    for (Item e : items) {
        if (e.getStatus()==s) {
            result.add(e);
        }
    }

    return result;
}
     
     
     
     
     
     
     
   /////////// البحث عن منتج حسب الاسم
    
    public  synchronized List<Product>  searchProductByName(String name) {

    List<Product> result = new ArrayList<>();

    for (Product e : products) {
        if (e.getName().toLowerCase().contains(name.toLowerCase())) {
            result.add(e);
        }
    }

    return result;
}
    
    
    
    
    
    /////////////   حفظ محتويات المخزون الى ملف نصي
    
    
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
    
    
    ////////// تعديل كمية عنصر خام عن طريق المخزون
    
//    public void updateQuantity(Item i,int amount){
//       for(Item c:items){
//        if (c.equals(i)){
//        System.out.println("enter '1' to  increase or '0' to decrease ");
//        
//        int a = 1;
//        switch (a){case 1 :c.increaseQuantity(amount);System.out.println("added successfuly");break;
//        case 0 :c.decreaseQuantity(amount);System.out.println("removed successfuly");break;}
//        } 
//       else System.out.println("Item not found ");
//       }
//    }
//    
    
    
    /////////////    التشييك على عنصر اذا موجود ضمن المخزون
    
//     public boolean isExist(Object o){
//         boolean a = false;
//       for(Item c:items){
//        if (c.equals(o)){
//       a=true;
//       }
//    else{
//       for (Product e : products){
//           if (e.equals(o))
//               a=true;}}
//        }
//       
//       return a;
//}
     
     ///////// تشييك اذا الكمية المطلوبة موجودة
     public synchronized boolean isAvailable(Item i, int amount) {
    if (!items.contains(i))
        throw new IllegalArgumentException("Item not found");

    return i.getQuantity() >= amount;
}
     
     
     
     
     //////////  حجز كمية معينة من عنصر معين من المخزون
     
     public   synchronized void reserveItem(Item i , int amount){
       
           if (!isAvailable(i,amount))
               throw new IllegalArgumentException("not enough stock");
           else 
               i.decreaseQuantity(amount);
          
       
     } 
     
     
     
     ////////////   الغاء حجز عنصر من المخزون
     
      public synchronized void releaseReservedItem(Item i , int amount){
      
           if (!items.contains(i))
               throw new IllegalArgumentException("Item not found");
           else i.increaseQuantity(amount);
       
     } 
     
     
     /////////      حجز كمية مطلوبة لانتاج عدد معين من المنتجات
     
     
     public synchronized void consumeProduct(Product product, int quantity) {

    Map<Item, Integer> required = product.getRequiredItems();

    for (Item i : required.keySet()) {

        int amountPerUnit = required.get(i);
        int totalAmount = amountPerUnit * quantity;

        reserveItem(i, totalAmount);
    }
}
     
     
     
     
     
     
     
     
     
     
}