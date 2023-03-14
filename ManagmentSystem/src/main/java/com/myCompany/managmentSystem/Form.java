package com.myCompany.managmentSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/*
* The javax.swing.JFrame class is a type of container which inherits the java.awt.Frame class.
* JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI.
*
*/
public class   Form extends JFrame {
    public JPanel Main;
    public JTextField textName;
    public JTextField textAdress;
    public JButton Submit;
    /*
    * select the package where to create the form
    * New->swing UI Designer-> GUI Form, creamos y custozamos creando la clase Form
    * De la libreria de Java Tomamos la clase JFrame y creamos la clase Form
    */

    public Form() {
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String address = textAdress.getText();


                JOptionPane.showMessageDialog(null,name);
                JOptionPane.showMessageDialog(null,address);
            }
        });
    }

















}

