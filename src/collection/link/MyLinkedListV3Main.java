package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        //마지막에 추가 O(n)
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);

        String s = stringList.get(0);
        System.out.println("s = " + s);
        System.out.println();

        MyLinkedListV3<Integer> intList = new MyLinkedListV3<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);


    }
}
