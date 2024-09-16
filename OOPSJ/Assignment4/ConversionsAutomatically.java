package assignment4;

public class ConversionsAutomatically {

    public static void main(String[] args) {
       
        int intValue = 10;
        float floatValue = 20.5f;
        double doubleValue = 30.75;

        
        double result1 = intValue + floatValue;  
        double result2 = floatValue + doubleValue; 
        int result3 = (int) (intValue + doubleValue); 
        float result4 = intValue * floatValue; 
        
       
        System.out.println("Result of int + float: " + result1);
        System.out.println("Result of float + double: " + result2);
        System.out.println("Result of int + double (cast to int): " + result3);
        System.out.println("Result of int * float: " + result4);
    }
}