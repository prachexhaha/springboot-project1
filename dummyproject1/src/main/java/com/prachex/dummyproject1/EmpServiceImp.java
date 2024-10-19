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
        //copying all the info to the entity
        //BeanUtils.copyProperties(object source, object target);
        //entity mein sab aa gaya
        //now entity is directly mapped to the repo
        //basically now all the employees that you create, get added to the database.
        employeeRepository.save(employeeEntity);
        //employees.add(employee);
        //employees.add(employee) is locally saving it
        return "Saved successfully";
    }

    //READ OPERATION
    @Override
    public List<Employee> readEmployees() 
    {
        List<EmpEntity> employeesList = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();

        for(EmpEntity employeeEntity : employeesList)
        {
            Employee emp = new Employee(); 
            BeanUtils.copyProperties(employeeEntity, emp);  // copy properties
            employees.add(emp);
        }
        return employees;
    }


    @Override
    public boolean deleteEmployee(Long id) 
    {
        if(employeeRepository.existsById(id)) 
        {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public String updateEmployee(Long id, Employee employee)
    {
        //save hoti hai ek entity
        EmpEntity existingEmployee = employeeRepository.findById(id).get();
        //updating the existing employee
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());

        employeeRepository.save(existingEmployee);
        return "Update Succesfully";
    }

    @Override
    public Employee readEmployee(Long id)
    {
        EmpEntity employeeEntity = employeeRepository.findById(id).get();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }

    //class will implement EmpService interface
    // memory allocation for the object will happen using the constructor of the class that implements the interface.

    //all the methods of interface are abstract
    
}
