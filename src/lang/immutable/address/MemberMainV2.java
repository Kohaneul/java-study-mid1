package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberA = new MemberV1("회원A",address);
        MemberV1 memberB = new MemberV1("회원B",address);

        //회원 A, 회원 B
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        change(memberB, memberA);

    }

    private static void change(MemberV1 memberB, MemberV1 memberA) {
        memberB.setAddress(new Address("부산"));
        System.out.println("부산 -> memberB");
        //회원 A, 회원 B
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
