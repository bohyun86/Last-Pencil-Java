package lastpencil;

import java.util.Scanner;

import lastpencil.player.Player;

public class AssignName {
    private final String botPlayerName;
    private final String humanPlayerName;

    public AssignName(String botPlayerName, String humanPlayerName) {
        this.botPlayerName = botPlayerName;
        this.humanPlayerName = humanPlayerName;
    }

    public Player chooseFirst(Player botPlayer, Player humanPlayer ) {
        Scanner scanner = new Scanner(System.in);
        botPlayer.setName(botPlayerName);
        humanPlayer.setName(humanPlayerName);
        while (true) {
            String name = scanner.nextLine();
            if (!name.equals(botPlayerName) && !name.equals(humanPlayerName)) {
                System.out.printf("Choose between '%s' or '%s'\n", botPlayerName, humanPlayerName);
            } else {
                if (name.equals(botPlayerName)) {
                    return botPlayer;
                } else {
                    return humanPlayer;
                }
            }
        }
    }
}

