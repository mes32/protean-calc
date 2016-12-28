/*

	CalculatorGUI.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;

class CalculatorGUI {
	CalculatorGUI(boolean showConfig) {
		if (showConfig) {
			System.out.println(" - CalculatorGUI - show configuration GUI");
			new ConfigurationGUI();
		} else {
			System.out.println(" - CalculatorGUI - don't show configuration GUI");
		}
	}
}