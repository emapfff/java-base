package org.example.HW2.Task1;


public record Negate(Expr expr) implements Expr {
    public Negate(double val) {
        this(new Constant(val));
    }

    @Override
    public double evaluate() {
        return -this.expr.evaluate();
    }
}
