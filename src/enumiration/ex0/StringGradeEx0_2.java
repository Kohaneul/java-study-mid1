package enumiration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC", price);
        System.out.println("basic = " + basic);
        int gold = discountService.discount("GOLD", price);
        System.out.println("gold = " + gold);
        int diamond = discountService.discount("DIAMOND", price);
        System.out.println("diamond = " + diamond);


    }
}
