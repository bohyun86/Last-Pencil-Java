package lastpencil;

import lastpencil.player.BotPlayer;
import lastpencil.player.HumanPlayer;
import lastpencil.player.Player;

public class Main {
    public static void main(String[] args) {

        AssignName assignName = new AssignName("Jack", "John");
        SetPenciles setPenciles = new SetPenciles();

        Player humanPlayer = new HumanPlayer();
        Player botPlayer = new BotPlayer();


        System.out.println("How many pencils would you like to use:");
        int pencils = setPenciles.checkValidInput();
        System.out.println("Who will be the first (John, Jack):");
        Player currentPlayer = assignName.chooseFirst(botPlayer, humanPlayer);

        Game game = new Game(pencils, botPlayer, humanPlayer, currentPlayer);

        game.play();
    }




}
