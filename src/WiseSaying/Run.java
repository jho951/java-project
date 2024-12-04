package WiseSaying;

import WiseSaying.Controller.WiseSayingController;

import java.util.Scanner;

public class Run {
    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            WiseSayingController controller = new WiseSayingController(scanner);
            while (true) {
                String command = controller.view.promptCommand(); // View에서 명령어 입력 받음
                switch (command) {
                    case "register" -> controller.handleRegister();
                    case "list" -> controller.handleList();
                    case "delete" -> controller.handleDelete();
                    case "exit" -> {
                        controller.view.printExitMessage();
                        return;
                    }
                    default -> System.out.println("유효하지 않은 명령어입니다.");
                }
            }
        }
    }
}
