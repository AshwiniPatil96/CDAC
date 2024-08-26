public class Question25 { 
    public static void main(String[] args) { 
    double score = 85.0; 
    switch(score) { 
    case 100: 
    System.out.println("Perfect score!"); 
    break; 
    case 85: 
    System.out.println("Great job!"); 
    break; 
    default: 
    System.out.println("Keep trying!"); 
    } 
    } 
   } 
   // Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
  //code will  work by replacing double by int