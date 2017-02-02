/*

	CalculatorViewModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.awt.Dimension;
import java.awt.Color;

class CalculatorViewModel {

    private CalculatorView view;

    private static final Dimension CENTER_COLUMN_LEFT_MARGIN = new Dimension(20, 0);
    private static final Dimension CENTER_COLUMN_RIGHT_MARGIN = new Dimension(20, 0);
    private static final Dimension ROW_SPACER = new Dimension(0, 10);
    private static final Dimension BUTTON_SPACER = new Dimension(0, 5);

    private Color displayForeground;

    CalculatorViewModel() {
        displayForeground = Color.BLACK;
    }

    public void setView(CalculatorView view) {
        this.view = view;
    }

    public Dimension getCenterColumnLeftMargin() {
        return CENTER_COLUMN_LEFT_MARGIN;
    }

    public Dimension getCenterColumnRightMargin() {
        return CENTER_COLUMN_RIGHT_MARGIN;
    }

    public Dimension getRowSpacer() {
        return ROW_SPACER;
    }

    public Dimension getButtonSpacer() {
        return BUTTON_SPACER;
    }

    public Color getDisplayForeground() {
        return displayForeground;
    }

    public void setDisplayForeground(Color color) {
        displayForeground = color;
    }

}