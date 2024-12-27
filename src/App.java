import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("== 명언 앱 ==");
       String command = scanner.nextLine();
       System.out.printf("명령: %s", command);
    }
}
