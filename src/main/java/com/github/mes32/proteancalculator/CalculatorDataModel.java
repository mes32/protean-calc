/*

	CalculatorDataModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;
import java.math.*;

class CalculatorDataModel {

    private static final BigDecimal BD_100 = new BigDecimal("100.0");

    private CalculatorView view;

    private String enteredNumber;
    private boolean enteredSomething;
    private boolean enteredDecimalPoint;

    private BigDecimal agregateNumber;
    private BigDecimal actorNumber;

    private ArithmeticOperator operator;
    private boolean isOperatorSet;

    CalculatorDataModel() {
        enteredNumber = "0";
        enteredSomething = false;
        enteredDecimalPoint = false;

        operator = null;
        isOperatorSet = false;
    }

    public void setView(CalculatorView view) {
        this.view = view;
    }

    public void clear() {
        enteredNumber = "0";
        enteredSomething = false;
        enteredDecimalPoint = false;

        operator = null;
        isOperatorSet = false;

        display();
    }

    public void evaluate() {
        agregateNumber = operator.evaluate(agregateNumber, actorNumber);
        enteredNumber = agregateNumber.toPlainString();
        display();
    }

    public void setOperatorAdd() {
        setOperator(ArithmeticOperator.ADD);
    }

    public void setOperatorDivide() {
        setOperator(ArithmeticOperator.DIVIDE);
    }

    public void setOperatorMultiply() {
        setOperator(ArithmeticOperator.MULTIPLY);
    }

    public void setOperatorSubtract() {
        setOperator(ArithmeticOperator.SUBTRACT);
    }

    private void setOperator(ArithmeticOperator operator) {
        if (!enteredSomething) {
            return;
        }

        this.operator = operator;
        isOperatorSet = true;
        enteredSomething = false;
        enteredDecimalPoint = false;
    }

    public void negate() {
        actorNumber = new BigDecimal(enteredNumber);
        actorNumber = actorNumber.negate();

        enteredNumber = actorNumber.toPlainString();
        display();
    }

    public void percent() {
        actorNumber = new BigDecimal(enteredNumber);
        actorNumber = actorNumber.divide(BD_100);

        enteredNumber = actorNumber.toPlainString();
        display();
    }

    public void setDecimal() {
        if (!enteredDecimalPoint) {
            enteredNumber += ".";
            enteredSomething = true;
            enteredDecimalPoint = true;
        }
        display();
    }

    public void append(int input) {
        if (isOperatorSet) {
            isOperatorSet = false;
            enteredSomething = false;
            enteredDecimalPoint = false;
            agregateNumber = actorNumber;
        }

        if (!enteredSomething) {
            enteredNumber = "" + input;
        } else {
            enteredNumber += input;
        }
        enteredSomething = true;
        actorNumber = new BigDecimal(enteredNumber);

        display();
    }

    private void display() {
        view.updateDisplay(enteredNumber);
    }
}