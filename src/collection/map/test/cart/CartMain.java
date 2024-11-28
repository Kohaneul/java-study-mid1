package collection.map.test.cart;

public class CartMain {
    public static void main(String[] args) {
        Product product1 = new Product("사과",1000);
        Product product2 = new Product("바나나",500);


        Cart cart = new Cart();
        cart.add(product1,1);
        cart.add(product2,1);
        cart.printAll();

        cart.add(product1,2);
        cart.printAll();


        cart.minus(product1,3);
        cart.printAll();




    }
}
