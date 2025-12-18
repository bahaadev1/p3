/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.util.ArrayList;

/**
 *
 * @author bhaal
 */
public class productLine {
    private int number;
    private String name;
    private String statue;
    ArrayList tasks=new ArrayList();
public productLine(){}
    public productLine(int number, String name, String statue) {
        this.number = number;
        this.name = name;
        this.statue = statue;
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

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }
    public void setTasks(ArrayList tasks) {
        this.tasks = tasks;
    }
    public ArrayList getTasks() {
        return tasks;
    }
    
}
