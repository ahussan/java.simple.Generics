package com.company.simplegeneric;

/**
 * Created by anjalhussan on 10/17/16.
 */
public class SimpleGenericTwoParImpl<U, V> {
    private U objectU;
    private V objectV;

    public SimpleGenericTwoParImpl(U objectU, V objectV) {
        this.objectU = objectU;
        this.objectV = objectV;
    }

    public void printtypes(){
        System.out.println("U Type "+this.objectU.getClass().getName());
        System.out.println("V Type "+this.objectV.getClass().getName());

    }


}
