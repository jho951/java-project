package WiseSaying;

import java.util.Scanner;
import WiseSaying.Elements.WiseSaying;

public class Run {
    private static final String EXIT_COMMAND = "exit";
    private static final String REGISTER_COMMAND = "register"; // 종료 명령어 정의

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("명령 ) ");
                String inputCommand = scanner.nextLine().trim(); // 경우 수 지우기
                if(inputCommand.equals(REGISTER_COMMAND)) {
                    System.out.println("명언을 입력해주세요.");
                    System.out.print("명언: ");
                    String wiseSayingCommand = scanner.nextLine().trim();
                    WiseSaying.WiseSayingList item = new WiseSaying.WiseSayingList(wiseSayingCommand, "ㄴㅇㄹ");
                    System.out.println("등록된 명언 ID: " + item.num + ", 명언: " + item.title + ", 작가: " + item.author);
                    continue;
                }
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
