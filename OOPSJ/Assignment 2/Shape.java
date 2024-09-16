package assignment2;


		import java.util.Scanner;

		public class Shape {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter shape to calculate the area:");
		        System.out.println("1. Circle");
		        System.out.println("2. Square");
		        System.out.println("3. Rectangle");
		        System.out.println("4. Triangle");
		        
		        int choice = scanner.nextInt();
		        double area = 0;
		        
		        switch (choice) {
		            case 1: 
		                System.out.println("Enter the radius of the circle:");
		                double radius = scanner.nextDouble();
		                area = Math.PI * radius * radius;
		                break;
		                
		            case 2: 
		                System.out.println("Enter the side length of the square:");
		                double side = scanner.nextDouble();
		                area = side * side;
		                break;
		                
		            case 3: 
		                System.out.println("Enter the length of the rectangle:");
		                double length = scanner.nextDouble();
		                System.out.println("Enter the width of the rectangle:");
		                double width = scanner.nextDouble();
		                area = length * width;
		                break;
		                
		            case 4: 
		                System.out.println("Enter the base of the triangle:");
		                double base = scanner.nextDouble();
		                System.out.println("Enter the height of the triangle:");
		                double height = scanner.nextDouble();
		                area = 0.5 * base * height;
		                break;
		                
		            default:
		                System.out.println("Invalid choice! Please select a valid shape.");
		                System.exit(0);
		        }
		        
		        System.out.println("The area of the selected shape is: " + area);
		    }
		
	}


