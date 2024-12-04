package WiseSaying;

import WiseSaying.Controller.WiseSayingController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    private static final String EXIT_COMMAND = "exit";
    private static final Map<String, Runnable> COMMAND_MAP = new HashMap<>();

    public static void run() {
        WiseSayingController controller = new WiseSayingController();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String command = controller.promptCommand(scanner);
                switch (command) {
                    case "register" -> controller.handleRegister(scanner);
                    case "list" -> controller.handleList();
                    case "delete" -> controller.handleDelete(scanner);
                    case EXIT_COMMAND -> {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("유효하지 않은 명령어입니다. 다시 입력해주세요.");
                }
            }
        }
    }
}
