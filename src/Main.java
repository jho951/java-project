import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Command cmd = new Command(); // Command 클래스 사용

        String input; // 입력 변수 선언

        do {
            System.out.print("명령 ) ");
            input = scanner.nextLine(); // 사용자 입력 받기
            if (!input.equals("exit")) { // "종료"가 아닌 경우만 명령 실행
                cmd.command(input);     // Command 클래스의 command 메서드 호출
            }
        } while (!input.equals("exit")); // "종료"일 때 루프 종료

        System.out.println("종료"); // 종료 메시지 출력
        scanner.close();
    }
}
