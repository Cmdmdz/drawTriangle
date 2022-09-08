package com.company;



public class Main {

    public static void main(String args[]) {
        DrawTriangle x = new DrawTriangle();
        ConvertMoney convertMoney = new ConvertMoney();
        System.out.print(x.triangle(4));
        System.out.println(convertMoney.convertMoneyCurrency(100000.0,CurrencyType.WON.toString()));

    }
}
