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

        JButton button = new JButton("Randomize Display Foreground Color");
        button.addActionListener(e -> controller.pressRandomizeDisplayForegroundColor());
        getContentPane().add(button);

        pack();
        setVisible(true);

        /*
        Sections:
            Display
                Text
                    Typeface
                    Type size
                    Type color
                    Alignment
                Margin
                Padding
                Border width
                Border color
                Background color
            Buttons
                Style
                Text
                    ...
                Margin
                Border width
            Operators
                Unpressed
                    Text color
                    Border color
                    Background color
                    Shadow
                Pressed
                    Linked with Upressed
                Hover
                    Link with Upressed
            Secondary Operators
                Linked with Operators
            Digits
            Background
                Margins
                Color
        */
    }
}