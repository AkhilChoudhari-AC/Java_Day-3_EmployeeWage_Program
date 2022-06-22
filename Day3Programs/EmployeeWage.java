package Day3Programs;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

       // int FullPresent = 1;
      //  int PartTime = 2;
        int WorkDayPerMonth = 20;
        int WagePerHr = 20;
        int MaxWorkHr = 100;
         //     int FullDayHr = 0;
          //  int PartTimeHr = 0;
       int EmpHr = 0;
       for (int day = 0; day < WorkDayPerMonth; day++){

        Random rand = new Random();
        int empCheck = rand.nextInt(3);
     //   if (empCheck == FullPresent) {

        switch (empCheck) {
            case 1:
                EmpHr = 8;
                System.out.println("Employee is full time present");
                System.out.println("Employee Daily Wages for full Day is :" + (WagePerHr * EmpHr));
                break;

            //   } else if (empCheck == PartTime) {
            case 2:
                EmpHr = 4;
                System.out.println("Employee is part time present");
                System.out.println("Employee Daily wages for part time is :" + (WagePerHr * EmpHr));
                break;
            //   } else {
            default: {
                System.out.println("Employee is Absent");
                System.out.println("Employee Daily Wages is : 0");
            }
        }
        }
        int TotalWageOfMonth = (WagePerHr * EmpHr * WorkDayPerMonth);
        System.out.println("Total wages of a Employee for a Month IS :" +TotalWageOfMonth);
    }
}
