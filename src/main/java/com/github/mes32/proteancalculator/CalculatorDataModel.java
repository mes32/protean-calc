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
    private boolean enteredSomething;
    private boolean enteredDecimalPoint;

    private PrecisionNumber displayNum;
    private PrecisionNumber agregateNum;
    private PrecisionNumber actorNum;

    private ArithmeticOperator operator;
    private boolean isOperatorSet;

    CalculatorDataModel() {
        displayNumber = 0.0;
        agregateNumber = 0.0;
        actorNumber = 0.0;

        enteredNum = "0";
        enteredSomething = false;
        enteredDecimalPoint = false;

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

        enteredNum = "0";
        enteredSomething = false;
        enteredDecimalPoint = false;

        operator = null;
        isOperatorSet = false;

        display();
    }

    public void evaluate() {
        agregateNum = operator.evaluate(agregateNum, actorNum);
        //displayNumber = agregateNumber;

        // *** Temporary
        enteredNum = agregateNum.toString();
        display();
    }

    public void setFunctionAdd() {
        operator = ADD;
        isOperatorSet = true;
        enteredSomething = false;
        enteredDecimalPoint = false;
    }

    public void setFunctionSubtract() {
        operator = SUBTRACT;
        isOperatorSet = true;
        enteredSomething = false;
        enteredDecimalPoint = false;
    }

    public void setFunctionDivide() {
        operator = DIVIDE;
        isOperatorSet = true;
        enteredSomething = false;
        enteredDecimalPoint = false;
    }

    public void setFunctionMultiply() {
        operator = MULTIPLY;
        isOperatorSet = true;
        enteredSomething = false;
        enteredDecimalPoint = false;
    }

    public void negate() {
        //displayNumber *= -1;
        //actorNumber = displayNumber;

        actorNum = new PrecisionNumber(enteredNum);
        PrecisionNumber negativeOne = new PrecisionNumber("-1.0");
        actorNum = actorNum.multiply(negativeOne);

        enteredNum = actorNum.toString();
        display();
    }

    public void percent() {
        //displayNumber /= 100.0;
        //actorNumber = displayNumber;

        actorNum = new PrecisionNumber(enteredNum);
        PrecisionNumber oneHundred = new PrecisionNumber("100.0");
        actorNum = actorNum.divide(oneHundred);

        enteredNum = actorNum.toString();
        display();
    }

    public void setDecimal() {
        if (!enteredDecimalPoint) {
            enteredNum += ".";
            enteredSomething = true;
            enteredDecimalPoint = true;
        }
        display();
    }

    public void append(int input) {
        if (isOperatorSet) {
            isOperatorSet = false;
            agregateNumber = displayNumber;
            enteredSomething = false;
            enteredDecimalPoint = false;
        }

        if (!enteredSomething) {
            enteredNum = "" + input;
        } else {
            enteredNum += input;
        }
        enteredSomething = true;

        // *** Temporary. Parse displayNumber and actorNumber from enteredNum
        //displayNumber = Double.parseDouble(enteredNum);
        //actorNumber = Double.parseDouble(enteredNum);

        displayNum = new PrecisionNumber(enteredNum);  // displayNum shouldn't be needed
        actorNum = new PrecisionNumber(enteredNum);

        display();
    }

    private void display() {
        view.updateDisplay(enteredNum);
    }

    private String formatForDisplay(double input) {
        if (input == (long) input)
            return String.format("%d", (long)input);
        else
            return String.valueOf(input);
    }
}