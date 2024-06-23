package enumiration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("당신의 등급을 입력하세요 "+ Arrays.toString(AuthGrade.values())+" : ");
     String grade = sc.nextLine();
     System.out.println("===== 메뉴 목록 =====");
     printAuthGrade(grade);


    }

    private static void printAuthGrade(String grade){
        AuthGrade authGrade = null;
        try{
            grade = grade.toUpperCase();
            authGrade = AuthGrade.valueOf(grade);
            System.out.println("당신의 등급은 ["+authGrade.getDescription()+"] 입니다.");
            authGrade.getAccessMenu(authGrade).forEach(System.out::println);
        }
        catch(RuntimeException e){
            System.out.println(" 잘못 입력되었습니다. " );

        }
    }


}
