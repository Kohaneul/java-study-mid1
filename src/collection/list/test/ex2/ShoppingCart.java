package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (Item item : itemList) {
            System.out.println("상품명 : "+item.getName()+", 합계 : "+item.getTotalPrice());
        }
        int sum = itemList.stream().mapToInt(Item::getTotalPrice).sum();
        System.out.println("전체 가격 합 : "+sum);
    }

}
