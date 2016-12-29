/*

	CalculatorCLI.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;

class CalculatorCLI {
    CalculatorCLI() {
        System.out.println(" - CalculatorCLI - ");
    }

    public boolean evaluate(BufferedReader reader) {
        System.out.println("CalculatorCLI.evaluate() - BufferedReader");
        return true;
    }

    public boolean evaluate(String line) {
        System.out.println("CalculatorCLI.evaluate() - String");
        return true;
    }
}