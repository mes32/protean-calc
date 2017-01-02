/*

	CalculatorDataModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class CalculatorDataModel {

    private CalculatorView view;
    private double currentValue;
    private double previousValue;

    CalculatorDataModel() {
        currentValue = 0;
        previousValue = 0;
    }

    public void setView(CalculatorView view) {
        this.view = view;
    }

    public void clear() {
        currentValue = 0;
        display();
    }

    public void negate() {
        currentValue *= -1;
        display();
    }

    public void append(int input) {
        currentValue = 10 * currentValue + input;
        display();
    }

    private void display() {
        view.updateDisplay(formatForDisplay(currentValue));
    }

    private String formatForDisplay(double input) {
        if (input == (long) input)
            return String.format("%d", (long)input);
        else
            return String.valueOf(input);
    }
}