package lastpencil;

import java.util.Scanner;

public class SetPenciles {

    public int checkValidInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String num = scanner.nextLine();
            if (!num.matches("\\d+")) {
                System.out.println("The number of pencils should be numeric");
                continue;
            }
            int pencils = Integer.parseInt(num);
            if (pencils < 1) {
                System.out.println("The number of pencils should be positive");
                continue;
            }
            return pencils;

        }
    }
}
