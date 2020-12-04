package ru.mirea.pr11.zd4;



public class Subtract extends ExpressionParser {
    public Subtract(TripleExpression c1, TripleExpression c2) {
        super(c1, c2);
    }
    public Subtract(TripleExpression c1, TripleExpression c2,Space sp) {
        super(c1, c2);
    }
    public Subtract(TripleExpression c1,Space sp, TripleExpression c2) {
        super(c1, c2);
    }
    public Subtract(Space sp, TripleExpression c1, TripleExpression c2) {
        super(c1, c2);
    }
    @Override
    protected int evaluate(int fr, int b) throws Exception {
        if(b > 0 ? fr < Integer.MIN_VALUE + b : fr > Integer.MAX_VALUE + b)
            throw new InvalidException("overflow");
        return fr - b;
    }
}
