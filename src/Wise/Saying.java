package Wise;
import java.util.*;

public class Saying {
    public static void main(String[] args) {
        System.out.println("명령 앱");
        Scanner scanner = new Scanner(System.in);
        List<wiseSayingList> wiseList = new ArrayList<>();
        int count = 0;

        while (true) {
            System.out.print("명령 ) ");
            String inputCommand = scanner.nextLine();
            // 명령어가 등록일 때
            if (inputCommand.equalsIgnoreCase("등록")) {
                count ++;
                System.out.print("명언을 입력해주세요: ");
                String wiseSaying = scanner.nextLine();
                System.out.print("작가를 입력해주세요: ");
                String author = scanner.nextLine();
                wiseSayingList newWise = new wiseSayingList(count, wiseSaying, author);
                wiseList.add(newWise);
                System.out.printf("%d번 명언이 등록되었습니다.\n", count);
            }

            // 명령어가 목차일 때
            else if (inputCommand.equalsIgnoreCase("목차")) {
                System.out.println("---- 목록 ----");
                for (wiseSayingList wise : wiseList) {
                    System.out.printf("%d: \"%s\" - %s\n", wise.listNum, wise.wiseSaying, wise.author);
                }
            }
            // 명령어가 종료일 때
            else if (inputCommand.equalsIgnoreCase("종료")) {
                System.out.println("종료");
                break;
            }
            // 명령어가 다를 때
            else {
                System.out.println("알 수 없는 명령입니다. 등록, 목차, 종료 중 하나를 입력하세요.");
            }
        }
        scanner.close();
    }

    // 명언 데이터를 저장할 클래스
    static class wiseSayingList {
        int listNum;
        String wiseSaying;
        String author;

        public wiseSayingList(int listNum, String wiseSaying, String author) {
            this.listNum = listNum;
            this.wiseSaying = wiseSaying;
            this.author = author;
        }
    }
}
