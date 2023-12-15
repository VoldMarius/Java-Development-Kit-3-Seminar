package org.example;
import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        String t = "ololo";

        DataInputStream v = new DataInputStream(System.in);
        Integer k =5;
        GrandClass<Comparable,DataInputStream,Number> object = new GrandClass<>(t,v,k);
        object.printTypes();

    }
}