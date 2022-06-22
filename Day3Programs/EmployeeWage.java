package Day3Programs;

import java.sql.SQLOutput;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int FullPresent = 1;
        int PartTime = 2;
        int WagePerHr = 20;
        int FullDayHr = 8;
        int PartTimeHr = 4;
        Random rand = new Random();
        int empCheck = rand.nextInt(3);
        if (empCheck == FullPresent) {
            System.out.println("Employee is full time present");
            System.out.println("Employee Daily Wages for full Day is :" +(WagePerHr * FullDayHr));
        } else if (empCheck == PartTime) {
            System.out.println("Employee is part time present");
            System.out.println("Employee Daily wages for part time is :" +(WagePerHr * PartTimeHr));

        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee Daily Wages is : 0");
        }
    }
}
