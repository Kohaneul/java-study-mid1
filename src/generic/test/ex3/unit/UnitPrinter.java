package generic.test.ex3.unit;

public class UnitPrinter {


    public static <T extends BioUnit> void printV1(Shuttle<T> t){
        BioUnit bioUnit = t.out();
        System.out.println("이름 : "+bioUnit.getName() +" ,HP : "+bioUnit.getHp());
    }
    public static void printV2(Shuttle<? extends BioUnit> t){
        BioUnit bioUnit = t.out();
        System.out.println("이름 : "+bioUnit.getName() +" ,HP : "+bioUnit.getHp());
    }
}
