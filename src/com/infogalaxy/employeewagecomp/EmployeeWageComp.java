package com.infogalaxy.employeewagecomp;
import java.util.Random ;

public class EmployeeWageComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int attendance = 0;
		
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
		}

	}

}
