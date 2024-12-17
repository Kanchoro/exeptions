package exeption;

import exeption.dao.EmployeeDao;
import exeption.dao.Impl.EmployeeDaoImpl;
import exeption.exeptions.ForName;
import exeption.service.EmployeeService;
import exeption.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);

        while (true) {
            System.out.print("""
                    1.add
                    2.get all
                    3.get by index
                    """);
            try {
                System.out.print(": ");
                int number = new Scanner(System.in).nextInt();
                switch (number) {
                    case 1 -> employeeService.addPerson();
                    case 2 -> employeeService.getAll();
                    case 3 -> employeeService.getPersonById();
                }
            } catch (ForName f) {
                System.out.println("Invalid number!");
            } finally {
                System.out.println("buttu!");
            }
        }
    }
}