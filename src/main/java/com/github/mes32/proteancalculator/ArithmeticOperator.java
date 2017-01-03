/*

	ArithmeticOperator.java - protean-calculator

 */


package com.github.mes32.proteancalculator;


abstract class ArithmeticOperator {
    abstract public double evaluate(double agregate, double actor);
}

class Addition extends ArithmeticOperator {
    public double evaluate(double agregate, double actor) {
        return agregate + actor;
    }
}

class Subtraction extends ArithmeticOperator {
    public double evaluate(double agregate, double actor) {
        return agregate - actor;
    }
}

class Division extends ArithmeticOperator {
    public double evaluate(double agregate, double actor) {
        return agregate / actor;
    }
}

class Multiplication extends ArithmeticOperator {
    public double evaluate(double agregate, double actor) {
        return agregate * actor;
    }
}
