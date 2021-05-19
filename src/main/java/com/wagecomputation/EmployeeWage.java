package com.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args)
    {
        int wage_per_hour = 20;
        int part_day_hour = 3;
        int full_day_hour = 5;
        int total_working_days = 20;
        while( total_working_days <= 20 ) {

            double check = (Math.floor(Math.random() * 10) % 3);
            switch ((int) check) {

                case 1:
                    System.out.println("Employee is present");
                    double wage = wage_per_hour * full_day_hour;
                    System.out.println("Daily Wage : " + wage);
                    double salary = wage * total_working_days;
                    total_working_days++;
                    System.out.println("Monthly Wage : " + salary);
                    break;
                case 2:
                    System.out.println("Employee is half day present");
                    double wages = wage_per_hour * part_day_hour;
                    System.out.println("Daily Wage : " + wages);
                    double salaries = wages * total_working_days;
                    total_working_days++;
                    System.out.println("Monthly Wage : " + salaries);
                    break;
                case 0:
                    System.out.println("Employee is absent.so no wage");
                    total_working_days++;
                    break;
            }
        }
    }
}
