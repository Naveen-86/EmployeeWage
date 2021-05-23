package com.wagecomputation;
import java.util.*;

public class EmployeeWage {
        public static final int FULL_DAY_HOUR = 8;
        public static final int HALF_DAY_HOUR = 4;

        public static int calculateWage(String name,double wage,int workingDays,int workingHours)
        {

            //variables
            int empWorkingDays = 0;
            int empWorkingHrs = 0;
            while( empWorkingDays < workingDays && empWorkingHrs < workingHours ) {

                double check = (Math.floor(Math.random() * 10) % 3);
                switch ((int) check) {

                    case 1:
                        empWorkingHrs += FULL_DAY_HOUR ;
                        System.out.println("Full Time");
                        break;
                    case 2:
                        empWorkingHrs += HALF_DAY_HOUR ;
                        System.out.println("Part Time");
                        break;
                    case 0:
                        empWorkingHrs = 0;
                        System.out.println("absent");
                        break;
                }
                empWorkingDays++;
            }

            int totalEmpWage = empWorkingHrs * workingHours;
            System.out.println(" Total Wage for Company : " + name + " : " + totalEmpWage);
            return totalEmpWage;
        }

        public static void main(String[] args) {

            calculateWage("Dell",36000,22,176);
            calculateWage("Lenovo",40000,23,184);
            calculateWage("Infosys",42000,24,192);
            calculateWage("Amazon",44000,25,200);
            calculateWage("Wipro",46000,26,208);
        }
    }


