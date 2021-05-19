package com.wagecomputation;

public class EmployeeWage {
    public static void main(String[] args)
    {
        int PRESENT = 1;
        double check = (Math.floor(Math.random() * 10) % 2);
        if ((int) check == PRESENT) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
