package sit.int204.classicmodelsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelsservice.dtos.EmployeeDTO;
import sit.int204.classicmodelsservice.entities.Employee;
import sit.int204.classicmodelsservice.services.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("")
    public Employee create(@RequestBody EmployeeDTO newEmployee) {
        return employeeService.save(newEmployee);
    }
}
