import java.util.Scanner;

public class qna {
    public static void main(String[] args) {
        System.out.println("비밀번호를 찾아보세요!");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

            if (num == 123) {
                System.out.printf("비밀번호는 %d 였습니다! \n", num);
            } else {
                System.out.printf("비밀번호는 %d 가 아니였습니다! 다시 시도 하십시요 \n", num);
            }
    }
}