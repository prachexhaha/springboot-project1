package com.prachex.dummyproject1;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceImp implements EmpService
{
    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) 
    {
        employees.add(employee);
        return "Saved successfully";
    }

    @Override
    public List<Employee> readEmployees() 
    {
        return employees;
    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }
    //class will implement EmpService interface
    // memory allocation for the object will happen using the constructor of the class that implements the interface.

    //all the methods of interface are abstract
    

}
