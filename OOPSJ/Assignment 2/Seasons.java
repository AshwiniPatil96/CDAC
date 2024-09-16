package assignment2;

import java.util.Scanner;

public class Seasons {
public static void main(String[] args) {
	System.out.println("Enter the month");
	Scanner s = new Scanner(System.in);
	int month = s .nextInt();
	switch (month) {
	case 12:
	case 1:
	case 2:
		System.out.println("winter");
		
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("summer");
		
		break;
	case 6:
	case 7:
	case 8:
	case 9:
		System.out.println("Spring");
		
		break;
	case 10:
	case 11:
		System.out.println("Autumn");
		break;

	default:
		System.out.println("invalid input");
		break;
	}
	
}
}
