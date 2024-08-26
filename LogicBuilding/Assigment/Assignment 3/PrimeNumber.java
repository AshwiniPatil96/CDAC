public class PrimeNumber {

    public static void main(String[] args) {
        int count = 0; 
        int number = 2; 

        

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

   
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
}
}

// first 5 prime number are 2,3,5,7,11