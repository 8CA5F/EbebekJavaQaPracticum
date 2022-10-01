package business.abstracts;

import java.time.LocalDate;

public interface EmployeeService {
    double tax(double salary);
    double bonus(int workHours);
    double raiseSalary(double salary, LocalDate hireYear);
}
