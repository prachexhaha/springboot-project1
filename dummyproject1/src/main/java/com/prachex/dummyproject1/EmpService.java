package com.prachex.dummyproject1;

import java.util.List;

public interface EmpService 
{
   String createEmployee(Employee employee);
   List<Employee> readEmployees();
   boolean deleteEmployee(Long id);
} 