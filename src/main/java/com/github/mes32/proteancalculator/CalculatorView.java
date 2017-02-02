/*

	CalculatorView.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class CalculatorView extends JFrame {

    private static final String GUI_TITLE = "Calculator";
    private CalculatorViewModel viewModel;
    private CalculatorController controller;

    private JLabel displayLabel;

    CalculatorView(CalculatorViewModel viewModel, CalculatorController controller) {
        super(GUI_TITLE);
        this.viewModel = viewModel;
        this.controller = controller;

        update();

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void update() {
        add(intiMainPanel());
        pack();
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

        displayLabel = new JLabel("0");
        displayLabel.setForeground(viewModel.getDisplayForeground());
        row1.add(displayLabel);

        return row1;
    }

    private JPanel initRow2() {
        JPanel row2 = new JPanel();
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));

        JButton button;
        button = new JButton("C");
        button.addActionListener(e -> controller.pressClear());
        row2.add(button);
        row2.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("\u00b1");
        button.addActionListener(e -> controller.pressPlusMinus());
        row2.add(button);
        row2.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("%");
        button.addActionListener(e -> controller.pressPercent());
        row2.add(button);
        row2.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("\u00f7");
        button.addActionListener(e -> controller.pressDivide());
        row2.add(button);

        return row2;
    }

    private JPanel initRow3() {
        JPanel row3 = new JPanel();
        row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));

        JButton button;
        button = new JButton("7");
        button.addActionListener(e -> controller.press7());
        row3.add(button);
        row3.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("8");
        button.addActionListener(e -> controller.press8());
        row3.add(button);
        row3.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("9");
        button.addActionListener(e -> controller.press9());
        row3.add(button);
        row3.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("\u00d7");
        button.addActionListener(e -> controller.pressMultiply());
        row3.add(button);

        return row3;
    }

        private JPanel initRow4() {
        JPanel row4 = new JPanel();
        row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));

        JButton button;
        button = new JButton("4");
        button.addActionListener(e -> controller.press4());
        row4.add(button);
        row4.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("5");
        button.addActionListener(e -> controller.press5());
        row4.add(button);
        row4.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("6");
        button.addActionListener(e -> controller.press6());
        row4.add(button);
        row4.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("-");
        button.addActionListener(e -> controller.pressSubtract());
        row4.add(button);

        return row4;
    }

        private JPanel initRow5() {
        JPanel row5 = new JPanel();
        row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));

        JButton button;
        button = new JButton("1");
        button.addActionListener(e -> controller.press1());
        row5.add(button);
        row5.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("2");
        button.addActionListener(e -> controller.press2());
        row5.add(button);
        row5.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("3");
        button.addActionListener(e -> controller.press3());
        row5.add(button);
        row5.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("+");
        button.addActionListener(e -> controller.pressAdd());
        row5.add(button);

        return row5;
    }

        private JPanel initRow6() {
        JPanel row6 = new JPanel();
        row6.setLayout(new BoxLayout(row6, BoxLayout.X_AXIS));

        JButton button;
        button = new JButton("0");
        button.addActionListener(e -> controller.press0());
        row6.add(button);
        row6.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton(".");
        button.addActionListener(e -> controller.pressDecimal());
        row6.add(button);
        row6.add(Box.createRigidArea(viewModel.getButtonSpacer()));

        button = new JButton("=");
        button.addActionListener(e -> controller.pressEquals());
        row6.add(button);

        return row6;
    }

    public void updateDisplay(String newText) {
        displayLabel.setText(newText);

    }
}