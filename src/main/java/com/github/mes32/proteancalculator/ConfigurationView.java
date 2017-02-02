/*

	ConfigurationView.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class ConfigurationView extends JFrame {
    private static final String GUI_TITLE = "Calculator Configuration";
    private ConfigurationViewModel viewModel;
    private ConfigurationController controller;

    ConfigurationView(ConfigurationViewModel viewModel, ConfigurationController controller) {
        super(GUI_TITLE);
        this.viewModel = viewModel;
        this.controller = controller;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String labelText = "[Empty Label]";
        JLabel label = new JLabel(labelText);
        getContentPane().add(label);
        pack();
        setVisible(true);

        /*
        Sections:
            Dimensions
            Typefaces
            Display
            Buttons
            Colors
        */
    }
}