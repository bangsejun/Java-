// 저번에는 if else 문을 배웠었죠. 이번에도 if else 입니다. 다만, 중첩 if else 문을 배울겁니다.

public class ifelse_two { // 언제나 말했듯이 public class 의 이름은 파일 이름과 같아야 합니다.
    public static void main(String[] args) { // main 메서드는 필수고요
        final int b;
        b = 133;
        final float floatb = (float) b + 1;
        if(b > floatb) {
            System.out.println("b 는 floatb 보다 크다");
            return; /* return 문으로 처음으로 돌아가게 함.
            return 문을 적지 않으면 다음 조건이 맞을때도 코드 블럭이 실행됨 */
        } else if(b < floatb) { // else if 로 중첩 if 문 생성
            System.out.println("b 는 floatb 보다 작다");
        } else {
            System.out.println("b 는 floatb 와 같다.");
        }
    }
}