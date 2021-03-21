package de.dz2.service.impl;

import de.dz2.model.Company;
import de.dz2.model.Employee;
import de.dz2.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    @Transactional(readOnly = true)
    public Employee findById(int id) {
        return Employee.builder()
                .id(id)
                .build();
    }

    @Override
    public Employee create(Employee employee) {
        return employee;
    }

    @Override
    public Employee updateByPut(Employee employee, int id) {
        return employee;
    }

    @Override
    public Employee updateByPatch(Employee employee, int id) {
        return employee;
    }

    @Override
    public void delete(int id) {

    }
}
