/*

	ConfigurationGUI.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;

class ConfigurationGUI {
    ConfigurationGUI(CalculatorViewModel dataModel, CalculatorView calculatorView) {
        ConfigurationViewModel viewModel = new ConfigurationViewModel();
        ConfigurationController controller = new ConfigurationController(dataModel);
        ConfigurationView view = new ConfigurationView(viewModel, controller);
    }
}