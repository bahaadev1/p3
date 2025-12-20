/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.time.LocalDate;

/**
 *
 * @author bhaal
 */
public class Task {
    private int number;
    private Product product ;
    private int requiredAmount;
    private String agent;
    private LocalDate startDate;
    private LocalDate deliveryDate;
    private TaskStatus status;
     
     
    private ProductLine productline ;
     
    private double progress ;
   
public Task (){}

    public Task(int number, Product product, int requiredAmount, String agent, LocalDate startDate, LocalDate deliveryDate, taskStatus status, ProductLine productline ) {
        this.number = number;
        this.product = product;
        this.requiredAmount = requiredAmount;
        this.agent = agent;
        this.startDate = startDate;
        this.deliveryDate = deliveryDate;
        this.status=status;
        this.productline = productline;
        this.progress=0;
        
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public ProductLine getProductline() {
        return productline;
    }

    public void setProductline(ProductLine productline) {
        this.productline = productline;
    }

    public double getCompletedOrder() {
        return progress*requiredAmount/100;
    }

    
     public double getProgress() {
      return progress;
    }

    public void updateProgress(double amount) {
       if(amount<=0)
           throw new IllegalArgumentException("invalid progress amount" );
      else  progress +=amount;
        
       
       if (progress>=100){
           progress=100;
            status=TaskStatus.COMPLETED;}
        
    }

    @Override
    public String toString() {
        return "Task{" + "number=" + number + ", product=" + product + ", requiredAmount=" + requiredAmount + ", agent=" + agent + ", startDate=" + startDate + ", deliveryDate=" + deliveryDate + ", status=" + status + ", productline=" + productline + ", progress=" + progress + '}';
    }

   
   
}
