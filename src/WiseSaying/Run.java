package WiseSaying;

import java.util.Scanner;
import WiseSaying.Elements.WiseSaying;

public class Run {
    private static final String EXIT_COMMAND = "exit";
    private static final String REGISTER_COMMAND = "register"; // 종료 명령어 정의

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("명령어 : ");
                String inputCommand = scanner.nextLine().trim(); // 명령어 입력
                if (inputCommand.equals(REGISTER_COMMAND)) {
                    System.out.println("명언을 입력해주세요.");
                    String wiseSayingCommand;
                    String authorCommand;
                    while (true) {
                        System.out.print("명언: ");
                        wiseSayingCommand = scanner.nextLine().trim();
                        if (wiseSayingCommand.isEmpty()) {
                            System.out.println("명언은 빈칸일 수 없습니다. 다시 입력해주세요.");
                        } else {
                            break; // 명언이 비어있지 않으면 반복 종료
                        }
                    }
                    System.out.println("작가를 입력해주세요.");
                    while (true) {
                        System.out.print("작가: ");
                        authorCommand = scanner.nextLine().trim();
                        if (authorCommand.isEmpty()) {
                            System.out.println("작가는 빈칸일 수 없습니다. 다시 입력해주세요.");
                        } else {
                            break; // 명언이 비어있지 않으면 반복 종료
                        }
                    }
                    WiseSaying.WiseSayingList item = new WiseSaying.WiseSayingList(wiseSayingCommand, authorCommand);
                    System.out.printf("%d번째 명언이 등록되었습니다.\n", item.num);
                    System.out.printf("명언: %s, 작가: %s \n", item.title, item.author);
                    continue;
                }
                if (inputCommand.isEmpty()) {
                    System.out.println("명령어를 입력해주세요.");
                    continue;
                }
                if (inputCommand.equalsIgnoreCase(EXIT_COMMAND)) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            }
        }
    }
}

