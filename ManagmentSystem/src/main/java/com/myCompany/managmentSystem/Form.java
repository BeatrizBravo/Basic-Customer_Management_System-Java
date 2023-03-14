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
    public JButton Submit;
    private JTextField textEmail;
    private JTextField textPhoneNumber;
    private JLabel email;
    private JLabel phoneNumber;
    private JTextField txtLastName;
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
                String lastName = txtLastName.getText();
                String email = textEmail.getText();
                String phone = textPhoneNumber.getText();

                String saving = "you have saved correctly";

                JOptionPane.showMessageDialog(null,saving);
            }
        });
    }

















}

