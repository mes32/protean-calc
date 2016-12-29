/*

	ProteanCalculator.java

	The main class for project protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;

class ProteanCalculator {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.exit(1);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CalculatorCLI commandlineInterface = new CalculatorCLI();
        if (commandlineInterface.evaluate(reader)) {
            return;
        }

        if (args.length == 0) {
            boolean showConfig = false;
            new CalculatorGUI(showConfig);
        } else if (args[0].equals("-ryo")) {
            boolean showConfig = true;
            new CalculatorGUI(showConfig);
        } else {
            String expression = args[0];
            commandlineInterface.evaluate(expression);
        }
    }
}