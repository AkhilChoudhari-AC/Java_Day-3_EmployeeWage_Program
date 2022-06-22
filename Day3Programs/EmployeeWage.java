package Day3Programs;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int present = 1;
        int WagePerHr = 20;
        int FullDayHr = 8;
        Random rand = new Random();
        int empCheck = rand.nextInt(2);
        if (empCheck == present) {
            System.out.println("Employee is present");
            System.out.println("Employee Daily Wages for full Day is :" +(WagePerHr * FullDayHr));
        }
    else {
            System.out.println("Employee is Absent");
            System.out.println("Employee Daily Wages is : 0");
        }
    }
}
