package collection.set;

import java.util.stream.Stream;

public class StringHashMain {
    static final int CAPACITY=10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);
        System.out.println();
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        //hashIndex
        int hashCodeA = hashCode("A");
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " +  hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " +  hashIndex(hashCode("AB")));


    }
    static int hashIndex(int value){
        return value%10;
    }
    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int no = 0;
        for (char c : charArray) {
            no += (int) c;
        }
        return no;
    }
}
