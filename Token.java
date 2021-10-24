import processing.core.PApplet;
import processing.core.PImage;

public class Token {
    public int x;
    public int y;

    public int getX(){
        return this.x;
    }

    public int getY() {
        return y;
    }


    @Override
    public String toString() {
        return "Token{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static Token[][] tokenArray(){
        Token[][] tokens = new Token[6][7];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                if (i == 0){
                    tokens[i][j] = new Token();
                    tokens[i][j].x = 137 + j * 69;
                    tokens[i][j].y = 238;
                }
                if (i == 1){
                    tokens[i][j] = new Token();
                    tokens[i][j].x = 137 + j * 69;
                    tokens[i][j].y = 308;
                }
                if (i == 2){
                    tokens[i][j] = new Token();
                    tokens[i][j].x = 137 + j * 69;
                    tokens[i][j].y = 378;
                }
                if (i == 3){
                    tokens[i][j] = new Token();
                    tokens[i][j].x = 137 + j * 69;
                    tokens[i][j].y = 448;
                }
                if (i == 4){
                    tokens[i][j] = new Token();
                    tokens[i][j].x = 137 + j * 69;
                    tokens[i][j].y = 518;
                }
                if (i == 5){
                    tokens[i][j] = new Token();
                    tokens[i][j].x = 137 + j * 69;
                    tokens[i][j].y = 588;
                }
            }
        }
        return tokens;
    }
}
