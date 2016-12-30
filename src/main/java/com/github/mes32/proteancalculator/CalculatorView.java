/*

	CalculatorView.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.awt.Dimension;
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

        JPanel mainPanel = intiMainPanel();
        add(mainPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel intiMainPanel() {
        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS));
        mainPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        mainPanel.add(initCenterColumn());
        mainPanel.add(Box.createRigidArea(new Dimension(50, 0)));

        return mainPanel;
    }

    private JPanel initCenterColumn() {
        JPanel centerColumn = new JPanel();

        String labelText = "[Empty Label]";
        JLabel label = new JLabel(labelText);
        centerColumn.add(label);
        return centerColumn;
    }
}