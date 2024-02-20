package com.infogalaxy.employeewagecomp;

import java.util.Random;

class EmployeeWageComp
{
    public static void main(String[] args) {
        
        int attendance;
        int employee_type;
        int dailyWage = 0;
        int total_wage =0;
        final int FULL_TIME_HR = 8;
        final int PART_TIME_HR = 4;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20 ;
        
        System.out.println(" Welcome to Employee Wage Computation Program ");
        System.out.println("_________________________________________________");
        
        for(int i = 1 ; i <= WORKING_DAYS ; i++ )
        {
        	System.out.println("Day:"+i);
        	Random random = new Random();
        	attendance = random.nextInt(9) % 2;

        switch (attendance)
        {
            case 0:
                System.out.println("Absent");
                break;
            
            case 1:
                System.out.println(" Employee Is Present");
                employee_type = random.nextInt(9) % 2;
                switch(employee_type)
                {
                case 0:
                	System.out.println("Employee is Part Time");
                	dailyWage = WAGE_PER_HR * PART_TIME_HR ;
                	break;
                case 1:
                	System.out.println("Employee is Full Time");
                	dailyWage = WAGE_PER_HR * FULL_TIME_HR ;
                	break;
                }
               System.out.println("	Employee Wage : "+dailyWage);
               break;
        }
        total_wage += dailyWage ;
        System.out.println("------------------------------");
        }
        System.out.println("Total Monthly Wage :"+total_wage);
    }
}