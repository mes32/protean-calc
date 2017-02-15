/*

	ConfigurationController.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.awt.*;
import java.util.*;

class ConfigurationController {

    private CalculatorViewModel dataModel;
    private Random rand;

    ConfigurationController(CalculatorViewModel dataModel) {
        this.dataModel = dataModel;
        rand = new Random();
    }

    public void pressRandomizeDisplayForegroundColor() {
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);
        Color color = new Color(r, g, b);

        dataModel.setDisplayForeground(color);
    }
}