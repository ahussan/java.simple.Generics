package com.company.simplegenericIT;

import com.company.simplegeneric.SimpleGenericTwoParImpl;

/**
 * Created by anjalhussan on 10/17/16.
 */
public class SimpleGenericTwoParIT {

    public static void main(String[]args){

        SimpleGenericTwoParImpl<String, Integer> stringIntegr
                =new SimpleGenericTwoParImpl<String, Integer>("Start Up Company", 100);
        stringIntegr.printtypes();
    }

}
