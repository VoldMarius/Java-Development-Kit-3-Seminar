package org.example;

import java.io.DataInput;
import java.io.InputStream;

//Создать обобщенный класс с тремя параметрами (T, V, K).
// Класс содержит три переменные типа (T, V, K), конструктор,
// принимающий на вход параметры типа (T, V, K), методы
//возвращающие значения трех переменных. Создать
// метод, выводящий на консоль имена
//классов для трех переменных класса. Наложить ограничения на параметры
// типа T должен реализовать интерфейс Comparable (классы оболочки,
// String), V должен реализовать интерфейс DataInput и расширять
// класс InputStream, K должен расширять класс
//Number


public class GrandClass <T extends Comparable,
                         V extends InputStream & DataInput,
                         K extends Number>{
    public T t;
    public V v;
    public K k;

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public GrandClass (T t, V v, K k){
        this.k = k;
        this.t = t;
        this.v = v;

    }
    public void printTypes(){
        System.out.println(t.getClass().getSimpleName()+" "+
                v.getClass().getSimpleName()+" "+
                k.getClass().getSimpleName());

    }
}

