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

    public LineStatus getStatus() {
        return status;
    }
    
    public Queue<Task> getTasks() {
        return tasks;
    }
//    public void setTasks(Queue<Task> tasks) {
//        this.tasks = tasks;
//    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

   
   
    
    
    


/////// اضافة مهمة لخط الانتاج
public void addTask (Task t){
 if (status==LineStatus.STOPPED)
        System.out.println("line is not working");
 if(status==LineStatus.MAINTENANCE)
        System.out.println("line is under maintenance");
 else{
     tasks.add(t);
     System.out.println("task added successfully");}
     }
    
//////// ازالة مهمة من خط الانتاج

 public void cancleTask(Task t){
     if (!tasks.contains(t))
        throw new IllegalArgumentException("task not found in productline");
     else
 tasks.remove(t);
//     System.out.println("task removed successfully");
 
 }
 
////////// عرض المهام التابعة لخط الانتاج 

 public void showLineTasks(){
 for(Task t:tasks){
     System.out.println(t);
 }}
 
 
 ///////////  بحث عن مهمة حسب الحالة
    public   List<Task>  searchTaskByStatus(TaskStatus ts) {

  List<Task> result = new ArrayList<>();

    for (Task t : tasks) {
        if (t.getStatus()==ts) {
            result.add(t);
        }
    }
      return result;
    }
    
    
     @Override
public void run(){

    if (!tasks.isEmpty())
     throw new IllegalArgumentException(" there is no tasks in prouduct line ");
    else {for (Task t :tasks){
    
    
    
    
    
    
    
    
    }}



















}

    
    
    
    
    
    
    
    
    
    
    
}
