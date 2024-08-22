package enumiration.ex2;

public class DiscountService {
    public int discount(ClassGrade grade, int price){
        int discountPrice = 0;
        if(grade==ClassGrade.BASIC){
            discountPrice = 10;
        }
        else if(grade==ClassGrade.GOLD){
            discountPrice = 20;
        }
        else if(grade==ClassGrade.DIAMOND){
            discountPrice = 30;
        }
        else{
            System.out.println(grade+" : 할인 X");
        }
        //10000*(20/100)
        return price * discountPrice/100;
    }
}
