package com.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args)
    {
        int wage_per_hour = 20;
        int part_day_hour = 4;
        int full_day_hour = 8;
        int total_working_days = 20;
        int wage = 0;

        for(x = 1; x <= total_working_days; x++) {
        double check = (Math.floor(Math.random() * 10) % 3);
        switch ((int) check) {

            case 1:
                       System.out.println("Employee is present");
                       double wage = wage_per_hour * full_day_hour;
                       System.out.println("Wage : " + wage);
                       break;
            case 2:
                       System.out.println("Employee is half day present");
                       double wage = wage_per_hour * part_day_hour;
                       System.out.println("Wage : " + wage);
                       break;
            case 0:
                       System.out.println("Employee is absent.so no wage");
                       break;
          }
        }
    }
}
