package com.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args)
    {
        int PRESENT = 1;
        int PART_TIME = 2;
        int wage_per_hour = 20;
        int part_day_hour = 4;
        int full_day_hour = 8;
        int wage = 0;

        double check = (Math.floor(Math.random() * 10) % 3);
        if ((int) check == PRESENT) {
            System.out.println("Employee is present");
            double wage = wage_per_hour * full_day_hour;
            System.out.println("Daily Wage : " + wage);
        } else if((int) check == PART_TIME) {
            System.out.println("Employee is half day present");
            double wage = wage_per_hour * part_day_hour;
            System.out.println("Daily Wage : " + wage);
        } else {
            System.out.println("Employee is absent.so no wage");
        }
    }
}
