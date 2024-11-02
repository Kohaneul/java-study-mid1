package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2<>();


        Animal dog = new Dog("멍멍이1",100);
        Animal cat = new Cat("야옹이1",300);
        //개 병원
//        dogHospital.set(dog);
//        dogHospital.checkUp();
//        System.out.println();

        //고양이 병원
//        catHospital.set(cat);
//        catHospital.checkUp();
//        System.out.println();

        //문제1 : 개 병원에 고양이 전달
//        dogHospital.set(cat); // 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음

        //문제2 : 개 타입 반환
//        dogHospital.set(dog);
//        Animal animal = dogHospital.bigger(new Dog("멍멍이2",200));
//        System.out.println("animal = " + animal);


    }
}
