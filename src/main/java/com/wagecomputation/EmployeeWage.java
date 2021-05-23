package com.wagecomputation;
import java.util.*;

public class EmployeeWage {

	       public static final int WAGE_PER_HOUR = 20;
           public static final int PART_DAY_HOUR = 4;
           public static final int FULL_DAY_HOUR = 8;
           public static final int TOTAL_WORKING_DAYS = 20;
           public static final int TOTAL_WORKING_HOURS = 100;
           static int totalDays = 0;
           static int workHours = 0;

	    static void calculateWage()
	    {
	        while( totalDays < TOTAL_WORKING_DAYS) {

	            double check = (Math.floor(Math.random() * 10) % 3);
	            switch ((int) check) {

	                case 1:
	                          workHours += FULL_DAY_HOUR ;
	                          System.out.println("Full Time");
	                          break;
	                case 2:
	                	      workHours += PART_DAY_HOUR ;
	                	      System.out.println("Part Time");
	                          break;
	                case 0:
	                	      workHours = 0;
	                	      System.out.println("absent");
	                          break;
	            }
	            totalDays++;
	        }
	        
	         int totalEmpWage = workHours * WAGE_PER_HOUR;
	         System.out.println(" Total Wage Of Employee : " + totalEmpWage);
	    }
	    
	    public static void main(String[] args) {
			calculateWage();
		}
}
