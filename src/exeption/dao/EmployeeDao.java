package exeption.dao;

import exeption.models.Employee;

public interface EmployeeDao {
    void addPerson(Employee employee);
    void getAll();
    void getPersonByIndex(int index);
}
