/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.time.LocalDateTime;

/**
 *
 * @author bhaal
 */
public class ErrorLoger {
    private static final String FileName = "error.txt";
    
    
    public static void log (String message){
    try (PrintWriter output = new PrintWriter(new FileWriter(FileName)))
    {out.println(LocalDateTime.now()+" "+message);}
    
    catch(IOException e){System.out.println("failed to write ");}
    
    
    }
    
    public static void log (Exception e){
    log(e.getClass().getSimpleName()+": "+e.getMessage()
    );}
    
    
    
    
    
}
