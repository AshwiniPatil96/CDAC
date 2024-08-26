import java.util.Scanner;

public class DiscountCalculation{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Please Enter purchase value");




      int purchasePrice = sc.nextInt();
      System.out.println( " Do you have membership card. Please enter true if you are having membership card or enter false");
      boolean isHavingMembershipCard = sc.nextBoolean();
        int totalDiscount = 0,finalPrice;
         if(purchasePrice>=1000){
            int discountPercentage = 20;
             if(isHavingMembershipCard){
                discountPercentage = discountPercentage + 5;
                totalDiscount = purchasePrice*discountPercentage/100;
             }else{
                totalDiscount = purchasePrice*discountPercentage/100;
             }
             finalPrice = purchasePrice - totalDiscount;
              
             System.out.println("Final Price is = "+finalPrice);
         }
         if( purchasePrice >= 500 && purchasePrice <=999){
            int discountPercentage =10;
            if(isHavingMembershipCard){
                discountPercentage = discountPercentage + 5;
                totalDiscount = purchasePrice*discountPercentage/100;
            }else{ 
                totalDiscount = purchasePrice*discountPercentage/100;
            }
            finalPrice = purchasePrice - totalDiscount;
            System.out.println("Final Price is = "+finalPrice);

    }
    if( purchasePrice < 500 ){
        int discountPercentage =5;
        if(isHavingMembershipCard){
            discountPercentage = discountPercentage + 5;
            totalDiscount = purchasePrice*discountPercentage/100;
        }else{ 
            totalDiscount = purchasePrice*discountPercentage/100;
        }
        finalPrice = purchasePrice - totalDiscount;
        System.out.println("Final Price is = "+finalPrice);
    }
    
}

}