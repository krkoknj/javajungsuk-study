import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class UserTestTwo {
    String id;
    String pwd;
    String name;

    @Override
    public String toString() {
        return "UserTestTwo{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public UserTestTwo(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestListTwo {
    public static void main(String[] args) {
        List<UserTestTwo> list = new ArrayList<>();
        Map<String, UserTestTwo> map = new HashMap();
        for (int i = 1; i <= 10; i++) {
            list.add(new UserTestTwo(i + "", "123" + i, "kim" + i));
            map.put(i + "", new UserTestTwo(i + "", "123" + i, "kim" + i));
        }

        UserTestTwo user = findUser(list);
        String userMap = String.valueOf(findUserMap(map));
        System.out.println("user = " + user);
        System.out.println("userMap = " + userMap);
    }

    private static UserTestTwo findUserMap(Map<String, UserTestTwo> map) {
        for (Map.Entry<String, UserTestTwo> entry : map.entrySet()){
            if (entry.getKey().equals("1")){
                return entry.getValue();
            }
        }
        return null;
    }


    private static UserTestTwo findUser(List<UserTestTwo> list) {
        for (UserTestTwo utt : list) {
            if (utt.getId().equals("5")){
                return utt;
            }
        }
        return null;
    }
}
