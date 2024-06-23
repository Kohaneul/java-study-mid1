package enumiration.ex3;


public class DiscountService {
    public int discount(Grade grade, int price){
        int discountPercent=0;
      if(grade==Grade.BASIC){
          discountPercent = 10;
      }
      else  if(grade==Grade.GOLD){
            discountPercent = 10;
        }
      else  if(grade==Grade.DIAMOND){
            discountPercent = 10;
        }

      else{
          System.out.println("할인 X : grade"+grade);
      }
        //10000 * (20/100) = 2000
        return price * discountPercent/100;
    }
}
