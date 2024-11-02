package generic.test.ex3.unit;

public class UnitUtil{


    public static <T extends BioUnit> T maxHp(T target1, T target2){
        return target1.getHp() > target2.getHp() ? target1 : target2;
    }


}
