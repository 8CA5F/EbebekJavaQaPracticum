import business.concretes.EmployeeManager;
import entities.concretes.Employee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();

        // 5 methods in case
        Employee employee = new Employee("Owen Willis", 2500, 45, LocalDate.of(2019,9,11));
        System.out.println(employee);
        System.out.println("Employee's tax amount: " + employeeManager.tax(employee.getSalary()));
        System.out.println("Employee's bonus payout: " + employeeManager.bonus(employee.getWorkHours()));
        System.out.println("Employee's new salary must be: " + (employee.getSalary() + employeeManager.raiseSalary(employee.getSalary(), employee.getHireYear())));
    }
}