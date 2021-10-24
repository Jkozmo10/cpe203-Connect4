import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Connect4 extends PApplet {

	public void settings() {
    size(700, 700);
	}

	private boolean redraw=false;
	private boolean start= true;
	private static boolean playerTurn = false;
	private static boolean mouseEligible = false;
	public static Token[][] tokens = Token.tokenArray();
	public static int playerMouseX;
	public static int playerMouseY;
	private static boolean eligible = false;
	public static boolean player1 = true;
	private static boolean randomPlayerGoes = false;
	//newTokens = Token.tokenArray();

//	ArrayList<Integer> tokensInCol = new ArrayList<Integer>(Collections.nCopies(7, 0));
//	public int[] col1 = new int[7];
//	public int[] col2 = new int[7];
//	public int[] col3 = new int[7];
//	public int[] col4 = new int[7];
//	public int[] col5 = new int[7];
//	public int[] col6 = new int[7];
//	public int[] col7 = new int[7];
	public static int numMousePressed = 0;
	Token token = new Token();
	//public static Token[] tokens = new Token[42];
	int tokensIndex;
	Board board = new Board(new int[6][7]);
	//public static Token[][]







	PImage img;
	public void setup() {

    	background(0);
    	//noLoop();

		img = loadImage("connect4.png");

  	}

  	public void draw() {


		if (start)
		{
			textSize(30);
			text("Welcome to Connect 4!", 170, 250);
			fill(0, 102, 153);
			text("Click to start playing", 190, 300);
			fill(0, 102, 153, 51);
			start= false;
		}

		if(redraw)
		{

			background(0);//reset background to gray
			//
			image(img,100,200);

//			//you can comment the next 3 lines out after you are done!
			textSize(18);
			fill(0, 102, 153, 255);
			text("Choose your Oponent:", 10, 30);

			text("Random Player", 40, 70);
			text("Smart Player", 40, 90);
			text("Unbeatable Player", 40, 110);
			text("Human Player (Friend)", 40, 130);
			//this will create a red line 10 pixel under the mouseclick
//			ColorRGB red = new ColorRGB(255,0,0);
//			stroke(red.R,red.B,red.G);
//			line(mouseX,mouseY+10,mouseX+100,mouseY+10);
//
			//this will create a green rectangle
			//stroke(0,255,0);
			//fill(0,255,0);
			//rect(100, 250, 100, 50);

			//this will create a blue dot at the place you clicked
			// for better visualization you can make this spot several pixels large
//			stroke(0,0,255);
//			point(mouseX,mouseY);

			//System.out.println("this.g " + this.g);
			//stroke(255,0,0);
			//fill(255,0,0);
			//circle(mouseX, mouseY, 53);
			//System.out.println("X: " + mouseX + " Y: " + mouseY);
//			System.out.println(tokensInCol);
//			DropToken token = new DropToken(mouseX, mouseY, tokensInCol);
//			ArrayList<Integer> coords;
//			coords = token.insertToken();
//
//			stroke(255, 0 ,0);
//			fill(255, 0 ,0);
//			circle(coords.get(0), coords.get(1), 53);

//
			//if (mouseEligible) {
				//if (numMousePressed > -1) {


//					stroke(255, 0, 0);
//					fill(255, 0, 0);

//					for (Token token : tokens) {
//						if (token != null)
//							circle(token.x, token.y, 53);
//					}
					//System.out.println(Arrays.toString(tokens));
					//System.out.println(Arrays.deepToString(board.getGrid()));
					//board.checkWin();

//					if (board.checkWin()) {
//						System.out.println("You win!");
//					}
				//}
			//}


		}
//		if (randomPlayerGoes){ //WORKS JUST NEEDS TO CHECK IF P2 IS A RANDOM PLAYER
//			textSize(20);
//			fill(0, 102, 153, 255);
//			text("CLICK FOR RANDOM PLAYER",80, 130);
//		}


		for (int row = 0; row < 6; row++) {
			//System.out.println("HERE");
			for (int col = 0; col < 7; col++) {
				//System.out.println("ROW: " + row + " COL: " + col);
				if (board.getBoard()[row][col] == 1) {
					//System.out.println("HERE");
					stroke(255, 0, 0);
					fill(255, 0, 0);
					circle(tokens[row][col].x, tokens[row][col].y, 53);
				}
				else if (board.getBoard()[row][col] == 2) {
					//System.out.println("HERE");
					stroke(255, 255, 0);
					fill(255, 255, 0);
					circle(tokens[row][col].x, tokens[row][col].y, 53);
				}
			}
		}

//			stroke(255, 0, 0);
//			fill(255,0,0);
//			circle(mouseX, mouseY, 53);
			//System.out.println("MouseX: " + mouseX + " MouseY: " + mouseY);


			redraw = false;
		}





  	public void mousePressed()
	{
		//System.out.println(mouseEligible);

		redraw= true;
		//if (eligible) {
		playerMouseX = mouseX;
		playerMouseY = mouseY;
		//}
		numMousePressed++;
		eligible = true;

//		if (mouseEligible) {
//			//System.out.println("MOUSE ELI");
//			numMousePressed++;
//			tokens[numMousePressed] = new Token();
//			tokens[numMousePressed].x = mouseX;
//			tokens[numMousePressed].y = mouseY;
//		}
		//System.out.println("ACTUAL: " + numMousePressed);

	}

//	public void Game(){
//		Player p1, p2;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Create Player 2");
//
//
//	}

  	public static void main(String args[]) {

      PApplet.main("Connect4");
	  //System.out.println(Arrays.deepToString(tokens));

	  Player p1, p2;
	  Board board = new Board(new int[6][7]);
	  int spaceHolder = 0;

	  Scanner in = new Scanner(System.in);
	  System.out.println("What is your name? ");
	  p1 = new HumanPlayer(in.next());

	  System.out.println("\nCreate your opponent: ");
	  p2 = createPlayer(in);
	  System.out.println(p2);

	  boolean done = false;

	  //while (!done){
		  //done = play(p1, board);

	  //}
		//playerTurn = true;
		//mouseEligible = true;
		//System.out.println("Mouse " + mouseEligible);
		while (numMousePressed <= 1){
			System.out.print("");
		}
		//System.out.println("NEXT");

		while (!done){
			System.out.println(Arrays.deepToString(board.getBoard()));
			//System.out.println("HERE");

			player1 = true;
			while (!eligible){
				System.out.print("");
			}
			done = play(p1, board);
			player1 = false;
			eligible = false;
			if (done){
				System.out.println("You " + "have won!!!");
			}
			else{
//				while (playerMouseX - prevxVal == 0 && playerMouseY - prevyVal == 0){
//					System.out.print("");
//				}
				randomPlayerGoes = true;
				while (!eligible){
					System.out.print("");
				}
				player1 = false;
				done = play(p2, board);
				randomPlayerGoes = false;
				eligible = false;
				player1 = true;
				if (done){
					System.out.println(p2.getName() + " has won! Better luck next time!");
				}
			}
		}
		//System.out.println(numMousePressed);
		//System.out.println("HELLO");
		//play(p1, board);

//			System.out.println(Arrays.deepToString(board.getBoard()));
//			System.out.println(board.getBoard()[5][0]);
//			System.out.println(tokens[5][0]);

			//mouseEligible = true;
			//System.out.print("NUMMOUSE: " +numMousePressed);
			//System.out.println("Mouse2 " + mouseEligible);
			//play(p1, board);

			//mouseEligible = false;

			//System.out.println("HERE" + numMousePressed);
			//playerTurn = false;


//	  Scanner in2 = new Scanner(System.in);
//	  System.out.println("Create Player 2: ");
//	  p2 = new HumanPlayer(in2.next());



   }


   public static Player createPlayer(Scanner in){
		Player p;
		String name;
		int type;

		System.out.println("Other Player's Name: ");
		name = in.next();

		System.out.println("Other Player type: 0 - Human Player, 1 - Smart Player, 2 - Random Player");
		type = in.nextInt();

		if (type == 0){
			p = new HumanPlayer(name);
		}
		if (type == 2){
			p = new RandomPlayer(name);
		}
		else
		{
			p = new HumanPlayer(name);
		}

		return p;


   }
   public static boolean play(Player p, Board board){
		//System.out.print(Arrays.toString(tokens));
		//while (tokens[numMousePressed] == null){
	   p.takeTurn(board);
		//}

		//System.out.println("PLayer: " + p + " has gone.");
		//System.out.print(numMousePressed);
		//System.out.println(Arrays.toString(tokens));

		return board.checkWin();

   }

	public boolean isPlayerTurn() {
		return playerTurn;
	}

	public static boolean isMouseEligible() {
		return mouseEligible;
	}

	public static int getPlayerMouseX() {
		return playerMouseX;
	}

	public static int getPlayerMouseY() {
		return playerMouseY;
	}
}
