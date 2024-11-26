package WiseSaying;

import java.util.Scanner;

public class Run {
    private static final String EXIT_COMMAND = "exit"; // 종료 명령어 정의

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("명령 ) ");
                String inputCommand = scanner.nextLine().trim(); // 경우 수 지우기
                // 공백만 입력한 경우 무시
                if (inputCommand.isEmpty()) {
                    System.out.println("명령을 입력해주세요.");
                    continue;
                }
                // 종료 명령어 확인
                if (inputCommand.equalsIgnoreCase(EXIT_COMMAND)) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
        }
    }
}
