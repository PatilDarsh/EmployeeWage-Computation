package com.infogalaxy.employeewagecomp;
import java.util.Random ;

public class EmployeeWageComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int attendance = 0;
		int dailyWage = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random random = new Random() ;
		attendance = random.nextInt(9)%2 ;
		
		if (attendance == 0)
		{
			System.out.println("Employee Is Absent");
		}
		else
		{
			System.out.println("Employee Is Present");
			dailyWage = WAGE_PER_HR * FULL_DAY_HR ;
			System.out.println("EMPLOYEE WAGE :"+dailyWage);
			
		}

	}

}
