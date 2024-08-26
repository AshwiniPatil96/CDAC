public class FactorialOfTen {

    public static void main(String[] args) {
        int number = 10; 
        long factorial = 1; 

        
        for(int i = number; i >=1; i--) {
            factorial = factorial * i;
        }

       
        System.out.println(factorial);
    }
}
// Factorial of 10 is 3628800