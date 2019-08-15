package com.multi.configs.custom;


import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MyCustom {

    public static void main(String[] args) {
        try {
            modify();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void modify() throws Exception {

        MyList<String> myList = new MyList();

        myList.add("123");
        myList.add("456");
        myList.add("789");

        myList.forEach2(s -> {
            System.out.println("Hello");
            throw new Exception("Checked Exception from Consumer Interface!");
        });
/*

        myList.stream().forEach2(s -> {
            throw new Exception("Checked Exception from Consumer Interface!");
        });

        */
    }

}

interface MyConsumer<T> extends Consumer<T>{
    void myAccept(T t) throws Exception;

    @Override
    default void accept(T t){

    }
}

interface MyStream<E> extends Stream<E>{
    void forEach2(MyConsumer<? super E> action) throws Exception;
    default void forEach(Consumer<? super E> action){}
}

class MyList<E> extends ArrayList<E>{


    public void forEach2(MyConsumer<? super E> action) throws Exception{
        Objects.requireNonNull(action);
        final int expectedModCount = modCount;
        @SuppressWarnings("unchecked")
        final E[] elementData = (E[]) this.toArray();
        final int size = this.size();
        for (int i=0; modCount == expectedModCount && i < size; i++) {
            action.myAccept(elementData[i]);
        }
        if (modCount != expectedModCount) {
            throw new ConcurrentModificationException();
        }

    }

    public MyStream<E> stream() {
        return (MyStream<E>)StreamSupport.stream(spliterator(), false);
    }
}