package ru.mirea.pr11.zd4;


public class Add extends ExpressionParser {
    public Add(TripleExpression c1, TripleExpression c2) {
        super(c1, c2);
    }
    public Add(TripleExpression c1, TripleExpression c2,Space sp){
        super(c1,c2);
    }
    public Add(TripleExpression c1, Space sp, TripleExpression c2){
        super(c1,c2);
    }
    public Add(Space sp,TripleExpression c1, TripleExpression c2){
        super(c1,c2);
    }
    @Override
    protected int evaluate(int fr, int b) throws Exception {
        if(b > 0 ? fr > Integer.MAX_VALUE - b : fr < Integer.MIN_VALUE - b)
            throw new InvalidException("overflow");

        return fr+b;
    }
}
