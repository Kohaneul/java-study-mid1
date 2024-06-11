package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final static Random ramdom = new Random();

    private int[] lottoArray;
    private int count ;


    public int[] getLottoArray(){
        lottoArray = new int[6];
        count = 0;
        while(count<6){
            int no = ramdom.nextInt(45)+1;
            if(isUnique(no)){
                lottoArray[count] = no;
                count++;
            }
        }


        return lottoArray;
    }

    private boolean isUnique(int number){
        for(int i = 0; i<lottoArray.length;i++){
            if(lottoArray[i]==number){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
    LottoGenerator lottoGenerator   = new LottoGenerator();
        int[] lottoArray1 = lottoGenerator.getLottoArray();
    System.out.println(Arrays.toString(lottoArray1));
    }
}
