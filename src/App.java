import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("== 명언 앱 ==");
       System.out.print("명령: ");
       String command = scanner.nextLine();
       if(command.equals("register")){
           System.out.print("명언: ");
           scanner.nextLine();
           System.out.print("작가: ");
           scanner.nextLine();
       }
       System.out.print("== 종료 ==");
       scanner.close();
    }
}
