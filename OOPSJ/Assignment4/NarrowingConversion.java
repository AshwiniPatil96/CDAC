package assignment4;

public class NarrowingConversion {

    public static void main(String[] args) {
      
        double doubleValue = 120.345;
        
        
        int intValue = (int) doubleValue;
        
       
        System.out.println("The double value: " + doubleValue);
        System.out.println("The converted int value: " + intValue);
    }
}