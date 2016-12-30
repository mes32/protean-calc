/*

	CalculatorCLI.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;

class CalculatorCLI {
    CalculatorCLI() {

    }

    public boolean evaluate(BufferedReader reader) {

        String expression = null;
        boolean foundExpression = false;
        while (true) {
            try {
                if (!reader.ready()) {
                    return foundExpression;
                }

                expression = reader.readLine();
                if (expression == null || expression.equals("")) {
                    break;
                }
                evaluate(expression);
                foundExpression = true;
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }   
        }
        return foundExpression;
    }

    public void evaluate(String expression) {
        System.out.println("CalculatorCLI.evaluate() - expression = " + expression);
    }
}