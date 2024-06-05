package org.example.HW2.Task1;

public record Multiplication(Expr expr1, Expr expr2) implements Expr {
    public Multiplication(Expr expr, double val) {
        this(expr, new Constant(val));
    }

    public Multiplication(double val, Expr expr) {
        this(new Constant(val), expr);
    }

    public Multiplication(double val1, double val2) {
        this(new Constant(val1), new Constant(val2));
    }

    @Override
    public double evaluate() {
        return this.expr1.evaluate() * this.expr2.evaluate();
    }
}
