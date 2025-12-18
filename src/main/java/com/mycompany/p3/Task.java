/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

/**
 *
 * @author bhaal
 */
public class Task {
    private int number;
    private String agent;
    private String statue;
    private double orderAmount;
    private int readyAmount;
public Task (){}
    public Task(int number, String agent, String statue, int orderAmount, int readyAmount) {
        this.number = number;
        this.agent = agent;
        this.statue = statue;
        this.orderAmount = orderAmount;
        this.readyAmount = readyAmount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getReadyAmount() {
        return readyAmount;
    }

    public void setReadyAmount(int readyAmount) {
        this.readyAmount = readyAmount;
    }
    public void progres(){
        double a =this.getReadyAmount()*100/this.getOrderAmount();
        System.out.println("percentage of completed tasks: "+a+"%");
        
} 
   
}
