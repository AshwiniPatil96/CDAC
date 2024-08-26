public class MisplacedForLoopBody {
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++){
    System.out.println(i);
    System.out.println("Done");
    }
    }
    }

    //Because the loop body was not mentioned there. Thats why done print only once.
    
    