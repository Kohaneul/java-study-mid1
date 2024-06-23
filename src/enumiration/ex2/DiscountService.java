package enumiration.ex2;

public class DiscountService {
    public int discount(ClassGrade grade, int price){
        int discountPercent=0;
      if(grade==ClassGrade.BASIC){
          discountPercent = 10;
      }
      else  if(grade==ClassGrade.GOLD){
            discountPercent = 10;
        }
      else  if(grade==ClassGrade.DIAMOND){
            discountPercent = 10;
        }

      else{
          System.out.println("할인 X : grade"+grade);
      }
        //10000 * (20/100) = 2000
        return price * discountPercent/100;
    }
}
