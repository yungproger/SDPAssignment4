package com.company;

public class Subtraction implements Expression{

    Expression expressionLeft;
    Expression expressionRight;

    public Subtraction(Expression expressionLeft, Expression expressionRight){
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() {
        return expressionLeft.interpret()-expressionRight.interpret();
    }
}
