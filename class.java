public class edu { // 파일 이름인 edu 로 class 생성
    public static void main(String[] args) { // 메인 메서드
        // 우리는 이제 다른 클래스를 생성해볼겁니다.

        minecraft mc = new minecraft(); /*
         클래스를 사용하는 방법은 이겁니다. 사실 이걸 객체생성이라 하는데 어려운 말이니 이렇게만 하죠.
         */
        mc.a = 123; // mc 에 있는 a 에 액세스, 123 이라는 값을 잡어넣음
        /*
        minecraft(클래스의 이름) mc(쓸 이름) = new(뉴 키워드(새로운)) className();
         */
        System.out.println(mc.a); // mc(minecraft Class) 에 있는 a 의 값을 가져옴
    }
}
class minecraft { // class 키워드로 minecraft 라는 class 를 생성했습니다.
    int a; // 변수 생성
    // 이렇게 한개의 값만 저장하고 넘어가겠습니다.
}