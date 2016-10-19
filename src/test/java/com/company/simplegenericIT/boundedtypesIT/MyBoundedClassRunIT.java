package com.company.simplegenericIT.boundedtypesIT;

import com.company.simplegeneric.boundedtypes.FirstSubClass;
import com.company.simplegeneric.boundedtypes.GenericWithBoundedTypes;
import com.company.simplegeneric.boundedtypes.SecondSubClass;
import com.company.simplegeneric.boundedtypes.TestSuperclass;

/**
 * Created by anjalhussan on 10/18/16.
 */
public class MyBoundedClassRunIT {

    public static void main(String[]a){
        //creating object of second subclass
        //and passing as parameter
        GenericWithBoundedTypes<SecondSubClass> second =
                new GenericWithBoundedTypes<SecondSubClass>(new SecondSubClass());
        second.doRunTest();

        //creating object of first subclass
        //and passing as parameter
        GenericWithBoundedTypes<FirstSubClass> first =
                new GenericWithBoundedTypes<FirstSubClass>(new FirstSubClass());
        first.doRunTest();
        first.printHelloTest();

        // pasing supre class
        GenericWithBoundedTypes<TestSuperclass> superclass =
                new GenericWithBoundedTypes<TestSuperclass>(new TestSuperclass());
        superclass.doRunTest();
        superclass.printHelloTest();

        //This will give compile time error
        //Because Java.lang.String is not within it's bound;
        //should extend to TestSuperclass
        //GenericWithBoundedTypes<String> genericwithString =
          //      new GenericWithBoundedTypes<String>(new String());
        //genericwithString.doRunTest();

    }
}
