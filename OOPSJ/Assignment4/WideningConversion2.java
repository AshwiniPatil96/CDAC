package assignment4;

public class WideningConversion2 {
	 public static void main(String[] args) {
	        // Declare an integer variable
	        int intValue = 42;
	        
	        // Widening conversion to double
	        double doubleValue = intValue;
	        
	        // Widening conversion to float
	        float floatValue = intValue;
	        
	        // Conversion to String
	        String stringValue = Integer.toString(intValue);
	        
	        // Demonstrate conversion to boolean by interpreting int as boolean string
	        // Note: Java does not support direct conversion from int to boolean.
	        // Here we use a custom method to illustrate the idea.
	        boolean booleanValue = intValue != 0; // Example: Non-zero int value as true
	        
	        // Print the results
	        System.out.println("The integer value: " + intValue);
	        System.out.println("The converted double value: " + doubleValue);
	        System.out.println("The converted float value: " + floatValue);
	        System.out.println("The converted string value: " + stringValue);
	        System.out.println("The converted boolean value (int != 0): " + booleanValue);
	    }

}
