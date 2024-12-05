package collection.compare;

import collection.iterable.MyArrayIterator;
import com.sun.source.util.Trees;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a",30);
        MyUser myUser2 = new MyUser("b",20);
        MyUser myUser3 = new MyUser("c",10);

        Set<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        Set<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 기본 정렬");
        System.out.println(treeSet2);

    }
}
