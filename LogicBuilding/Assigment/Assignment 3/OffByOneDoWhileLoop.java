
public class OffByOneDoWhileLoop {
    public static void main(String[] args) {
    int num = 5;
    do {
    System.out.println(num);
    num--;
    } while (num > 0);
    }
    }
    //this loop print unexpected numbers because variable initilization was started from 1 insted of 5
    
