package ru.mirea.pr11.zd4;

public abstract class ExpressionParser implements TripleExpression{
    final TripleExpression front;
    final TripleExpression back;

    public ExpressionParser(TripleExpression front, TripleExpression back) {
        this.front = front;
        this.back = back;
    }

    @Override
    public int evaluate(int x, int y, int z) throws Exception {
        return evaluate(front.evaluate(x,y,z), back.evaluate(x,y,z));
    }

    protected abstract int evaluate(int fr,int b) throws Exception;
}
