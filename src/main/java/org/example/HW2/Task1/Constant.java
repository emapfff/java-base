package org.example.HW2.Task1;

public record Constant(double val) implements Expr {
    @Override
    public double evaluate() {
        return this.val;
    }
}
