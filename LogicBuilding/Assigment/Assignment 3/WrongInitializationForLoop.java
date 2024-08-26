public class WrongInitializationForLoop {
    public static void main(String[] args) {
    for (int i = 10; i >= 0; i--) {
    System.out.println(i);
    }
    }
    }
    //this loop not print numbers in the expected order due to increment operator present in for loop.
    //loop was starting from the 10 and because of increment oprator it goes to infinite loop