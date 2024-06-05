package org.example.HW2.Task1;

import org.example.HW2.Task1.Multiplication;
import org.example.HW2.Task1.Negate;

public sealed interface Expr permits Addition, Constant, Exponent, Multiplication, Negate {
    double evaluate();
}
