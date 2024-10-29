package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();


        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("야옹이1",300);
        //개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();
        System.out.println();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();
        System.out.println();

        //문제1 : 개 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        //문제2 : 개 타입 반환
        dogHospital.set(dog);
        Animal animal = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("animal = " + animal);


    }
}
