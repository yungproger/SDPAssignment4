package com.company;

public class Number implements Expression{

    private int number;

    public Number(int number){
        setNumber(number);
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }


    @Override
    public int interpret() {
        return this.number;
    }
}
