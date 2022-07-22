package Ex_11_pack;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 6) + 1;
            set.add(new Integer(num));
        }
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
