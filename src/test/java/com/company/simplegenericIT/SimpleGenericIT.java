package com.company.simplegenericIT;

import com.company.simplegeneric.SimpleGenericImpl;

/**
 * Created by anjalhussan on 10/17/16.
 */
public class SimpleGenericIT {

    public static void main(String [] args){

        //Create Generic Object with String as type
        SimpleGenericImpl<String> genericwithString = new SimpleGenericImpl<String>("Sample String");
        genericwithString.printTypeOftheObject();
        System.out.println(genericwithString.getObject());

        //Create Generic Object with Int as type
        SimpleGenericImpl<Integer> genericwithInt = new SimpleGenericImpl<Integer>(129);
        genericwithInt.printTypeOftheObject();
        System.out.println(genericwithInt.getObject());


        //Create Generic Object with Boolean as type
        SimpleGenericImpl<Boolean> genericwithBoolean = new SimpleGenericImpl<Boolean>(false);
        genericwithBoolean.printTypeOftheObject();
        System.out.println(genericwithBoolean.getObject());

    }

}
