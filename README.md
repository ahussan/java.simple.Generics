# java.simple.Generics

##Simple generics class example with one type parameters

We have created SimpleGeneric class, which accepts single type parameter. The type parameter should be followed by class name and should contain with in <>, here T defines the type parameter. 

##Simple generics class example with two type parameters

In this project, I have also shown how to create a simple generics class with two type parameters. We defined two types of parameters called U & V, seperated by ",". You can define multiple type parameters seperated by ",".

##Implement bounded types (extend superclass) with generics 

What happens in case we want to access group of objects comes from same family, means extending same super class? We can restrict the generics type parameter to a certain group of objects which extends same super class. We can achieve this my specifying extends <super-class> at class definitions. Bounded types with Generics implements excactly the same concept

##Implement bounded types (implements an interface) with generics
  If we want to access group of objects comes from same family, means implementing same interface, we can restrict the generics type parameter to a certain group of objects which implements same interface. We can achieve this my specifying extends <interface-name> at class definitions. We can also specify multiple interfaces at the definision. We can do this by specifying mulitple interfaces seperated by "&". We can also specify class which implements an interface and the interface together.
  
```
class BoundExmp<T extends X>{
     
    private T objRef;
     
    public BoundExmp(T obj){
        this.objRef = obj;
    }
     
    public void doRunTest(){
        this.objRef.printClass();
    }
}
 
interface X{
    public void printClass();
}
 
class Y implements X{
    public void printClass(){
        System.out.println("I am in class Y");
    }
}
 
class Z implements X{
    public void printClass(){
        System.out.println("I am in class Z");
    }
}
```

 
##Generics wildcard arguments

 In **employee** Package, I have an example of how Generics Wildcard arguments works.

 In the example, we have two classes called FirstTypeEmployee and SecondTypeEmployee extending Employee class. We have a generic class called EmployeeUtil, where we have utilities to perform employee functions irrespective of which comapany emp belogns too. This class accepts subclasses of Employee. Incase if we want to compare salaries of two employees, how can we do using MyEmployeeUtil class?
```
//this logic wont work
public boolean salaryIsEqual(MyEmployeeUtil<T> otherEmp){
     
    if(emp.getSalary() == otherEmp.getSalary()){
        return true;
    }
    return false;
}       
```

 Because once we create an object of EmployeeUtil class, the type argument will be specific to an instance type. So we can compare between only same object types, ie, we can comapare either objects of CompAEmp or CompBEmp, but not between CompAEmp and CompBEmp. To solve this problem, wildcard argument will help us. This code can solve our problem.

```
public boolean salaryIsEqual(MyEmployeeUtil<?> otherEmp){
     
    if(emp.getSalary() == otherEmp.getSalary()){
        return true;
    }
    return false;
}       
```


So **"?"** will solve the issue.