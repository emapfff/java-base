package org.example.HW2.Task1;

import static java.lang.Math.pow;

public record Exponent(Expr expr1, Expr expr2) implements Expr {
    public Exponent(Expr expr, double val) {
        this(expr, new Constant(val));
    }

    public Exponent(double val, Expr expr) {
        this(new Constant(val), expr);
    }

    public Exponent(double val1, double val2) {
        this(new Constant(val1), new Constant(val2));
    }

    @Override
    public double evaluate() {
        return pow(this.expr1.evaluate(), expr2.evaluate());
    }
}
