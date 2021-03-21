package de.dz2.controller;

import de.dz2.model.Employee;
import de.dz2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") int id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PutMapping("/{id}")
    public Employee updateByPut(
            @RequestBody Employee employee,
            @PathVariable("id") int id,
            @RequestParam("id") int paramID,
            @RequestHeader Map<String, String> headers,
            @RequestHeader(value = "Content-Type") String contentType,
            HttpServletRequest request,
            HttpServletResponse response) {
        return employeeService.updateByPut(employee, id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus
    public Employee updateByPatch(@RequestBody Employee employee, @PathVariable("id") int id) {
        return employeeService.updateByPatch(employee, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        employeeService.delete(id);
    }
}
