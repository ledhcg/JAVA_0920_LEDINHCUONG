package ru.mirea.pr11.zd4;


public class Variable implements TripleExpression {
    final String val;
    public Variable(String val){
        this.val=val;
    }
    public Variable(String val,Space sp){
        this.val=val;
    }
    public Variable(Space sp, String val){
        this.val = val;
    }

    @Override
    public int evaluate(int x, int y, int z){
        if(val.equals("x")){
            return x;
        }
        else if(val.equals("y")){
            return y;
        }
        else
            return z;
    }
}
