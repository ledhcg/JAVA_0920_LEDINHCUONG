package ru.mirea.pr11.zd4;



public class Const implements TripleExpression {
    final int constant;
    public Const(int constant){
        this.constant=constant;
    }

    @Override
    public int evaluate(int x, int y, int z) throws Exception {
        return constant;
    }
}
