package Wise.saying;

import create.WiseSayingList;
import java.util.*;

public class Saying {
        public static void main(String[] args) {
            App app = new App();
            app.run();
        }
}

class App {
    public void run(){
        List<WiseSayingList> wiseSayingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("명령 ) ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equalsIgnoreCase("등록")) {
                System.out.print("명언을 입력해주세요: ");
                String wiseSaying = scanner.nextLine();
                System.out.print("작가를 입력해주세요: ");
                String author = scanner.nextLine();

                WiseSayingList newWise = new WiseSayingList(wiseSaying, author);
                wiseSayingList.add(newWise);
                System.out.printf("%d번 명언이 등록되었습니다.\n", newWise.getListNum());
            }
            else if (inputCommand.equalsIgnoreCase("목록")) {
                System.out.println("---- 목록 ----");
                for (WiseSayingList wise : wiseSayingList) {
                    System.out.println(wise);
                }
            }
            else if (inputCommand.equalsIgnoreCase("삭제")) {
                System.out.print("삭제할 번호 입력: ");
                int deleteId = Integer.parseInt(scanner.nextLine());

                boolean removed = wiseSayingList.removeIf(wise -> wise.getListNum() == deleteId);
                if (removed) {
                    System.out.printf("%d번 명언이 삭제되었습니다.\n", deleteId);
                }
            }
            else if (inputCommand.equalsIgnoreCase("종료")) {
                System.out.println("종료합니다.");
                break;
            }
            else {
                System.out.println("알 수 없는 명령입니다. 등록, 목록, 삭제, 종료 중 하나를 입력하세요.");
            }
        }

        scanner.close();
    }
}
