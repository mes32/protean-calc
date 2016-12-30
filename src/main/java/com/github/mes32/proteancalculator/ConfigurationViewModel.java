/*

	ConfigurationViewModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class ConfigurationViewModel extends JFrame {

    private static final String GUI_TITLE = "Calculator Configuration";

    ConfigurationViewModel() {
        super(GUI_TITLE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String labelText = "[Empty Label]";
        JLabel label = new JLabel(labelText);
        getContentPane().add(label);
        pack();
        setVisible(true);
    }
}