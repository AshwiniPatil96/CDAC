public class Calculator {

    public static void main(String [] args){
  
         int num1 = 4;
         int num2 = 2;
         char oprator = '-';
         int result;

         switch (oprator) {
            case '/':
                if(num2!=0){
                    result = num1/num2;
                    System.out.println( result);
                    
                }else{
                    System.out.println(" in division zero is not allowed as denomineter");
                }
                break;
                case '+':
             
                result = num1+num2;
                System.out.println(result);
                break;
                case '-':
             
                result = num1-num2;
                System.out.println(result);
                break;
                case '*':
             
                result = num1*num2;
                System.out.println(result);
                break;
          default:
          System.out.println("Invalide input");
                break;
         }



    }
}