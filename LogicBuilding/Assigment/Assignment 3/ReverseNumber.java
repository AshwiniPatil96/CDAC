public class ReverseNumber {

    public static void main(String[] args) {
        
        int number = 1234; 
        int reversedNumber = 0;

        while(number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number = number/ 10; 
        }
    }
}