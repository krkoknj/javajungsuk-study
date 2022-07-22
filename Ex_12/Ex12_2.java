import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String,Student1> map = new HashMap<>();
        map.put("김", new Student1("김", 1, 1, 100, 100, 100));

        Student1 s = map.get("김");

        System.out.println(map.get("김").ban);
    }
}

class Student1 {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


}
