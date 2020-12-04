package ru.mirea.pr11.zd4;

public class Parentheses implements TripleExpression{
    TripleExpression parentheses;

    public Parentheses(TripleExpression parentheses) {
        this.parentheses = parentheses;
    }
    public Parentheses(TripleExpression parentheses,Space sp) {
        this.parentheses = parentheses;
    }
    public Parentheses(Space sp,TripleExpression parentheses) {
        this.parentheses = parentheses;
    }

    @Override
    public int evaluate(int x, int y, int z) throws Exception {
        return parentheses.evaluate(x,y,z);
    }
}
