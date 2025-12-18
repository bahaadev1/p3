/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhaal
 */
public class managerFrame extends JFrame{
    public managerFrame(){
     setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("maneger dashboard");
    setSize(1000, 1000);
    JPanel Panel1 = new JPanel();
    JButton addProductionline = new JButton("Add Production Line");
    JButton Changelinestatus = new JButton("Change Line Status");
    JButton showproductionlinesstatus = new JButton("showproductionlinesstatus");
    Panel1.add(addProductionline);
    Panel1.add(Changelinestatus);
    Panel1.add(showproductionlinesstatus);
    add(Panel1);
    
    
    
    
    
    
    
    
    String[] columns = {"Line Name", "Status"};
DefaultTableModel model = new DefaultTableModel(columns, 0);
JTable table = new JTable(model);

JScrollPane scrollPane = new JScrollPane(table);
    
    
    
    setLayout(new BorderLayout());

add(Panel1, BorderLayout.NORTH);
add(scrollPane, BorderLayout.CENTER);
    
    
    
    
    
    
    
    
    
    
    setVisible(true);
    } 
    
    
}
