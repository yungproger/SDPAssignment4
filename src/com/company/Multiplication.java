package com.company;

public class Multiplication implements Expression{

    Expression expressionLeft;
    Expression expressionRight;

    public Multiplication(Expression expressionLeft, Expression expressionRight){
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() {
        return expressionLeft.interpret()*expressionRight.interpret();
    }
}
