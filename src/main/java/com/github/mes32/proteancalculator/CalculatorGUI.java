/*

	CalculatorGUI.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;

class CalculatorGUI {

    private CalculatorDataModel dataModel;
    private CalculatorViewModel viewModel;
    private CalculatorView view;
    private CalculatorController controller;

    CalculatorGUI(boolean showConfig) {
        if (showConfig) {
            System.out.println("showConfig = TRUE");
        } else {
            System.out.println("showConfig = FALSE");
        }

        dataModel = new CalculatorDataModel(view);
        viewModel = new CalculatorViewModel(view);
        view = new CalculatorView(viewModel, controller);
        controller = new CalculatorController(dataModel);
    }
}