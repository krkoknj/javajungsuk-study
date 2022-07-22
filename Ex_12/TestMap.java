import java.util.HashMap;
import java.util.Map;

class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

public class TestMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("date", new MyDate(2020,1,1));
        map.put("date1", new MyDate(2021, 2,2));
        map.put("date2", new MyDate(2022, 3,3));

        MyDate myDate = (MyDate) map.get("date");
        MyDate myDate1 = (MyDate) map.get("date1");
        MyDate myDate2 = (MyDate) map.get("date2");

        System.out.println(myDate.getYear() + " 년 " + myDate.getMonth() + " 월 " + myDate.getDay() + " 일 ");
        System.out.println(myDate1.getYear() + " 년 " + myDate1.getMonth() + " 월 " + myDate1.getDay() + " 일 ");
        System.out.println(myDate2.getYear() + " 년 " + myDate2.getMonth() + " 월 " + myDate2.getDay() + " 일 ");

    }
}
