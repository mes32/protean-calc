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

    private String enteredNum;
    private PrecisionNumber agregateNum;
    private PrecisionNumber actorNum;

    private ArithmeticOperator operator;
    private boolean isOperatorSet;
    private boolean displayDecimal;
    private int decimalPrecision;

    CalculatorDataModel() {
        displayNumber = 0.0;
        agregateNumber = 0.0;
        actorNumber = 0.0;

        operator = null;
        isOperatorSet = false;
        displayDecimal = false;
        decimalPrecision = 0;
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
        displayDecimal = false;
        decimalPrecision = 0;

        display();
    }

    public void evaluate() {
        agregateNumber = operator.evaluate(agregateNumber, actorNumber);
        displayNumber = agregateNumber;
        displayDecimal = false;
        decimalPrecision = 0;
        display();
    }

    public void setFunctionAdd() {
        operator = ADD;
        isOperatorSet = true;
        displayDecimal = false;
        decimalPrecision = 0;
    }

    public void setFunctionSubtract() {
        operator = SUBTRACT;
        isOperatorSet = true;
        displayDecimal = false;
        decimalPrecision = 0;
    }

    public void setFunctionDivide() {
        operator = DIVIDE;
        isOperatorSet = true;
        displayDecimal = false;
        decimalPrecision = 0;
    }

    public void setFunctionMultiply() {
        operator = MULTIPLY;
        isOperatorSet = true;
        displayDecimal = false;
        decimalPrecision = 0;
    }

    public void negate() {
        displayNumber *= -1;
        actorNumber = displayNumber;
        display();
    }

    public void percent() {
        displayNumber /= 100.0;
        actorNumber = displayNumber;
        display();
    }

    public void setDecimal() {
        displayDecimal = true;
        display();
    }

    public void append(int input) {
        if (isOperatorSet) {
            isOperatorSet = false;
            agregateNumber = displayNumber;
            displayNumber = 0.0;
        }

        if (!displayDecimal) {
            displayNumber = 10.0 * displayNumber + input;
        } else {
            decimalPrecision += 1;
            displayNumber = displayNumber + (input / (Math.pow(10, decimalPrecision)));
        }

        actorNumber = displayNumber;
        display();
    }

    private void display() {
        view.updateDisplay(formatForDisplay(displayNumber));
    }

    private String formatForDisplay(double input) {
        if (input == (long) input)
            if (!displayDecimal) {
                return String.format("%d", (long)input);
            } else {
                return String.format("%d", (long)input) + ".";
            }
        else
            return String.valueOf(input);
    }
}