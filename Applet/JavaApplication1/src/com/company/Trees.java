/*
    <applet code="Trees.class" width="500" height="500"></applet>
*/

package com.company;

import javax.swing.JApplet;
import javax.swing.tree.DefaultMutableTreeNode; 
import javax.swing.*;

public class Trees extends JApplet {
    @Override
    public void init(){
        
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
        color.add(red); color.add(blue); color.add(black); color.add(green);
        JTree jt=new JTree(style);
        add(jt);
        setSize(200,200);
        setVisible(true);  
    }
}
