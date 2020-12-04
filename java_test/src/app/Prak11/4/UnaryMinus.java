package ru.mirea.pr11.zd4;

public class UnaryMinus implements TripleExpression{
    TripleExpression um;

    public UnaryMinus(TripleExpression um) {
        this.um = um;
    }
    public UnaryMinus(TripleExpression um,Space sp) {
        this.um = um;
    }
    public UnaryMinus(Space sp, TripleExpression um) {
        this.um = um;
    }

    @Override
    public int evaluate(int x, int y, int z) throws Exception {
        if(um instanceof Const){
            return (-1)*((Const) um).constant;
        }
        else if(um instanceof Variable){
            return (-1)*um.evaluate(x,y,z);
        }
        else if(um instanceof ExpressionParser){
            return (-1)* um.evaluate(x,y,z);
        }
        else if(um instanceof UnaryMinus){
            return (-1)*um.evaluate(x,y,z);
        }
        else if(um instanceof Parentheses){
            return (-1)*um.evaluate(x,y,z);
        }
        return 0;
    }
}
