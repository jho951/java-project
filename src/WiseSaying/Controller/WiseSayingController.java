package WiseSaying.Controller;

import WiseSaying.Elements.WiseSaying;
import java.util.ArrayList;
import java.util.Scanner;

public class WiseSayingController {
    private static final ArrayList<WiseSaying> wiseSayingList = new ArrayList<>();// 명언 목록
    // 명령어 입력받기
    public static String promptCommand(Scanner scanner) {
        System.out.print("명령어: ");
        return scanner.nextLine().trim();
    }

    // 명언 등록 처리
    public static void handleRegister(Scanner scanner) {
        String title = handleEmptyInput(scanner, "명언");
        String author = handleEmptyInput(scanner, "작가");
        WiseSaying wiseSaying = new WiseSaying(title, author);
        wiseSayingList.add(wiseSaying);
        System.out.printf("%d번째 명언이 등록되었습니다.\n", wiseSaying.getId());
    }

    // 비어 있지 않은 입력 받기
    public static String handleEmptyInput(Scanner scanner, String inputType) {
        while (true) {
            System.out.printf("%s를 입력해주세요: ", inputType);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.printf("%s는 빈칸일 수 없습니다. 다시 입력해주세요.\n", inputType);
        }
    }

    // 등록된 명언 리스트 출력
    public static void handleList() {
        if (wiseSayingList.isEmpty()) {
            System.out.println("현재 등록된 명언이 없습니다.");
        }else{
            System.out.println("--- 등록된 명언 목록 ---");
            for (WiseSaying wiseSaying : wiseSayingList) {
                System.out.printf("%d. 명언: %s, 작가: %s \n",wiseSaying.getId(),wiseSaying.getTitle(),wiseSaying.getAuthor());
            }
        }
    }
}
