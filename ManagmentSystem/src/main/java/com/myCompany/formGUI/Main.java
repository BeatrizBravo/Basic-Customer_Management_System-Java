package com.myCompany.formGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Form form = new Form(); //instanciando el objeto form
        form.setContentPane(new Form().Main);
        form. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ;
        form.setVisible(true);
        form. pack();

    }
}
