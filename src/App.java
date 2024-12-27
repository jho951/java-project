import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int wiseNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true) {
           System.out.print("명령: ");
           String command = scanner.nextLine();
           if(command.equals("exit")){
               System.out.println("==종료==");
               break;
           }
           if(command.equals("register")){
               System.out.print("명언: ");
               scanner.nextLine();
               System.out.print("작가: ");
               scanner.nextLine();
               wiseNum++;
               System.out.printf("%d번 명령이 등록되었습니다.\n",wiseNum);
           }
       }
        scanner.close();
    }
}
