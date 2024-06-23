package enumiration.test;

import java.util.ArrayList;
import java.util.List;

public enum AuthGrade {

    GUEST(1,"손님"), LOGIN(2,"로그인 회원"), ADMIN(3,"관리자");
    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }


    public List<String> getAccessMenu(AuthGrade grade){
        List<String> accessMenuList = new ArrayList<>();
        if(grade.level>0){
            accessMenuList.add("- 메인 화면");
        }
        if(grade.level>1){
                accessMenuList.add("- 이메일 관리 화면");
            }
        if(grade.level>2) {
            accessMenuList.add("- 관리자 화면");
        }
        return accessMenuList;
    }




}
