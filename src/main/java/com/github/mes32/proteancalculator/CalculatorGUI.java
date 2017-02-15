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
        dataModel = new CalculatorDataModel();
        viewModel = new CalculatorViewModel();
        controller = new CalculatorController(dataModel);
        view = new CalculatorView(dataModel, viewModel, controller);
        dataModel.setView(view);
        viewModel.setView(view);

        if (showConfig) {
            new ConfigurationGUI(viewModel, view);
        }
    }
}