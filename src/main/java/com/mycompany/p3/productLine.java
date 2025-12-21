/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author bhaal
 */
public class ProductLine extends Thread {
    private int number;

     private LineStatus status;
  
 Queue <Task> tasks ;
   
     
   public ProductLine(){}
    public ProductLine(int number, String name) {
        super(name);
        this.number = number;
        this.status=LineStatus.STOPPED;
       this.tasks = new LinkedList<>() ;
    }

    public void setStatus(LineStatus status) {
        this.status = status;
    }

        

    public Queue<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Queue<Task> tasks) {
        this.tasks = tasks;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   
   
    
    
    
    @Override
public void run(){}


// اضافة مهمة
public void addTask (Task t){
 if (status==LineStatus.STOPPED)
        System.out.println("line in not working");
 if(status==LineStatus.MAINTENANCE)
        System.out.println("line is under maintenance");
 else{
     tasks.add(t);
     System.out.println("task added successfully");}
     }
    
 public void cancleTask(Task t){
 tasks.remove(t);
     System.out.println("task removed successfully");
 
 }
 public void showLineTasks(){
 for(Task t:tasks){
 
     System.out.println(t);
 }}
 
 
 public void searchTask(){
 
 }
    public   List<Task>  searchTaskByStatus(TaskStatus ts) {

    ArrayList<Task> result = new ArrayList<>();

    for (Task t : tasks) {
        if (t.getStatus()==ts) {
            result.add(t);
        }
    }
      return result;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
