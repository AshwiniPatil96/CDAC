package assignment2;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		System.out.println("Enter the age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("you are eligible for vote ");
		}
		else {
			System.out.println("you are not eligible for vote ");
		}
		
	}

}
