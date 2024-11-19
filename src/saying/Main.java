package saying;

import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        Command var2 = new Command();
        Scanner var1 = new Scanner(System.in);


        String var3;
        do {
            System.out.print("명령 ) ");
            var3 = var1.nextLine();
            if (var3.equals("register")) {
                System.out.print("명언을 입력해주세요. : ");
                String var4 = var1.nextLine();
                var2.command("명언 : ", var4);
                System.out.print("작가를 입력해주세요. : ");
                String var5 = var1.nextLine();
                var2.command("작가 : ", var5);
            } else if (!var3.equals("exit")) {
                var2.command(var3, "은/는 올바르지 않는 명령어입니다.");
            }
        } while(!var3.equals("exit"));

        System.out.println("종료");
        var1.close();
    }
}
