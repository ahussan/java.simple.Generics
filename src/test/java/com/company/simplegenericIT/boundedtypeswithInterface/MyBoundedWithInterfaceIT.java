package com.company.simplegenericIT.boundedtypeswithInterface;

import com.company.simplegeneric.boundedtypeswithInterface.AImplementation;
import com.company.simplegeneric.boundedtypeswithInterface.BImplementation;
import com.company.simplegeneric.boundedtypeswithInterface.BoundedExtendedToInterface;

/**
 * Created by anjalhussan on 10/21/16.
 */
public class MyBoundedWithInterfaceIT {
    public static void main(String[]args){

        //creating object of AImplementation which implemented IBoundedTOInterface
        //and passing it to BoundedExtendedToInterface as a parameter
        BoundedExtendedToInterface<AImplementation> firstObject
                = new BoundedExtendedToInterface<AImplementation>(new AImplementation());
        firstObject.runTest();

        //creating object of BImplementation which implemented IBoundedTOInterface
        //and passing it to BoundedExtendedToInterface as a parameter
        BoundedExtendedToInterface<BImplementation> secondObject
                = new BoundedExtendedToInterface<BImplementation>(new BImplementation());
        secondObject.runTest();

        // This object creation will throw error
        //BoundedExtendedToInterface<String> objectwithError
        //        =new BoundedExtendedToInterface<String>(new String());
        //Error: java: type argument java.lang.String is not within bounds of type-variable T
        //objectwithError.runTest(); // this will not run



    }
}
