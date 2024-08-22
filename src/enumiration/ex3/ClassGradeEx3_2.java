package enumiration.ex3;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        System.out.println("basic = " + basic);
        int gold = discountService.discount(Grade.GOLD, price);
        System.out.println("gold = " + gold);
        int diamond = discountService.discount(Grade.DIAMOND, price);
        System.out.println("diamond = " + diamond);
    }
}
