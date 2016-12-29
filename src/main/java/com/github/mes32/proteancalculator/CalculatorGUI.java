/*

	CalculatorGUI.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class CalculatorGUI extends JFrame {

    private static final String GUI_TITLE = "Calculator";

    CalculatorGUI(boolean showConfig) {
        super(GUI_TITLE);

        String labelText = "";
        if (showConfig) {
            labelText = "showConfig = TRUE";
            new ConfigurationGUI();
        } else {
            labelText = "showConfig = FALSE";
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(labelText);
        getContentPane().add(label);
        pack();
        setVisible(true);
    }
}