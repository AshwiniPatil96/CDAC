public class LoopVariableScope {
    public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    int x = i * 2;
    
    System.out.println(x);
    }// Error: 'x' is not accessible here
    }
    }
    //Unresolved compilation problem: x cannot be resolved to a variable
    //X was declared inside the loop thats why it not accessible out side the loop.
