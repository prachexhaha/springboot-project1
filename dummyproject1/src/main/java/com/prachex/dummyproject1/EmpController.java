package com.prachex.dummyproject1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController 
{
    // we need 4 different mappings 
    // so for that we need to make 4 different methods

    //class level list
    List<Employee> employees = new ArrayList<>();

    //end point - employees
    @GetMapping("employees")
    public List<Employee> getAllEmployees(@RequestParam(required = false) String param)
    {
        return employees;
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) 
    {
        employees.add(employee);
        return "Saved successfully";
    }
    


    
}
