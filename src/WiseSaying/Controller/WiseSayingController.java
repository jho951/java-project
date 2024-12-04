package WiseSaying.Controller;

import WiseSaying.Service.WiseSayingService;

import java.util.Scanner;

public class WiseSayingController {
    private final WiseSayingService service;

    public WiseSayingController() {
        this.service = new WiseSayingService();
    }

    // 명령어 입력받기
    public String promptCommand(Scanner scanner) {
        System.out.print("명령어: ");
        return scanner.nextLine().trim();
    }

    // 명언 등록 처리
    public void handleRegister(Scanner scanner) {
        String title = getInput(scanner, "명언");
        String author = getInput(scanner, "작가");
        int id = service.addWiseSaying(title, author);
        System.out.printf("%d번째 명언이 등록되었습니다.\n", id);
    }

    // 등록된 명언 리스트 출력
    public void handleList() {
        if (service.isListEmpty()) {
            System.out.println("현재 등록된 명언이 없습니다.");
        } else {
            System.out.println("--- 등록된 명언 목록 ---");
            service.getWiseSayingList().forEach(wiseSaying ->
                    System.out.printf("%d. 명언: %s, 작가: %s \n", wiseSaying.getId(), wiseSaying.getTitle(), wiseSaying.getAuthor()));
        }
    }

    // 명언 삭제 처리
    public void handleDelete(Scanner scanner) {
        if (service.isListEmpty()) {
            System.out.println("현재 등록된 명언이 없습니다.");
            return;
        }

        handleList();
        String idInput = getInput(scanner, "삭제할 명언 번호");
        try {
            int id = Integer.parseInt(idInput);
            if (service.deleteWiseSaying(id)) {
                System.out.println("명언이 삭제되었습니다.");
            } else {
                System.out.println("삭제하려는 명언이 존재하지 않습니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("유효한 번호를 입력해주세요.");
        }
    }

    // 입력 유효성 검증
    private String getInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.printf("%s를 입력해주세요: ", prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.printf("%s는 빈칸일 수 없습니다. 다시 입력해주세요.\n", prompt);
        }
    }
}
