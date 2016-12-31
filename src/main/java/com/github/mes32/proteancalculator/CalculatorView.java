/*

	CalculatorView.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.awt.Dimension;
import java.awt.Color;
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

        add(intiMainPanel());

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel intiMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

        mainPanel.add(Box.createRigidArea(viewModel.getCenterColumnLeftMargin()));
        mainPanel.add(initCenterColumn());
        mainPanel.add(Box.createRigidArea(viewModel.getCenterColumnRightMargin()));

        return mainPanel;
    }

    private JPanel initCenterColumn() {
        JPanel centerColumn = new JPanel();
        centerColumn.setLayout(new BoxLayout(centerColumn, BoxLayout.Y_AXIS));

        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));
        centerColumn.add(initRow1());
        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));
        centerColumn.add(initRow2());
        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));
        centerColumn.add(initRow3());
        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));
        centerColumn.add(initRow4());
        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));
        centerColumn.add(initRow5());
        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));
        centerColumn.add(initRow6());
        centerColumn.add(Box.createRigidArea(viewModel.getRowSpacer()));

        return centerColumn;
    }

    private JPanel initRow1() {
        JPanel row1 = new JPanel();

        String labelText = "[ DISPLAY ]";
        JLabel label = new JLabel(labelText);
        label.setBackground(new Color(180, 180, 255));
        label.setForeground(Color.WHITE);
        label.setOpaque(true);
        row1.add(label);

        return row1;
    }

    private JPanel initRow2() {
        JPanel row2 = new JPanel();

        String labelText = "[C] [\u00b1] [%] [\u00f7]";
        JLabel label = new JLabel(labelText);
        row2.add(label);

        return row2;
    }

    private JPanel initRow3() {
        JPanel row3 = new JPanel();

        String labelText = "[7] [8] [9] [\u00d7]";
        JLabel label = new JLabel(labelText);
        row3.add(label);

        return row3;
    }

        private JPanel initRow4() {
        JPanel row4 = new JPanel();

        String labelText = "[4] [5] [6] [-]";
        JLabel label = new JLabel(labelText);
        row4.add(label);

        return row4;
    }

        private JPanel initRow5() {
        JPanel row5 = new JPanel();

        String labelText = "[1] [2] [3] [+]";
        JLabel label = new JLabel(labelText);
        row5.add(label);

        return row5;
    }

        private JPanel initRow6() {
        JPanel row6 = new JPanel();

        String labelText = "[0   ] [.] [=]";
        JLabel label = new JLabel(labelText);
        row6.add(label);

        return row6;
    }
}