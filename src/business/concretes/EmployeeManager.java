package business.concretes;

import business.abstracts.EmployeeService;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeManager implements EmployeeService {

    final int MAX_STANDART_WORKING_HOURS = 40;
    final LocalDate CURRENT_DATE = LocalDate.of(2021, 01, 01);

    @Override
    public double tax(double salary) {
        double taxFee = salary >= 1000 ? salary * 0.03 : 0.0;
        return taxFee;
    }

    @Override
    public double bonus(int workHours) {
        double bonusPayout = workHours > MAX_STANDART_WORKING_HOURS
                ? (30 * (workHours - MAX_STANDART_WORKING_HOURS))
                : 0.0;
        return bonusPayout;
    }

    @Override
    public double raiseSalary(double salary, LocalDate hireYear) {
        double raiseAmount = 0.0;
        Period difference = Period.between(hireYear, CURRENT_DATE);
        if (difference.getYears() > 19) raiseAmount = salary * 0.15;
        else if (difference.getYears() > 9 && difference.getYears() < 20) raiseAmount = salary * 0.10;
        else raiseAmount = salary * 0.05;
        return raiseAmount;
    }
}
