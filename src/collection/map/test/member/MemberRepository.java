package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    public static Map<String, Member> memberMap;
    public MemberRepository() {
        memberMap = new HashMap<>();
    }

    public void save(Member member){
        memberMap.put(member.getId(),member);
    }

    public Member findById(String id){
        return memberMap.getOrDefault(id, null);
    }

    public Member findByName(String name){
        for (Member value : memberMap.values()) {
            if(value.getName().equals(name)){
                return value;
            }
        }
        return null;
    }

    public void remove(String id){
        memberMap.remove(id);
    }


}
