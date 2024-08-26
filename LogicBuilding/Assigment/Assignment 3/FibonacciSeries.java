public class FibonacciSeries {

    public static void main(String[] args) {
        int number = 21; // The upper limit for the Fibonacci sequence
        int num1 = 0, num2 = 1;

        
        while (num1 <= number) {
            System.out.print(num1 + " ");
            int nextNumber = num1 + num2;
            num1 = num2;
            num2 = nextNumber;

        }
    }
}