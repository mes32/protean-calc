/*

	CalculatorView.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class CalculatorView extends JFrame {

    private static final String GUI_TITLE = "Calculator";
    private CalculatorViewModel viewModel;
    private CalculatorController controller;

    CalculatorView(CalculatorViewModel viewModel, CalculatorController controller) {
        super(GUI_TITLE);
        this.viewModel = viewModel;
        this.controller = controller;
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String labelText = "[Empty Label]";
        JLabel label = new JLabel(labelText);
        getContentPane().add(label);
        pack();
        setVisible(true);
    }
}