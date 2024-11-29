package WiseSaying;

import WiseSaying.Controller.WiseSayingController;

import java.util.Scanner;

public class Run {
    private static final String EXIT_COMMAND = "exit";
    private static final String REGISTER_COMMAND = "register";
    private static final String LISTING_COMMAND = "list";

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String command = WiseSayingController.promptCommand(scanner);
                switch (command) {
                    case EXIT_COMMAND: {
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    }
                    case REGISTER_COMMAND: {
                        WiseSayingController.handleRegister(scanner);
                        break;
                    }
                    case LISTING_COMMAND: {
                        WiseSayingController.handleList();
                        break;
                    }
                    default: {
                        System.out.println("유효하지 않은 명령어입니다. 다시 입력해주세요.");
                        break;
                    }
                }
            }
        }
    }
}
