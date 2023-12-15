package org.example;
//дание:
//– Описать собственную коллекцию – список
// на основе массива. Коллекция должна иметь
//возможность хранить любые типы данных,
// иметь методы добавления и удаления элементов.
public class NewList<E> {
    private E[] array;
    private int size;

    public NewList(E[] baseArray){

    this.array = baseArray;
    size = array.length;
    }
    public <T extends E> void addElement (E element){
        if (size == array.length) {
            Object[] newArray = new Object[array.length *2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array =(E[]) newArray;
        }else {

            array[size] = element;
        }
            size++;
        }
    public <T extends E> void remuoveElement (int index) {
        if (index <0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array,index + 1, array,
                                      index,size - index-1);
        array[size -1] = null;
        size --;
        }


    public int getSize(){
                return size;
        }


    public void print(){
        for (E elements: array
             ) {
            System.out.print (elements+" ");
        }
        System.out.println("-------------------");

    }

}
