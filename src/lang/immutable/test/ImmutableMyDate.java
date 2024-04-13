package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year +
                "-" + month +
                "-" + day;
    }
    //with : 원본 객체의 상태를 유지하되 새로운 내용을 추가해서 새로운 객체 생성
    public ImmutableMyDate withYear(int changeYear){
      return new ImmutableMyDate(changeYear, month,day);
    }

    public ImmutableMyDate withMonth(int changeMonth){
        return new ImmutableMyDate(year, changeMonth,day);
    }

    public ImmutableMyDate withDay(int changeDay){
        return new ImmutableMyDate(year, month,changeDay);
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
