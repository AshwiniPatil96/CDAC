public class IncorrectWhileCondition {
    public static void main(String[] args) {
    int count = 5;
    while (count >= 0) {
    System.out.println(count);
    count--;
    }
    }
    }
    // Type mismatch: cannot convert from int to boolean
    //because in the while loop condition was count = 0 insted of that count >= 0