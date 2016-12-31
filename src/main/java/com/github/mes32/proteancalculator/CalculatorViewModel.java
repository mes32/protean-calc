/*

	CalculatorViewModel.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.awt.Dimension;

class CalculatorViewModel {

    private CalculatorView view;

    private static final Dimension CENTER_COLUMN_LEFT_MARGIN = new Dimension(20, 0);
    private static final Dimension CENTER_COLUMN_RIGHT_MARGIN = new Dimension(20, 0);
    private static final Dimension ROW_SPACER = new Dimension(0, 10);

    CalculatorViewModel(CalculatorView view) {
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
}