/*

	PrecisionNumber.java - protean-calculator

 */


package com.github.mes32.proteancalculator;

import java.math.*;

class PrecisionNumber extends BigDecimal {

    public static final int MAX_SCALE = 8;

    PrecisionNumber(String input) {
        super(input);
    }

    public PrecisionNumber add(PrecisionNumber augend) {
        return new PrecisionNumber(super.add(augend).toString());
    }

    public PrecisionNumber divide(PrecisionNumber divisor) {
        return new PrecisionNumber(super.divide(divisor).toString());
    }

        public PrecisionNumber multiply(PrecisionNumber multiplicand) {
        return new PrecisionNumber(super.multiply(multiplicand).toString());
    }

        public PrecisionNumber subtract(PrecisionNumber subtrahend) {
        return new PrecisionNumber(super.subtract(subtrahend).toString());
    }

    public String toString() {
        return setScale(MAX_SCALE, BigDecimal.ROUND_HALF_UP).toString();
    } 
}