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
   Map <Item,Integer> requiredItem = new HashMap <>();
public Product (){}
    public Product(int number, String name) {
        this.number = number;
        this.name = name;
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

    
    
    ///////////////  طباعة معلومات المنتج
    
    @Override
    public String toString() {
        return "Product{" + "number=" + number + ", name=" + name + ", requiredItem=" + requiredItem + '}';
    }
    
        
    
    
    
    
    
    
    
    
    
    
    
    
}
