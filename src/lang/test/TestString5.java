package lang.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "user.exe";
        String ext = ".exe";
        int idx = str.indexOf(ext);
        String fileName = str.substring(0, idx);
        System.out.println("substring1 = " + fileName);
        String extName = str.substring(idx);
        System.out.println("substring2 = " + extName);

    }
}
