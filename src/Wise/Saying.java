package Wise;
import java.util.*;

public class Saying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("명령 ) ");
            String inputCommand = scanner.nextLine();
            if(inputCommand.equalsIgnoreCase("등록")) {
                System.out.println("명언을 입력해주세요.");
                String wiseSaying = scanner.nextLine();
                System.out.printf("명언 : %s \n", wiseSaying);
                System.out.println("작가를 입력해주세요.");
                String author = scanner.nextLine();
                System.out.printf("작가 : %s", author);
                break;
            }
            if (inputCommand.equalsIgnoreCase("종료")) {
                break;
            }
        }
        scanner.close();
    }
}

