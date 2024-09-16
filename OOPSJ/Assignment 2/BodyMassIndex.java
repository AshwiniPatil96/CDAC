package assignment2;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String [] args) {
		System .out.println("please enter the value of weight");
		Scanner scanner = new Scanner(System.in);
		double weight = scanner .nextDouble();
		System .out.println("please enter the value of Height in meter");
		double height = scanner.nextDouble();
		double bmi = weight/(height * height);
		System.out.println("bmi is : "+bmi);
		if(bmi <= 18.5)
		{
			System.out.print("underweight");
		}
		else if(bmi > 18.5 && bmi <= 25 ) {
			System.out.println("Normal weight");
		}
		else if (bmi > 25 && bmi <= 30 )
		{
		System.out.println("over weight");
		
		}
		
		
		
		
		
	}

}
