package lastpencil.player;

public class BotPlayer extends Player{

    public BotPlayer() {
    }

    public int takePencils() {
        if (pencils == 1) {
            System.out.println("1");
            return 1;
        } else {
            int remainingPencils = pencils % 4;
            switch (remainingPencils) {
                case 1 -> {
                    int num = (int) (Math.random() * 3) + 1;
                    System.out.println(num);
                    return num;

                }
                case 2 -> {
                    System.out.println("1");
                    return 1;
                }
                case 3 -> {
                    System.out.println("2");
                    return 2;
                }
                case 0 -> {
                    System.out.println("3");
                    return 3;
                }
            }
        }
        return 0; // Add a default return statement
    }


}
