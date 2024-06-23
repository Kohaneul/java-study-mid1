package enumiration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

       DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int discount = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 = " + discount);

        //오타
        int discount1 = discountService.discount("DIAMONDDD", price);
        System.out.println("DIAMONDDD 의 할인 금액 = " + discount1);


        //소문자 입력
        int discount2 = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 = " + discount2);
    }
}
