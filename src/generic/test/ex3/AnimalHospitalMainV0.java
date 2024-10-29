package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("야옹이1",300);
        //개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();
        System.out.println();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();


        //문제1 : 개 병원에 고양이 전달
        //dogHospital.set(cat); //다른 타입 입력 : 컴파일 오류

        //문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog dog2 = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("dog2 = " + dog2);


    }
}
