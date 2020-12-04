package ru.mirea.pr11.zd4;

import ru.mirea.pr11.zd3.InputExpression;

public abstract class Operation implements InputExpression {
    final InputExpression c1;
    final InputExpression c2;

    public Operation(InputExpression c1,InputExpression c2){
        this.c1=c1;
        this.c2=c2;
    }
    public double evaluate(double val){
        if(c1 instanceof Const){
            if(c2 instanceof Const){
                return evaluate(((Const) c1).constant,((Const) c2).constant);
            }
            if(c2 instanceof Variable){
                return evaluate(((Const) c1).constant,val);
            }
            if(c2 instanceof Operation){
                return evaluate(((Const) c1).constant,((Operation) c2).evaluate(val));
            }
        }

        if(c1 instanceof Variable){
            if(c2 instanceof Const){
                return evaluate(val,((Const) c2).constant);
            }
            if(c2 instanceof Variable){
                return evaluate(val,val);
            }
            if(c2 instanceof Operation){
                return evaluate(val,((Operation) c2).evaluate(val));
            }
        }

        if(c1 instanceof Operation){
            if(c2 instanceof Const){
                return evaluate(((Operation) c1).evaluate(val),((Const) c2).constant);
            }
            if(c2 instanceof Variable){
                return evaluate(((Operation) c1).evaluate(val),val);
            }
            if(c2 instanceof Operation){
                return evaluate(((Operation) c1).evaluate(val),((Operation) c2).evaluate(val));
            }
        }
        return 0;
    }
    protected abstract double evaluate(double c1,double c2);
}
