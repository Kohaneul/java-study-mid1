package nested.anonymous.ex;

import nested.local.Printer;

public class Ex0Main {
    public static void helloJava(){
        printer.print();

    }
    public static void helloSpring(){
        printer.print();
    }

    static Printer printer = new Printer() {
        @Override
        public void print() {
            System.out.println(" 프로그램 시작 ");
            System.out.println(" Hello Java ");
            System.out.println(" 프로그램 종료 ");
        }
    };

    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }

}
