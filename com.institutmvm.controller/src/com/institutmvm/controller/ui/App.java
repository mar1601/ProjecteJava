package com.institutmvm.controller.ui;
import javax.swing.*;


//CREAR FORMULARI PRINCIPAL Y DIRIGIR A FORMULARI ESPECIFICO
public class App {
    public static void main(String[] args){

        JFrame a;
        App(){
            a = new JFrame("example");
            string courses[] = { "core java","advance java", "java servlet"};
            JComboBox c = new JComboBox(courses);
            c.setBounds(40,40,90,20);
            a.add(c);
            a.setSize(400,400);
            a.setLayout(null);
            a.setVisible(true);
        }
        public static void main(String args[])
        {
            new Example();
        }
    }


}