/*

	CalculatorDataModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.io.*;
import javax.swing.*;

class CalculatorDataModel {

    private CalculatorView view;
    private String currentValue;
    private String previousValue;

    CalculatorDataModel() {
        
    }

    public void setView(CalculatorView view) {
        this.view = view;
    }
}