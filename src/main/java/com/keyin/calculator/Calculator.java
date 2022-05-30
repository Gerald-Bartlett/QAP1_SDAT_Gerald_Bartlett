package com.keyin.calculator;



public class Calculator {
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int difference(int firstNum, int secondNum){
        return secondNum - firstNum;
    }

    public int product (int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int quotient(int firstNum, int secondNum) {
        return secondNum / firstNum;
        }

    public double square(double Num) {
        double square = Num * Num;
        return  square;
    }


    public double squareRoot(double Num) {
        double squareRoot = Math.sqrt(Num);
        return  squareRoot;
    }
}

