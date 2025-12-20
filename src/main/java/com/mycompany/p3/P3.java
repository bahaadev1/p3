/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3;

import java.util.ArrayList;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author bhaal
 */
public class P3 {

    public static void main(String[] args)  {
       // loginFrame login = new loginFrame();
        //managerFrame manger = new managerFrame();
//       Task k = new Task();
//       k.setOrderAmount(600);
//       k.setReadyAmount(56);
//       k.progres();
       Item i = new Item ();
       i.setQuantity(500);
        System.out.println(i.getQuantity());
        try{ i.setQuantity(-3000);}
        catch (Exception e){System.out.println("ss");}
      
        System.out.println(i.getQuantity());
      inventory ii = new inventory ();
      
      ii.addItem(i);
     
      Task tt= new Task();
     }
}
