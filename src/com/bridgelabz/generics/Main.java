package com.bridgelabz.generics;

public class Main {
    public static void main(String[] args) {
        MaxInt maxInt = new MaxInt();
        System.out.println("Test case 1");
        maxInt.maxvalue(7,5,6);
        System.out.println("Test case 2");
        maxInt.maxvalue(5,6,4);
        System.out.println("Test case 3");
        maxInt.maxvalue(5,6,8);
        MaxFloat maxFloat = new MaxFloat();
        System.out.println("Test case 1");
        maxFloat.maxvalue(7.8F,5.5F,6.3F);
        System.out.println("Test case 2");
        maxFloat.maxvalue(5.2F,6.3F,4.5F);
        System.out.println("Test case 3");
        maxFloat.maxvalue(5.2F,6.2F,8.6F);
    }
}
