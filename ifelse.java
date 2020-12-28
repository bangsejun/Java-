// 오늘은 드디어! 제어문을 배울겁니다.

/*
제어문이란? 제어문은 코드를 조종 하는 구문입니다.
우리는 이것을 반복문과 조건문으로 나눕니다.

이번에는 제어문 - 조건문 - ifelse 문 을 배우겠습니다.
*/

public class Code {
	public static void main(String[] args) {
        int date = 27; // 오늘 날짜

        if(date == 24) { /* if 문은 () 안의 조건을 충족 할 시 블럭 안의 코드를 실행합니다.
            즉, date 가 24 일때 블럭 안의 코드를 실행하는 것이죠. */
            System.out.printf("date 는 %d 입니다 \n", date);
        } else { // else 문은 if 문에서 조건을 충족하지 않았을 때 블럭 안의 코드를 실행합니다.
            System.out.printf("땡 \n");
        }
  }
}