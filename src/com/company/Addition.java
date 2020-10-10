package com.company;

public class Addition implements Expression{

    Expression expressionLeft;
    Expression expressionRight;

    public Addition(Expression expressionLeft, Expression expressionRight){
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interpret() {
        return expressionLeft.interpret()+expressionRight.interpret();
    }
}
