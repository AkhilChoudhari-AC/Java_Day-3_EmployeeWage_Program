package Day3Programs;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

       // int FullPresent = 1;
      //  int PartTime = 2;
        int WagePerHr = 20;
        int FullDayHr = 8;
        int PartTimeHr = 4;
        Random rand = new Random();
        int empCheck = rand.nextInt(3);
     //   if (empCheck == FullPresent) {
        switch (empCheck) {
            case 1:
                System.out.println("Employee is full time present");
                System.out.println("Employee Daily Wages for full Day is :" + (WagePerHr * FullDayHr));
                break;

            //   } else if (empCheck == PartTime) {
            case 2:
                System.out.println("Employee is part time present");
                System.out.println("Employee Daily wages for part time is :" + (WagePerHr * PartTimeHr));
                break;
            //   } else {
            default: {
                System.out.println("Employee is Absent");
                System.out.println("Employee Daily Wages is : 0");
            }
        }
    }
}
