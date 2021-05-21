package com.wagecomputation;
import java.util.*;

public class EmployeeWage {

    public static final int wagePerHour = 20;
    public static final int partTimeHour = 4;
    public static final int fullDayHour = 8;
    public static final int totalWorkingDays = 20;

    public static int computeWage() {

        int workingHours = 0;
        int workingDays = 0;

        while ((workingDays < 20) && (workingHours < 100)){
            Random n = new Random();
            int ran = n.nextInt(3);
            workingDays++;

            switch(ran){
                case 2:
                    workingHours += fullDayHour;
                    break;
                case 1:
                    workingHours += partTimeHour;
                    break;
                case 0:
                    break;
                default:
            }
        }
        int totalEmpWage = workingHours * wagePerHour;
        System.out.println("Total employee wage: " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        System.out.println("This is employee wage computation");
        computeWage();
    }
}