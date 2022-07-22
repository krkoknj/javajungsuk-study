import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : "  +  today.get(Calendar.YEAR));
        System.out.println("월 : " + today.get(Calendar.MONTH));
        System.out.println("이 달의 마지막 날 " + today.getActualMaximum(Calendar.DATE));
    }
}
