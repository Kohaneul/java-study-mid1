package enumiration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(ClassGrade.BASIC, price);
        System.out.println("basic = " + basic);
        int gold = discountService.discount(ClassGrade.GOLD, price);
        System.out.println("gold = " + gold);
        int diamond = discountService.discount(ClassGrade.DIAMOND, price);
        System.out.println("diamond = " + diamond);


    }
}
