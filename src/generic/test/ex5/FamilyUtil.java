package generic.test.ex5;

public class FamilyUtil {

    static <T extends Parent> T returnParent(Family<T> t){
        T t1 = t.get();
        System.out.println("이름 : "+t1.getName());
        System.out.println("나이 : "+t1.getAge());
        return t1;
    }


    static <T extends Parent> void voidParent(Family<?> t){
        Parent t1 = t.get();
        System.out.println("이름 : "+t1.getName());
        System.out.println("나이 : "+t1.getAge());
    }

}
