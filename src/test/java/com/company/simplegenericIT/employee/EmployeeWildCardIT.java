package com.company.simplegenericIT.employee;

import com.company.simplegeneric.employee.EmployeeUtil;
import com.company.simplegeneric.employee.FirstTypeEmployee;
import com.company.simplegeneric.employee.SecondTypeEmployee;

/**
 * Created by anjalhussan on 10/21/16.
 */
public class EmployeeWildCardIT {

    public static void main(String a[]){

        EmployeeUtil<FirstTypeEmployee> firstEmployee =
                new EmployeeUtil<FirstTypeEmployee>(new FirstTypeEmployee("John Smith", 60000));
        EmployeeUtil<SecondTypeEmployee> secondEmployee =
                new EmployeeUtil<SecondTypeEmployee>(new SecondTypeEmployee("Isac Agnon", 60000));

        EmployeeUtil<FirstTypeEmployee> thirdEmployee =
                new EmployeeUtil<FirstTypeEmployee>(new FirstTypeEmployee("Alex Agnon", 49000));

        System.out.println("Is salary same? "+thirdEmployee.salaryIsEqual(secondEmployee));
        System.out.println("Is salary same? "+firstEmployee.salaryIsEqual(secondEmployee));
    }
}
