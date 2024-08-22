package enumiration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String str = sc.next();
        System.out.println("["+getDesc(str.toUpperCase())+"] 입니다");
        printMenus(str);


    }

    private static void printMenus(String str) {

        for (String menu : AuthGrade.valueOf(str).getMenus(str)) {
            System.out.println("menu = " + menu);
        }
    }

    private static String getDesc(String str){
        try{
            return AuthGrade.valueOf(str).getDescription() ;
        }
        catch(IllegalArgumentException e){
            return "입력 오류";
        }
    }

}
