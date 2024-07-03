package lastpencil.player;

import java.util.Scanner;

public class HumanPlayer extends Player{

    Scanner scanner = new Scanner(System.in);

    public HumanPlayer() {
    }

    public int takePencils() {
        return checkValidTakenPencils();
    }

    private int checkValidTakenPencils() {
        while (true) {
            String num = scanner.nextLine();
            if (!num.matches("\\d+")) {
                System.out.println("Possible values: '1', '2', '3'");
                continue;
            }
            int takenPencils = Integer.parseInt(num);
            if (takenPencils > 3 || takenPencils < 1) {
                System.out.println("Possible values: '1', '2', '3'");
                continue;
            }
            if (pencils - takenPencils < 0) {
                System.out.println("Too many pencils were taken");
                continue;
            }
            return takenPencils;
        }
    }
}
