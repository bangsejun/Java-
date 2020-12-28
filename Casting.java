// 형변환

/*
형변환 은 변수 등의 타입을 다른 타입으로 바꾸는 것을 말합니다.
boolean 타입을 제외한 7개의 기본형(char, int, long, float, short, double, byte)은 서로 형변환이 가능합니다.
 */
public class Casting {
    public static void main(String[] args) { // 중괄호에 마우스를 클릭하면 연결 되어 있는 중괄호가 하얘집니다.
        int a = 1234; // a 변수 선언
        float b = (float)a; // 형변환은 (<타입>)바꾸려는것 으로 합니다.
        // int 타입의 a 를 float 타입의 b 로 바꾼 것

        System.out.println(a); // a 를 선언
        System.out.println(b); // b 를 선언
    }
}