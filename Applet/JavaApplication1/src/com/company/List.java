/*
    <applet code="List.class" width="500" height="500"></applet>
*/

package com.company;

import javax.swing.JApplet;
import javax.swing.*;

public class List extends JApplet {
    @Override
    public void init(){
        
        DefaultListModel<String> l1 = new DefaultListModel<>();  
        l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
        JList<String> list = new JList<>(l1);
        list.setBounds(100,100, 75,75);
        add(list);
        setSize(400,400);
        setLayout(null);
        setVisible(true); 
    }
}
