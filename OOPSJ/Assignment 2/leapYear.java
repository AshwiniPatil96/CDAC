package assignment2;

import java.util.Scanner;

public class leapYear {
	public static void main(String [] args )
	{
		Scanner a = new Scanner(System.in);
		System.out.println("please enter the  year");
		int year = a.nextInt();
			
		if(year % 400 == 0 || year % 100 == 0 || year % 4 == 0  )
		{
			System.out.println(year+"is leap year");
			
		}
		else {
			System.out.println(year+"is not leap year");
			
		}
		
		
		
	}}
