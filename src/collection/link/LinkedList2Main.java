package collection.link;

public class LinkedList2Main {
    public static void main(String[] args) {
        LinkedList2<String> linkedList2 = new LinkedList2<>();
        linkedList2.add("a");
        linkedList2.add("b");
        linkedList2.add("c");
        linkedList2.add("d");
        System.out.println("linkedList2 = " + linkedList2);

        linkedList2.add(2,"test11");

        System.out.println("linkedList2 = " + linkedList2);

        linkedList2.removeNode(1);

        System.out.println("linkedList2 = " + linkedList2);



    }
}
