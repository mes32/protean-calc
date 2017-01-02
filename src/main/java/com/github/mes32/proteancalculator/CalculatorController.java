/*

	CalculatorController.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

class CalculatorController {

    private CalculatorDataModel dataModel;

    CalculatorController(CalculatorDataModel dataModel) {
        this.dataModel = dataModel;
    }

    public void pressClear() {
        dataModel.clear();
    }

    public void pressEquals() {
        dataModel.evaluate();
    }

    public void pressAdd() {
        dataModel.setFunctionAdd();
    }

    public void pressSubtract() {
        dataModel.setFunctionSubtract();
    }

    public void pressDivide() {
        dataModel.setFunctionDivide();
    }

    public void pressMultiply() {
        dataModel.setFunctionMultiply();
    }

    public void pressPlusMinus() {
        dataModel.negate();
    }

    public void pressPercent() {
        dataModel.percent();
    }

    public void pressDecimal() {
        dataModel.setDecimal();
    }

    public void press0() {
        dataModel.append(0);
    }

    public void press1() {
        dataModel.append(1);
    }

    public void press2() {
        dataModel.append(2);
    }

    public void press3() {
        dataModel.append(3);
    }

    public void press4() {
        dataModel.append(4);
    }

    public void press5() {
        dataModel.append(5);
    }

    public void press6() {
        dataModel.append(6);
    }

    public void press7() {
        dataModel.append(7);
    }

    public void press8() {
        dataModel.append(8);
    }

    public void press9() {
        dataModel.append(9);
    }

}