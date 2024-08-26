public class Question26{ 
    public static void main(String[] args) { 
    int number = 5; 
    switch(number) { 
    case 5: 
    System.out.println("Number is 5"); 
    break; 
    case 5: 
    System.out.println("This is another case 5"); 
    break; 
    default: 
    System.out.println("This is the default case"); 
    } 
    } 
   } 
   //Unresolved compilation problems:Duplicate case
   /*In this code, having two case 5 labels is invalid because the compiler cannot 
   determine which block of code should be executed when value is 5*/
   