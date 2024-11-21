package Wise;
import java.util.*;

public class Saying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("명령 ) ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equalsIgnoreCase("종료")) {
                break;
            }
        }
        scanner.close();
    }
}

