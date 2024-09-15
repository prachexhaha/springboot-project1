package com.prachex.dummyproject1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImp implements EmpService
{
    @Autowired
    private EmpRepository employeeRepository;

    //List<Employee> employees = new ArrayList<>();


    //CREATE OPERATION
    @Override
    public String createEmployee(Employee employee) 
    {
        EmpEntity employeeEntity = new EmpEntity(); //object
        BeanUtils.copyProperties(employee, employeeEntity);
        //entity mein sab aa gaya
        //now entity is directly mapped to the repo
        //basically now all the employees that you create, get added to the database.
        employeeRepository.save(employeeEntity);
        //employees.add(employee);
        return "Saved successfully";
    }

    //READ OPERATION
    @Override
    public List<Employee> readEmployees() 
    {
        List<EmpEntity> employeesList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();

        //for each loop
        for(EmpEntity employeeEntity : employeesList)
        {
            Employee emp = new Employee(); //model object
            // say you only want the name and phone number
            // so from the entity you will get it and set it into the employee object
            emp.setName(employeeEntity.getName());
            emp.setEmail(employeeEntity.getEmail());
            employees.add(emp);
        }
        return employees;
    }

    //@SuppressWarnings("unlikely-arg-type")
    @Override
    public boolean deleteEmployee(Long id) {
        //employees.remove(id);
        return true;
    }
    //class will implement EmpService interface
    // memory allocation for the object will happen using the constructor of the class that implements the interface.

    //all the methods of interface are abstract
    
}
