package collection.map.test.cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {

    public static Map<Product, Integer> cartMap;

    public Cart() {
        cartMap = new HashMap<>();
    }

    public void add(Product product,int quantity){
        cartMap.put(product, cartMap.getOrDefault(product,0)+quantity);
    }

    public void minus(Product product,int quantity){
        int qty = cartMap.get(product) - quantity;
        cartMap.put(product,qty);
        if(qty<1){
            cartMap.remove(product);
        }

    }

    public void printAll(){
        System.out.println();
        System.out.println("===모든 상품 출력 ==");

        for (Product product : cartMap.keySet()) {
            System.out.println("상품 : "+product + " , 수량 : "+cartMap.get(product));
        }
    }



}
