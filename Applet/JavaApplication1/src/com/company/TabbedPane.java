/*
    <applet code="TabbedPane.class" width="500" height="500"></applet>
*/

package com.company;

import javax.swing.JApplet;
import javax.swing.*;

public class TabbedPane extends JApplet {
    @Override
    public void init(){
        JTextArea ta=new JTextArea(200,200);  
        JPanel p1=new JPanel();  
        p1.add(ta);  
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();  
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(50,50,200,200);  
        tp.add("main",p1);  
        tp.add("visit",p2);  
        tp.add("help",p3); 
        
        add(tp);
        
        setSize(400,400);  
        setLayout(null);  
        setVisible(true); 
    }
}
