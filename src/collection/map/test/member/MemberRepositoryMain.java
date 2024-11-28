package collection.map.test.member;

public class MemberRepositoryMain {

    public static void main(String[] args) {
       Member member1 = new Member("id1","회원1");
       Member member2 = new Member("id2","회원2");
       Member member3 = new Member("id3","회원3");

       MemberRepository memberRepository = new MemberRepository();
       memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);

        Member findMember1 = memberRepository.findById(member1.getId());
        System.out.println("findMember1 = " + findMember1);

        Member findMember3 = memberRepository.findByName("회원3");
        System.out.println("findMember3 = " + findMember3);

        memberRepository.remove("id1");
        Member removedMember1 = memberRepository.findById("id1");
        System.out.println("id1 = " + removedMember1);
    }

}
