/*

	ArithmeticOperator.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.math.*;


abstract class ArithmeticOperator {

    public static final Add ADD = new Add();
    public static final Divide DIVIDE = new Divide();
    public static final Subtract SUBTRACT = new Subtract();
    public static final Multiply MULTIPLY = new Multiply();

    protected static final int DECIMAL_PRECISION = 9;
    protected static final MathContext MC = new MathContext(DECIMAL_PRECISION);

    abstract public BigDecimal evaluate(BigDecimal agregate, BigDecimal actor);
}

class Add extends ArithmeticOperator {
    public BigDecimal evaluate(BigDecimal agregate, BigDecimal actor) {
        return agregate.add(actor, super.MC);
    }
}

class Subtract extends ArithmeticOperator {
    public BigDecimal evaluate(BigDecimal agregate, BigDecimal actor) {
        return agregate.subtract(actor, super.MC);
    }
}

class Divide extends ArithmeticOperator {
    public BigDecimal evaluate(BigDecimal agregate, BigDecimal actor) {
        return agregate.divide(actor, super.MC);
    }
}

class Multiply extends ArithmeticOperator {
    public BigDecimal evaluate(BigDecimal agregate, BigDecimal actor) {
        return agregate.multiply(actor, super.MC);
    }
}
