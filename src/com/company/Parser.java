package com.company;


import java.util.ArrayList;

import java.util.List;

public class Parser {

    public Parser(){

    }

    public static void main(String[] args) {
        // String expression = "4 + 5 - 5 * 4 - 10";
        // String expression = "1 + 2 - 3 * 4 * 5";
        String expression = "6 * 3 + 32 - 4 * 10";
        String[] expressionParts = expression.split(" ");
        List<String> expressionList = new ArrayList<>();
        for (String s : expressionParts) {
            expressionList.add(s);
        }
        Expression expressionType;
        String operator;
        int temp;

        for (int i = 1; i <= expressionList.size() - 2; i += 2) {
            operator = expressionList.get(i);
            if (isOperator(operator)) {
                if (operator.equals("*")) {
                    expressionType = getOperatorInstance(operator,
                            new Number(Integer.parseInt(expressionList.get(i - 1))),
                            new Number(Integer.parseInt(expressionList.get(i + 1))));
                    temp = expressionType.interpret();
                    expressionList.remove(i - 1);
                    expressionList.remove(i - 1);
                    expressionList.remove(i - 1);
                    expressionList.add(i - 1, String.valueOf(temp));
                    i = -1;
                }
            }
        }



        for(int i = 1;i <= expressionList.size() - 2; i+= 2){
            operator = expressionList.get(i);
            if(isOperator(operator)){
                if(operator.equals("+")){
                    expressionType = getOperatorInstance(operator,
                            new Number(Integer.parseInt(expressionList.get(i-1))),
                            new Number(Integer.parseInt(expressionList.get(i+1))));
                    temp = expressionType.interpret();
                    expressionList.remove(i-1);
                    expressionList.remove(i-1);
                    expressionList.remove(i-1);
                    expressionList.add(i-1,String.valueOf(temp));
                    i = -1;
                }
            }
        }

        for(int i = 1;i <= expressionList.size() - 2; i+= 2){
            operator = expressionList.get(i);
            if(isOperator(operator)){
                if(operator.equals("-")){
                    expressionType = getOperatorInstance(operator,
                            new Number(Integer.parseInt(expressionList.get(i-1))),
                            new Number(Integer.parseInt(expressionList.get(i+1))));
                    temp = expressionType.interpret();
                    expressionList.remove(i-1);
                    expressionList.remove(i-1);
                    expressionList.remove(i-1);
                    expressionList.add(i-1,String.valueOf(temp));
                    i = -1;
                }
            }
        }

        System.out.println(expressionList.get(0));

    }

    public static boolean isOperator(String operator){
        return operator.equals("+") || operator.equals("-") || operator.equals("*");

    }

    public static Expression getOperatorInstance(String expression, Expression expressionLeft, Expression expressionRight){
        return switch (expression) {
            case "+" -> new Addition(expressionLeft, expressionRight);
            case "-" -> new Subtraction(expressionLeft, expressionRight);
            case "*" -> new Multiplication(expressionLeft, expressionRight);
            default -> null;
        };
    }

}
