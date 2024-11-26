package WiseSaying;

import java.util.Scanner;

public class Run{
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("명령 ) ");
            String inputCommand = scanner.nextLine();
            if (inputCommand.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        scanner.close(); // 스캐너 닫기
    }
}
