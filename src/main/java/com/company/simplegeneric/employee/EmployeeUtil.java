package com.company.simplegeneric.employee;

/**
 * Created by anjalhussan on 10/21/16.
 */
public class EmployeeUtil<T extends Employee> {

    private T emp;

    public EmployeeUtil(T employee) {
        this.emp = employee;
    }

    public int getSalary(){
        return emp.getSalary();
    }

    // here if we had passed T as type parameter, It would not have worked
    public boolean salaryIsEqual(EmployeeUtil<?> EmployeetoCompare){
        if (emp.getSalary()==EmployeetoCompare.getSalary()){
            return true;
        }
        return false;
    }

}
