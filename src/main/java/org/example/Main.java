package org.example;
import HomeWork.Calculator;

import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
//        String t = "ololo";
//
//        DataInputStream v = new DataInputStream(System.in);
//        Integer k =5;
//        GrandClass<Comparable,DataInputStream,Number> object = new GrandClass<>(t,v,k);
//        object.printTypes();

//        Number[] numArray = new Number[3];
//        numArray[0] = 1;
//        numArray[1] = 2.0f;
//        numArray[2] = 84866514848L;
//
//        NewList<Number> myNewList = new NewList<>(numArray);
//        myNewList.print();
//        System.out.println("Size:"+ myNewList.getSize());

//        Integer element = 23;
//        myNewList.addElement(element);
//        System.out.println("Size:"+ myNewList.getSize());
//        myNewList.print();
//        myNewList.remuoveElement(1);
//        System.out.println("Size:"+ myNewList.getSize());
//        myNewList.print();
//        for (Number number:
//                myNewList ) {
//            System.out.println(number);
//
//        }
        int num1 = 234;
        float num2 = 0.456f;
        System.out.println(num1 + " + " + num2 + " = " + Calculator.sum(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Calculator.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Calculator.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Calculator.divide(num1, num2));
        }

    }
