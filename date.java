import java.util.Calendar;

public class date {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        int b = ca.get(ca.YEAR);
        int a = ca.get(ca.MONTH);
        int c = ca.get(ca.DATE);

        System.out.printf("%d년 %d월 %d일", b, a + 1, c);
        System.out.printf("\n이렇게 저거 하나로 시간 끄는 일 없도록 합시다. \n");
    }
} 