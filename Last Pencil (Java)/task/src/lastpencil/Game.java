package lastpencil;


import lastpencil.player.Player;

public class Game {
    private int pencils;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;

    public Game(int pencils, Player botPlayer, Player humanPlayer, Player currentPlayer) {
        this.pencils = pencils;
        this.player1 = botPlayer;
        this.player2 = humanPlayer;
        this.currentPlayer = currentPlayer;
        player1.setPencils(pencils);
        player2.setPencils(pencils);
    }

    public void play() {
        remainedPencils();
        System.out.println();

        while (true) {
            System.out.println(currentPlayer.getName() + "'s turn");
            int takenPencils = currentPlayer.takePencils();
            pencils -= takenPencils;
            if (pencils == 0) {
                currentPlayer = currentPlayer.equals(player1) ? player2 : player1;
                System.out.println(currentPlayer.getName() + " won!");
                break;
            }
            remainedPencils();
            System.out.println();
            currentPlayer = currentPlayer.equals(player1) ? player2 : player1;

            player1.setPencils(pencils);
            player2.setPencils(pencils);
        }
    }

    private void remainedPencils() {
        for (int i = 0; i < pencils; i++) {
            System.out.print("|");
        }
    }


}
