package com.bridgelabz;
//interface
interface EmployeeWages
{
    public void company(int wage_per_hr, int working_days_per_month, int max_working_hrs);
    public int wageCalculator(CompanyInfo1 cI);
}

class CompanyInfo1
{
    // VARIABLES
    public final int wage_per_hr;
    public final int working_days_per_month;
    public final int max_working_hrs;
    public int totalWage = 0;

    public CompanyInfo1(int wage_per_hr, int working_days_per_month, int max_working_hrs)
    {
        this.wage_per_hr = wage_per_hr;
        this.working_days_per_month = working_days_per_month;
        this.max_working_hrs = max_working_hrs;
    }

    public void setTotalWage(int totalWage)
    {
        this.totalWage = totalWage;
    }

    public String toString()
    {
        return "total wage is: "+totalWage;
    }
}

//MAIN CLASS
public class EmployeeWage implements EmployeeWages
{
    // CONSTANTS
    public final int IS_PRESENT = 1;
    public final int IS_FULL_TIME = 1;

    //array diclaration
    CompanyInfo1[] totalWageofDiffEmp = new CompanyInfo1[1];

    //Object for Company Info method
    CompanyInfo1 wcc;
    public void company(int wage_per_hr, int working_days_per_month, int max_working_hrs)
    {
        //Adding details to the array list (array of type 'CompanyInfo1')
        wcc = new CompanyInfo1(wage_per_hr,working_days_per_month,max_working_hrs);

        totalWageofDiffEmp[0] = wcc;

        CompanyInfo1 cI;

        //calling calculator method for every company
        for(int i=0;i<totalWageofDiffEmp.length;i++)
        {
            cI = totalWageofDiffEmp[0];

            int totalWage = wageCalculator(cI);
            wcc.setTotalWage(totalWage);

            System.out.println("total wage: "+cI);
        }
    }

    // WAGE CALCULATOR
    public int wageCalculator(CompanyInfo1 cI)
    {
        // VARIABLES
        int checkPresence;
        int checkEmpType;
        int dayOfMonth = 0;
        int totalWage = 0;
        int workingHrs = 0;
        int totalWorkedHrs = 0;

        // Wage calculation
        while (dayOfMonth <= cI.working_days_per_month && totalWorkedHrs <= cI.max_working_hrs)
        {
            checkPresence = (int) (Math.random() * 10) % 2; // Presence check
            checkEmpType = (int) (Math.random() * 10) % 2; // Work Type check
            dayOfMonth++;
            switch (checkPresence)
            {
                case IS_PRESENT:
                    switch (checkEmpType)
                    {
                        case IS_FULL_TIME:
                            workingHrs = 8;
                            totalWorkedHrs += workingHrs;
                            break;
                        default:
                            workingHrs = 4;
                            totalWorkedHrs += workingHrs;
                    }
                    break;
                default:
                    totalWorkedHrs += 0;
            }
            totalWage = (cI.wage_per_hr * totalWorkedHrs);
        }
        return totalWage;
    }

    public static void main(String[] args)
    {
        EmployeeWages company1 = new EmployeeWage();
        EmployeeWages company2 = new EmployeeWage();

        company1.company(20, 20, 100);
        company2.company(25, 15, 150);
    }
}