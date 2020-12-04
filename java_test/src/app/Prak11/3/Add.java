package ru.mirea.pr11.zd3;

public class Add extends Operation {
    public Add(InputExpression c1, InputExpression c2) {
        super(c1, c2);
    }
    @Override
    protected double evaluate(double c1, double c2) {
        return c1+c2;
    }
}
