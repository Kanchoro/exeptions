package exeption.dao.Impl;

import exeption.dao.EmployeeDao;
import exeption.db.DataBase;
import exeption.exeptions.ForName;
import exeption.models.Employee;
import exeption.service.EmployeeService;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void addPerson(Employee employee) {
        DataBase.employees.add(employee);
    }

    @Override
    public void getAll() {
        System.out.println(DataBase.employees);
    }

    @Override
    public void getPersonByIndex(int index) {
        try {
            System.out.println(DataBase.employees.get(index-1));
        }catch (ForName f){
            System.out.println("Invalid index!");
        }finally {
            System.out.println("Buttu!");
        }
    }
}
