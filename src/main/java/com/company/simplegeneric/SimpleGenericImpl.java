package com.company.simplegeneric;

/**
 * Created by anjalhussan on 10/17/16.
 */
public class SimpleGenericImpl<T> {
    private T object = null;

    public SimpleGenericImpl(T object) {
        this.object = object;
    }

    public T getObject(){
        return this.object;
    }

    public void printTypeOftheObject(){
        System.out.println("Type: " + object.getClass().getName());

    }

}
