import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Board {


    public int[] col1 = new int[7];
    public int[] col2 = new int[7];
    public int[] col3 = new int[7];
    public int[] col4 = new int[7];
    public int[] col5 = new int[7];
    public int[] col6 = new int[7];
    public int[] col7 = new int[7];
    ArrayList<Integer> tokensInCol = new ArrayList<>(Collections.nCopies(7, 0));
    ArrayList<Integer> savedTokens = new ArrayList<>();
    private static int [][] board;

    //private int[][] board = new int[6][7];

    public Board(int[][] board){
        this.board = board;
    }

    public static int[][] getBoard() {
        return board;

    }

    //public Board dropToken(Board board) {
        //System.out.println(Connect4.numMousePressed);
//        if (Connect4.numMousePressed > -1) {
//
//            if (100 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 173) {
//                int i = tokensInCol.get(0);
//
//                if (i < 6) {
//
//                    while (col1[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col1[i] = 588;
//                    } else {
//                        //System.out.println(col1[0]);
//                        col1[i] = col1[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(0);
//                    tokensInCol.set(0, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(136, col1[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 136;
//                    Connect4.tokens[Connect4.numMousePressed].y = col1[i];
//                    savedTokens.add(136);
//                    savedTokens.add(col1[i]);
//
//                    for (int row = 5; row > -1; row--){
//                        //System.out.println(row);
//                        if (board.grid[row][0] == 0){
//                            board.grid[row][0] = 1;
//                            //System.out.println(Arrays.deepToString(board.grid));
//                            break;
//                        }
//                    }
//                }
//            }
//            if (173 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 239) {
//                int i = tokensInCol.get(1);
//                if (i < 6) {
//
//                    while (col2[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col2[i] = 588;
//                    } else {
//                        //System.out.println(col2[0]);
//                        col2[i] = col2[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(1);
//                    tokensInCol.set(1, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(207, col2[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 207;
//                    Connect4.tokens[Connect4.numMousePressed].y = col2[i];
//                    savedTokens.add(207);
//                    savedTokens.add(col2[i]);
//                }
//
//            }
//            if (239 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 307) {
//                int i = tokensInCol.get(2);
//
//                if (i < 6) {
//
//                    while (col3[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col3[i] = 588;
//                    } else {
//                        col3[i] = col3[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(2);
//                    tokensInCol.set(2, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(277, col3[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 277;
//                    Connect4.tokens[Connect4.numMousePressed].y = col3[i];
//                    savedTokens.add(277);
//                    savedTokens.add(col3[i]);
//                }
//
//            }
//            if (307 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 382) {
//                int i = tokensInCol.get(3);
//
//                if (i < 6) {
//
//                    while (col4[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col4[i] = 588;
//                    } else {
//                        col4[i] = col4[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(3);
//                    tokensInCol.set(3, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(349, col4[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 349;
//                    Connect4.tokens[Connect4.numMousePressed].y = col4[i];
//                    savedTokens.add(349);
//                    savedTokens.add(col4[i]);
//
//                }
//
//
//            }
//            if (382 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 452) {
//
//                int i = tokensInCol.get(4);
//
//                if (i < 6) {
//
//                    while (col5[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col5[i] = 588;
//                    } else {
//                        col5[i] = col5[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(4);
//                    tokensInCol.set(4, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(420, col5[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 420;
//                    Connect4.tokens[Connect4.numMousePressed].y = col5[i];
//                    savedTokens.add(420);
//                    savedTokens.add(col5[i]);
//
//                }
//
//
//            }
//            if (452 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 521) {
//                int i = tokensInCol.get(5);
//
//                if (i < 6) {
//
//                    while (col6[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col6[i] = 588;
//                    } else {
//                        col6[i] = col6[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(5);
//                    tokensInCol.set(5, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(491, col6[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 491;
//                    Connect4.tokens[Connect4.numMousePressed].y = col6[i];
//                    savedTokens.add(491);
//                    savedTokens.add(col6[i]);
//
//                }
//
//            }
//            if (521 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 592) {
//
//                int i = tokensInCol.get(6);
//
//                if (i < 6) {
//
//                    while (col7[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        col7[i] = 588;
//                    } else {
//                        col7[i] = col7[i - 1] - 70;
//                    }
//
//                    int prev = tokensInCol.get(6);
//                    tokensInCol.set(6, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(562, col7[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 562;
//                    Connect4.tokens[Connect4.numMousePressed].y = col7[i];
//                    savedTokens.add(562);
//                    savedTokens.add(col7[i]);
//
//                }
//
//            }
////				for (int i = 0; i < savedTokens.size() - 1 ; i+=2){
////					stroke(255, 0, 0);
////					fill(255,0,0);
////					circle(savedTokens.get(i), savedTokens.get(i+1), 53);
////
////				}
////			}
//        }
//        return board;
    //}











    public boolean checkWin(){
        //int count = 0;
        for (int[] row : board){ //horizontal check
            for (int i = 0; i < 3; i++){
                if (row[i] == row[i+1] && row[i+1] == row[i+2] && row[i+2] == row[i+3]){
                    if (row[i] != 0){
                        return true;
                    }

                }
            }
        }
        for (int row = 0; row < 3; row++){ //Vertical check
            for (int col = 0; col < 6; col++){
                if (board[row][col] ==  board[row+1][col] &&  board[row+1][col] == board[row+2][col] &&
                        board[row+2][col] == board[row+3][col]){
                    if (board[row][col] != 0)
                    return true;
                }
            }
        }

        for (int row = 3; row < 6; row++){ //Diagonal check bot left to top right
            for (int col = 0; col < 4; col++){
                if (board[row][col] == board[row-1][col+1] && board[row-1][col+1] == board[row-2][col+2]
                && board[row-2][col+2] == board[row-3][col+3]){
                    if (board[row][col] != 0)
                    return true;
                }
            }
        }

        for (int row = 0; row < 3; row++) //Diagonal check top left to bottom right
            for (int col = 0; col < 4; col++){
                if (board[row][col] ==  board[row+1][col+1] && board[row+1][col+1] == board[row+2][col+2]
                && board[row+2][col+2] == board[row+3][col+3]){
                    if (board[row][col] != 0)
                    return true;
            }
        }

        return false;
    }


}
