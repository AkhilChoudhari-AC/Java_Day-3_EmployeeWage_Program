package Day3Programs;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int present = 1;
        Random rand = new Random();
        int empCheck = rand.nextInt(2);
        if (empCheck == present) {
            System.out.println("Employee is present");
        }
    else
            System.out.println("Employee is Absent");


    }
}
