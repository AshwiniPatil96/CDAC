public class UninitializedWhileLoop {
    public static void main(String[] args) {
    int count = 0;
    while (count < 10) {
        System.out.println(count);
        count++;
        }
        }
        }
        //this code produce a compilation error because count variable is not initilize.