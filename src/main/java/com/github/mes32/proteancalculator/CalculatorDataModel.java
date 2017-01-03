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
    private double currentValue;
    private double previousValue;

    //private double displayedValue;
    //private double agregateValue;
    //private double actorValue;

    private int decimalPrecision;

    private ArithmeticOperator operator;

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

    public void evaluate() {
        System.out.println("In CalculatorDataModel - evaluate()");
    }

    public void setFunctionAdd() {
        System.out.println("In CalculatorDataModel - setFunctionAdd()");
    }

    public void setFunctionSubtract() {
        operator = SUBTRACT;
    }

    public void setFunctionDivide() {
        System.out.println("In CalculatorDataModel - setFunctionDivide()");
    }

    public void setFunctionMultiply() {
        System.out.println("In CalculatorDataModel - setFunctionMultiply()");
    }

    public void negate() {
        currentValue *= -1;
        display();
    }

    public void percent() {
        currentValue /= 100;
        display();
    }

    public void setDecimal() {
        System.out.println("In CalculatorDataModel - setDecimal()");
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