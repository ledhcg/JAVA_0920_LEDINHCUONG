package ru.mirea.pr11.zd4;

public class Divide extends ExpressionParser {
    public Divide(TripleExpression c1, TripleExpression c2) {
        super(c1, c2);
    }
    public Divide(TripleExpression c1, TripleExpression c2,Space sp){
        super(c1,c2);
    }
    public Divide(TripleExpression c1, Space sp, TripleExpression c2){
        super(c1,c2);
    }
    public Divide(Space sp,TripleExpression c1, TripleExpression c2){
        super(c1,c2);
    }
    @Override
    protected int evaluate(int fr, int b) throws Exception {
        if((fr == Integer.MIN_VALUE) && (b == -1))
            throw new InvalidException("overflow");
        if(b == 0)
            throw new InvalidException("division by zero");
        return fr/b;
    }
}
