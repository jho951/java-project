package Wise.saying;

import create.wiseSayingList;
import java.util.*;

public class Saying {
    public static void main(String[] args) {
        System.out.println("명령 앱");
        Scanner scanner = new Scanner(System.in);
        List<wiseSayingList> wiseList = new ArrayList<>();
        int count = 0;
        label:
        while (true) {
            System.out.print("명령 ) ");
            String inputCommand = scanner.nextLine();
            // 명령어가 등록일 때
            switch (inputCommand) {
                case "등록":
                    count++;
                    System.out.print("명언을 입력해주세요: ");
                    String wiseSaying = scanner.nextLine();
                    System.out.print("작가를 입력해주세요: ");
                    String author = scanner.nextLine();
                    wiseSayingList newWise = new wiseSayingList(count, wiseSaying, author);
                    wiseList.add(newWise);
                    System.out.printf("%d번 명언이 등록되었습니다.\n", count);
                    break;
                // 명령어가 목차일 때
                case "목록":
                    System.out.println("---- 목록 ----");
                    for (wiseSayingList wise : wiseList) {
                        System.out.printf("%d: \"%s\" - %s\n", wise.listNum, wise.wiseSaying, wise.author);
                    }
                    break;
                // 명령어가 삭제일
                case "삭제":
                    System.out.println("몇번 명언을 삭제하시겠습니까?");
                    for (wiseSayingList wise : wiseList) {
                        System.out.printf("%d: \"%s\" - %s\n", wise.listNum, wise.wiseSaying, wise.author);
                    }
                    System.out.print("삭제 번호: ");
                    int deleteNum = Integer.parseInt(scanner.nextLine());
                    System.out.printf("%s번 명언이 삭제되었습니다.\n", deleteNum);
                    break;
                // 명령어가 종료일 때
                case "종료":
                    System.out.println("종료합니다.");
                    break label;
                // 명령어가 다를 때
                default:
                    System.out.println("알 수 없는 명령입니다. 등록, 목록, 종료 중 하나를 입력하세요.");
                    break;
            }
        }
        scanner.close();
    }
}
