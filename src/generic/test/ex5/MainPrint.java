package generic.test.ex5;

public class MainPrint {
    public static void main(String[] args) {
        Family<Parent> parentFamily = new Family<>();
        parentFamily.set(new Daughter("daughter1",11));

        parentFamily.printInfo();

        Family<Parent> parentFamily2 = new Family<>();
        parentFamily2.set(new Son("son",22));

        parentFamily2.printInfo();


        Parent parent = FamilyUtil.returnParent(parentFamily);
        FamilyUtil.voidParent(parentFamily2);

    }
}
