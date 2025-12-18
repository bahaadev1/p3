/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author bhaal
 */
public class loginFrame extends JFrame {
    public loginFrame (){
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("login");
        
    JPanel panel = new JPanel();
add(panel);
JLabel userLabel = new JLabel("Username:");
JTextField username = new JTextField();
JLabel passLabel = new JLabel("Password:");
JPasswordField password = new JPasswordField();
JButton loginButton = new JButton("Login");
panel.add(userLabel);
panel.add(username);
panel.add(passLabel);   
panel.add(password);
panel.add(loginButton);
setVisible(true);

    }
}
