package generic.ex3;

public class AnimalHospitalV2<T> {
  private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        // T의 타입은 메서드를 정의한는 시점에서 알 수 없다. Object의 기능만 사용
//        System.out.println("동물 이름 : " +  animal.getName());
//        System.out.println("동물 크기 : " + animal.getSize());
//        animal.sound();
        animal.toString();
        animal.equals(null);

    }
    public T bigger(T target){
//        return animal.getSize()>target.getSize() ? animal : target;
        return null;
    }

}
