/*
    <applet code="Table.class" width="500" height="500"></applet>
*/
package com.company;

import javax.swing.JApplet;
import javax.swing.*;

public class Table extends JApplet{
    
    @Override
    public void init(){
        String data[][]={ {"20CM015","Shreyas","6700000"},    
                          {"20CM016","Asmita","780000"},    
                          {"20CM017","Kshitij","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    add(sp);          
    setSize(300,400);    
    setVisible(true);   
    }
}