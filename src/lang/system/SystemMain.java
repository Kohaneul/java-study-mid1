package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
    public static void main(String[] args) {
        //현재시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //(운영체제)환경변수를 가져온다.
        System.out.println("getenv = "+System.getenv());

        //java가 사용하는 시스템 속성을 읽는다.
        System.out.println("properties="+System.getProperties());
        //자바 버전 가져오기
        System.out.println("Java version: "+System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originArray = {'h','e','l','l','o'};
        char[] copiedArray = new char[5];

        //운영체제에서 배열 통으로 복사 -> loop로 돌려서 하는 것보다 속도 빠름
        System.arraycopy(originArray,0,copiedArray,0,originArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray="+ Arrays.toString(copiedArray));
        //프로그램 종료
        System.exit(0); //여기서 끝 > 가급적이면 사용 X
        System.out.println("hello" );//출력 되지 않음

    }
}
