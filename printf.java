// print, println 이랑 비슷한 Terminal 출력 메서드입니다.
// 다른 점이 있다면 %d 을 활용할 수 있다는 점이죠.

// 예제

public class printf { // class 생성
    public static void main(String[] args) { // main 메서드
        int b = 100; // b 변수 생성
        String a = "BBang"; // a 변수 생성

        System.out.printf("Age : %d \n", b); // %d 로 문자열 안에 값을 삽입 하였음(int)
        System.out.printf("Name : %s \n", a); // %s 로 문자열 안에 값을 삽입 하였음(String)

        // %d, %s 등을 지시자라 합니다.

        /*
        자주 사용되는 지시자의 종류 :
        %d : int, long(정수형 타입)의 지시자
        %s : char, short, String(문자열 타입) 의 지시자
        %x : 16진수 정수의 형식으로 출력되는 지시자
        %n : 줄바꿈 == \n
        %f : float, double(부동 소수점 타입 / 실수형)의 지시자.
         */
    }
}