public class StudentPassOrFail {

    
    public static void main(String[] args) { 
        int sub1Score = 25;
        int sub2Score = 30;
        int sub3Score = 20;
        int count = 0;
        if (sub1Score < 40) { 
            count++;
            
        }

         if (sub2Score < 40) { 
            count++;
            
        }  
         if (sub3Score < 40) { 
            count++;
            
        }
        if (count==0) {
            System.out.println("studnt pass in all subject");
            
        }
        else {
            System.out.println( "student fail in "+count+" subject");
        }

    }
}