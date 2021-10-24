import java.util.Random;

public class RandomPlayer implements Player {
    private String name;

    Random rand = new Random();

    public RandomPlayer(String name){
        this.name = name;
    }

    public Board takeTurn(Board board){
        int randCol = rand.nextInt(6);
        for (int row = 5; row > -1; row--) {
            //System.out.println(row);
            if (board.getBoard()[row][randCol] == 0 && !Connect4.player1){
                board.getBoard()[row][randCol] = 2;
                break;
            }
        }

        return board;


    }

    public String getName(){
        return name;
    }
}
