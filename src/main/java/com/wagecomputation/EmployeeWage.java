package com.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args)
    {
        int PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        double check = (Math.floor(Math.random() * 10) % 2);
        if ((int) check == PRESENT) {
            System.out.println("Employee is present");
            double wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Wage : " + wage);
        } else {
            System.out.println("Employee is absent.so no wage");
        }
    }
}
