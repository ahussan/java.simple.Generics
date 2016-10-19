package com.company.simplegeneric.boundedtypes;

import com.company.simplegeneric.boundedtypes.TestSuperclass;

/**
 * Created by anjalhussan on 10/17/16.
 */
public class GenericWithBoundedTypes <T extends TestSuperclass> {

    private T objRef;

    public GenericWithBoundedTypes(T objRef) {
        this.objRef = objRef;
    }

    public void doRunTest(){
        this.objRef.printclass();
    }

    public void printHelloTest(){
        this.objRef.printHello();
    }

}
