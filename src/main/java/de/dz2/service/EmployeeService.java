package de.dz2.service;

import de.dz2.model.Employee;

public interface EmployeeService {
    Employee findById(int id);
    Employee create(Employee employee);
    Employee updateByPut(Employee employee, int id);
    Employee updateByPatch(Employee employee, int id);
    void delete(int id);
}
