package com.company.simplegeneric.boundedtypeswithInterface;

/**
 * Created by anjalhussan on 10/21/16.
 */
public class BoundedExtendedToInterface<T extends IBoundedTOInterface> {

    private T object;

    public BoundedExtendedToInterface(T object) {
        this.object = object;
    }
    public void runTest(){
        object.printclass();
    }
}
