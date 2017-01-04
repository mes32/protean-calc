/*

	CalculatorDataModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class CalculatorDataModel {

    private static final Subtraction SUBTRACT = new Subtraction();
    private static final Addition ADD = new Addition();
    private static final Division DIVIDE = new Division();
    private static final Multiplication MULTIPLY = new Multiplication();


    private CalculatorView view;

    private double displayNumber;
    private double agregateNumber;
    private double actorNumber;

    private int decimalPrecision;

    private boolean isOperatorSet;

    private ArithmeticOperator operator;

    CalculatorDataModel() {
        displayNumber = 0.0;
        agregateNumber = 0.0;
        actorNumber = 0.0;

        operator = null;
        isOperatorSet = false;
    }

    public void setView(CalculatorView view) {
        this.view = view;
    }

    public void clear() {
        displayNumber = 0.0;
        agregateNumber = 0.0;
        actorNumber = 0.0;

        operator = null;
        isOperatorSet = false;

        display();
    }

    public void evaluate() {
        agregateNumber = operator.evaluate(agregateNumber, actorNumber);
        displayNumber = agregateNumber;
        display();
    }

    public void setFunctionAdd() {
        operator = ADD;
        isOperatorSet = true;
    }

    public void setFunctionSubtract() {
        operator = SUBTRACT;
        isOperatorSet = true;
    }

    public void setFunctionDivide() {
        operator = DIVIDE;
        isOperatorSet = true;
    }

    public void setFunctionMultiply() {
        operator = MULTIPLY;
        isOperatorSet = true;
    }

    public void negate() {
        displayNumber *= -1;
        display();
    }

    public void percent() {
        displayNumber /= 100;
        display();
    }

    public void setDecimal() {
        System.out.println("In CalculatorDataModel - setDecimal()");
    }

    public void append(int input) {
        if (isOperatorSet) {
            isOperatorSet = false;
            agregateNumber = displayNumber;
            displayNumber = 0.0;
        }

        displayNumber = 10 * displayNumber + input;
        actorNumber = displayNumber;
        display();
    }

    private void display() {
        view.updateDisplay(formatForDisplay(displayNumber));
    }

    private String formatForDisplay(double input) {
        if (input == (long) input)
            return String.format("%d", (long)input);
        else
            return String.valueOf(input);
    }
}