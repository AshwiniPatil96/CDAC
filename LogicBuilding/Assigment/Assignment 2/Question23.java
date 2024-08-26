public class Question23 { 
    public static void main(String[] args) { 
    int value = 2; 
    switch(value) { 
    case 1: 
    System.out.println("Value is 1"); 
    case 2: 
    System.out.println("Value is 2"); 
    case 3: 
    System.out.println("Value is 3"); 
    default: 
    System.out.println("Default case"); 
    } 
    } 
   } 
   //default case is print after "Value is 2" because there is no break after case 2.
   //we can prevent the program from executing the default case by inserting break statement after case 2
