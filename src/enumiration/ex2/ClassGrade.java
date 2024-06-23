package enumiration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();//x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade();  //x003


    //private 생성자 추가 > 다른 클래스에서는 객체 생성 불가
    private ClassGrade(){

    }

}
