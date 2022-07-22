package Ex_11_pack;

import day0621_movie.User;

import java.util.ArrayList;
import java.util.List;

class UserTest {
    String username;
    String password;

    UserTest() {
    }

    UserTest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class TestList {
    public static void main(String[] args) {
        UserTest userTest = null;
        ArrayList<UserTest> list = new ArrayList<UserTest>();
        list.add(new UserTest("kim", "123"));
        list.add(new UserTest("Lee", "234"));

        System.out.println("list.get(0) = " + list.get(0).username);
        System.out.println("list.get(1) = " + list.get(1));
    }
}
