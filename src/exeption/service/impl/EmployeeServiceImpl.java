package exeption.service.impl;

import exeption.dao.EmployeeDao;
import exeption.exeptions.ForAge;
import exeption.exeptions.ForName;
import exeption.models.Employee;
import exeption.service.EmployeeService;

import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void addPerson() {

        System.out.print("Name: ");
        String name = new Scanner(System.in).nextLine();
        if (name.isEmpty()) {
            throw new ForName();
        }
        int age =0;
        try {
            System.out.print("Age: ");
             age = new Scanner(System.in).nextInt();
            if (age < 0 || age > 100) {
                throw new ForAge();
            }
        }catch (RuntimeException e){
            System.out.println("invalid format!");
        }finally {
            System.out.println("buttu");
        }

        System.out.print("Group: ");
        String group = new Scanner(System.in).nextLine();
        if (group.isEmpty()){
            group=null;
        }

        employeeDao.addPerson(new Employee(name,age, group));
    }

    @Override
    public void getAll() {
        employeeDao.getAll();
    }

    @Override
    public void getPersonById() {
        System.out.print("index: ");
        int index = new Scanner(System.in).nextInt();

        employeeDao.getPersonByIndex(index);
    }
}
