package ss9_dsa_danh_sach.exercise.arraylist;

import java.util.Arrays;

public class MyList <E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapacity(int minCapacity){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(int index, E element){

    }
    public void remove(int index){

    }
    public E get (int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size" + i);
        }
        return (E) element[i];
    }

    public void clear(){

    }

}
