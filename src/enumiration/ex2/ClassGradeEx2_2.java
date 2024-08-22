package enumiration.ex2;


import static enumiration.ex2.ClassGrade.*;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int diamond = discountService.discount(DIAMOND, price);
        System.out.println("diamond = " + diamond);
        int gold = discountService.discount(GOLD, price);
        System.out.println("gold = " + gold);
        int basic = discountService.discount(BASIC, price);
        System.out.println("basic = " + basic);

    }
}
