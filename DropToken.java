import processing.core.PApplet;

import java.util.ArrayList;

public class DropToken extends PApplet {

    private int x;
    private int y;
    int[] col1 = new int[7];
    int[] col2 = new int[7];
    int[] col3 = new int[7];
    int[] col4 = new int[7];
    int[] col5 = new int[7];
    int[] col6 = new int[7];
    int[] col7 = new int[7];
    ArrayList<Integer> tokensInCol;




    public DropToken(int x, int y, ArrayList tokensInCol){
        this.x = x;
        this.y = y;
        this.tokensInCol = tokensInCol;
    }

    public ArrayList<Integer> insertToken(){
//        ArrayList<Integer> col1 = new ArrayList<>(7);
//        ArrayList<Integer> col2 = new ArrayList<>(7);
//        ArrayList<Integer> col3 = new ArrayList<>(7);
//        ArrayList<Integer> col4 = new ArrayList<>(7);
//        ArrayList<Integer> col5 = new ArrayList<>(7);
//        ArrayList<Integer> col6 = new ArrayList<>(7);
//        ArrayList<Integer> col7 = new ArrayList<>(7);

        ArrayList<Integer> coords = new ArrayList<>(2);


        if (100 < this.x && this.x < 173)
        {
            int i = tokensInCol.get(0);

            while (col1[i] != 0){
            i++;
        }
        //i--;

        if (i == 0){
            col1[i] = 588;
        }
        else
        {
            System.out.println(col1[0]);
            col1[i] = col1[i-1] + 70;
        }

//        stroke(255,0,0);
//        fill(255,0,0);
//        circle(136, col1[i], 53);
//
        coords.add(136);
        coords.add(col1[i]);

        int prev = tokensInCol.get(0);
        tokensInCol.set(0, prev + 1);
        //System.out.println(coords);

        return coords;




        }
        if (173 < this.x && this.x < 239){

        }
        if (239 < this.x && this.x < 307){

        }
        if (307 < this.x && this.x < 382){

        }
        if (382 < this.x && this.x < 452){

        }
        if (452 < this.x && this.x < 521){

        }
        if (521 < this.x && this.x < 592){

        }

        coords.add(-100);
        coords.add(-100);

        return coords;






    }

}
