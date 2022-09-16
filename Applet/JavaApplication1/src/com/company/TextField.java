/*
    <applet code="TextField.class" width="500" height="500"></applet>
*/
package com.company;

import javax.swing.JApplet;
import javax.swing.*;

public class TextField extends JApplet{
    
    @Override
    public void init(){
        JTextField tf = new JTextField();
        JPasswordField jpf = new JPasswordField();
        JButton jb = new JButton("Press me");
        
        tf.setBounds(50,50,200,30);
        jpf.setBounds(50,150,200,30);
        jb.setBounds(70,250,100,20);
        
        add(tf);
        add(jpf);
        add(jb);
        
        setSize(500,500);
        setLayout(null);
    }
}