public class Question10 { 
 public  void display() { 
 System.out.println("No parameters"); 
 } 
 public  void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
}
// non-static method display() cannot be referenced from a static context
 display();