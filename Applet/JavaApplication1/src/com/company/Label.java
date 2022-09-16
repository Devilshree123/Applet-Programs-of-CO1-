/*
    <applet code="Label.class" width="300" height="300"></applet>
*/

package com.company;

import javax.swing.JApplet;
import javax.swing.*;

public class Label extends JApplet {

    @Override
    public void init() {

        JLabel j = new JLabel("Shreyas Gopnarayan");

        j.setBounds(300,100,200,30);
        
        add(j);
        setSize(1000, 800);
        setLayout(null);

    }

}