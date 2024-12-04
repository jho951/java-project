package WiseSaying.View;

import WiseSaying.Model.WiseSaying;
import java.util.List;
import java.util.Scanner;

public class WiseSayingView {
    private final Scanner scanner;

    public WiseSayingView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String promptCommand() {
        System.out.print("명령어: ");
        return scanner.nextLine().trim();
    }

    public String getInput(String prompt) {
        System.out.printf("%s를 입력해주세요: ", prompt);
        return scanner.nextLine().trim();
    }

    public void printRegisterResult(int id) {
        System.out.printf("%d번째 명언이 등록되었습니다.\n", id);
    }

    public void printWiseSayingList(List<WiseSaying> wiseSayingList) {
        if (wiseSayingList.isEmpty()) {
            System.out.println("현재 등록된 명언이 없습니다.");
        } else {
            System.out.println("--- 등록된 명언 목록 ---");
            wiseSayingList.forEach(wiseSaying ->
                    System.out.printf("%d. 명언: %s, 작가: %s\n",
                            wiseSaying.getId(), wiseSaying.getTitle(), wiseSaying.getAuthor()));
        }
    }

    public void printDeleteResult(boolean isDeleted) {
        if (isDeleted) {
            System.out.println("명언이 삭제되었습니다.");
        } else {
            System.out.println("삭제하려는 명언이 존재하지 않습니다.");
        }
    }

    public void printExitMessage() {
        System.out.println("프로그램을 종료합니다.");
    }
}
