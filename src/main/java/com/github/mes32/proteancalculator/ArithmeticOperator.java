/*

	ArithmeticOperator.java - protean-calculator

 */


package com.github.mes32.proteancalculator;


abstract class ArithmeticOperator {
    abstract public PrecisionNumber evaluate(PrecisionNumber agregate, PrecisionNumber actor);
}

class Addition extends ArithmeticOperator {
    public PrecisionNumber evaluate(PrecisionNumber agregate, PrecisionNumber actor) {
        //return agregate + actor;
        return agregate.add(actor);
    }
}

class Subtraction extends ArithmeticOperator {
    public PrecisionNumber evaluate(PrecisionNumber agregate, PrecisionNumber actor) {
        //return agregate - actor;
        return agregate.subtract(actor);
    }
}

class Division extends ArithmeticOperator {
    public PrecisionNumber evaluate(PrecisionNumber agregate, PrecisionNumber actor) {
        //return agregate / actor;
        return agregate.divide(actor);
    }
}

class Multiplication extends ArithmeticOperator {
    public PrecisionNumber evaluate(PrecisionNumber agregate, PrecisionNumber actor) {
        //return agregate * actor;
        return agregate.multiply(actor);
    }
}
