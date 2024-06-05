package lang.test;

import java.util.Arrays;

public class TestString9 {
    public static void main(String[] args) {
    String email = "Hello@example.com";
        String[] split = email.split("@");
        String id = split[0];
        String domain = split[1];
        System.out.println("id = " + id);
        System.out.println("domain = " +domain);

    }
}
