package com.infogalaxy.employeewagecomp;

import java.util.Random;

class EmployeeWageComp
{
    public static void main(String[] args) {
        Random random = new Random();

        int attendance;
        int dailyWage;
        final int FULL_TIME_HR = 8;
        final int PART_TIME_HR = 4;
        final int WAGE_PER_HR = 20;
        int employee_type;
        
        attendance = random.nextInt(9) % 2;

        switch (attendance) {
            case 0:
                System.out.println("Absent");
                break;
            
            case 1:
                System.out.println("Present");
                employee_type = random.nextInt(9) % 2;
                if (employee_type == 0)
                {
                	System.out.println("Employee is Part Time");
                    dailyWage = WAGE_PER_HR * PART_TIME_HR;
                } else 
                {
                	System.out.println("Employee is Full Time");
                    dailyWage = WAGE_PER_HR * FULL_TIME_HR;
                }
                System.out.println("The wage of Employee is: " +dailyWage);
                break;

            default:
                System.out.println("Enter correct data!");
                break;
        }
    }
}