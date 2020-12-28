// 변수란 수학에서는 '변하는 수' 이지만 프로그래밍 세계에선 '값을 저장할 공간' 이다.
// 자바에서는 변수에 꼭 타입을 지정해줘야 한다.
// 변수 생성 키워드는 따로 없고, 타입을 적어주면 된다.

public class variable {
    public static void main(String[] args) {
        /* 잘 쓰이는 변수의 타입으로는
        int(정수 4bytes, 정수를 표현 할 때),
        long(정수 8bytes, int 로 표현 할 수 없는 수(-21 억에서 +21 억까지)를 표현할때 사용한다),
        float(실수 4bytes, 실수를 표현 할 때, 실수를 쓴 다음 F or f 를 붙여야한다.),
        double(실수 8bytes, float으로 표현할 수 없는 수(1.4E-45 ~ 3.4E38)를 표현할 때 사용된다, 실수를 쓴 다음 D or d 를 붙여야한다. ),
        char(문자열 2bytes, 간단한 하나짜리 문자열을 표현할 때 쓴다.),
        String(문자열 12bytes, 긴 문자열을 표현할 때 쓴다.),
        boolean(true, false 1bytes, true 혹은 false 만 반환할 때 쓴다.)

        등이 있다. 사실은 더 많다.
         */
        int a = 123;
        long b = 12345678;
        float c = 2134.2134F;
        double d = 12341.12354D;
        char e = "E";
        String f = "I'm BBANG";
        boolean g = true; // 여기서 true는 무슨 값이 있으나 다 true 이고, false 는 빈 문자열이나 0, false 등이다.

        // 우리는 보안을 더 강화하기 위해 상수(변하지 않는 수) 를 써야한다.
        // 상수를 사용하는 방법은 간단하다. 변수 앞에 final 키워드만 붙여주면 된다.

        final int H = 123;
        final float K = 1234.214356356534213F;


    }
}