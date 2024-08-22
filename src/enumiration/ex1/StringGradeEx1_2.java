package enumiration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //존재하지 않는 등급 입력
        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);
        int diamonddd = discountService.discount("DIAMONDDD", price);
        System.out.println("diamonddd = " + diamonddd);
        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);

    }
}
