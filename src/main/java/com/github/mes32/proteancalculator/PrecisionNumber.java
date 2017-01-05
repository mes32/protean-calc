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

    public String toString() {
        return setScale(MAX_SCALE, BigDecimal.ROUND_HALF_UP).toString();
    } 
}