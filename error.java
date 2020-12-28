// 자주 발생하는 에러와 해결법

/*
자바로 프로그래밍을 하면서 크고 작은 에러들을 보게 될 것입니다.
대부분의 에러는 실수에서 비롯된 것인데, 이것들을 알아보겠습니다. 이 에러들로 시간을 끄는 일은 없도록 하십시요.

1. cannot find symbol 또는 cannot resolve symbol
  지정된 변수나 메서드를 찾을 수 없다는 뜻으로 선언되지 않은 변수나 메서드를 사용하거나, 변수 또는 메서드의 이름을 잘못 사용한 경우에 발생한다.
  자바에서는 대소문자 구분을 하기 때문에 철자 뿐만아니라 대소문자의 일치여부도 꼼꼼하게 확인해야한다.

2. ';' expected
  세미콜론(semicolon) 이 필요한 곳에 없다는 뜻이다. 자바의 모든 문장의 끝에는 ';'을 붙야줘야 한다.

3. Exception in thread "main" java.lang.NoSuchMethodError: main
  'main' 메서드를 찾을 수 없다는 뜻이다. 자바에서 main 메서드 필수적인 요소이다.
  public static void main(String[] args) {} 에 오류가 있는지 확인하라.

4. Exception in thread "main" java.lang.NoClassDefFoundError: ClassName
  'ClassName' 클래스를 찾을 수 없는 내용이다. 철자를 확인하고 .class 파일이 생성되었는지 확인하라.

5. illegal start of expression
  문장에 문법적 오류가 있다는 뜻이다. 괄호같은걸 열고서 닫지 않았다거나 public 같은 키워드를 잘못 사용하였거나 등등

6. class, interface, or enum expected
  괄호의 개수가 일치 않는 경우에 발생한다.

에러 처리 방법

--
1. 에러 메세지를 잘 읽고 해당 부분의 코드를 살펴본다.
    이상이 없으면 해당 코드의 주위(윗줄과 아래 줄) 도 함께 살펴본다.

2. 그래도 이상이 없으면 에러 메시지는 잊어버리고 기본적인 부분을 재확인한다.
    대부분의 에러는 사소한 것인 경우가 많다.

3. 의심이 가는 부분을 주석처리하거나 따로 떼어내서 테스트 한다.

--

에러 메시지가 실제 에러와는 관계없는 내용일 때도 있지만, 대부분의 경우 에러 메시지만 잘 이해해도 문제가 해결되는 경우가 많으므로 에러 해결을 위해서 제일 먼저 해야 할 일은 에러 메시지를 잘 읽는 것임을 명심합시다.
 */