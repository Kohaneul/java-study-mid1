package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate myDate1  = new MyDate(2022,11,2);
        MyDate myDate2  = myDate1;
        System.out.println("myDate1 = " + myDate1);
        System.out.println("myDate2 = " + myDate2);
        System.out.println("2022 -> 2025");

        myDate2.setYear(2025);
        System.out.println("myDate1 = " + myDate1);
        System.out.println("myDate2 = " + myDate2);
    }
}
