package com.prachex.dummyproject1;

//import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    //List<Employee> employees = new ArrayList<>();

    //@Autowired
    //EmpService employeeService = new EmpServiceImp();

    // if we do not to use the new keyword
    // then simply a dependency injection can be down 
    //@Autowired
    EmpService employeeService;


    //end point - employees
    @GetMapping("employees")
    public List<Employee> getAllEmployees(@RequestParam(required = false) String param)
    {
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) 
    {   
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id)
    {
        if(employeeService.deleteEmployee(id))
        {
            return "Delete Successfully";
        }
        return "Not found";
    }
    


    
}
