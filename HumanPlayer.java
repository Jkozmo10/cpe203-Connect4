public class HumanPlayer implements Player {
    private String name;


    public HumanPlayer(String name) {
        this.name = name;
    }

    public Board takeTurn(Board board) { {
        System.out.println("Player 1's Turn? " + Connect4.player1);
        //System.out.println("HERE");
        //if (Connect4.numMousePressed > 0) //{

            //System.out.println("CURRENT " + Connect4.tokens[Connect4.numMousePressed].x);
            //System.out.println(Connect4.numMousePressed);

            if (100 < Connect4.getPlayerMouseX()
                    && Connect4.getPlayerMouseX() < 173) {

                for (int row = 5; row > -1; row--) {
                    //System.out.println(row);
                    if (board.getBoard()[row][0] == 0 && Connect4.player1) {
                        board.getBoard()[row][0] = 1;
                        break;
                    }
                    if (board.getBoard()[row][0] == 0 && !Connect4.player1){
                        board.getBoard()[row][0] = 2;
                        break;
                    }
                }
            }
        //}
        if (173 < Connect4.getPlayerMouseX()
                && Connect4.getPlayerMouseX() < 239) {
            for (int row = 5; row > -1; row--) {
                //System.out.println(row);
                if (board.getBoard()[row][1] == 0 && Connect4.player1) {
                    board.getBoard()[row][1] = 1;
                    break;
                }
                if (board.getBoard()[row][1] == 0 && !Connect4.player1){
                    board.getBoard()[row][1] = 2;
                    break;
                }
            }

        }
        if (239 < Connect4.getPlayerMouseX()
                && Connect4.getPlayerMouseX() < 307) {
            for (int row = 5; row > -1; row--) {
                //System.out.println(row);
                if (board.getBoard()[row][2] == 0 && Connect4.player1) {
                    board.getBoard()[row][2] = 1;
                    break;
                }
                if (board.getBoard()[row][2] == 0 && !Connect4.player1){
                    board.getBoard()[row][2] = 2;
                    break;
                }
            }

        }
        if (307 < Connect4.getPlayerMouseX()
                && Connect4.getPlayerMouseX() < 382) {
            for (int row = 5; row > -1; row--) {
                //System.out.println(row);
                if (board.getBoard()[row][3] == 0 && Connect4.player1) {
                    board.getBoard()[row][3] = 1;
                    break;
                }
                if (board.getBoard()[row][3] == 0 && !Connect4.player1){
                    board.getBoard()[row][3] = 2;
                    break;
                }
            }


        }
        if (382 < Connect4.getPlayerMouseX()
                && Connect4.getPlayerMouseX() < 452) {

            for (int row = 5; row > -1; row--) {
                //System.out.println(row);
                if (board.getBoard()[row][4] == 0 && Connect4.player1) {
                    board.getBoard()[row][4] = 1;
                    break;
                }
                if (board.getBoard()[row][4] == 0 && !Connect4.player1){
                    board.getBoard()[row][4] = 2;
                    break;
                }
            }


        }
        if (452 < Connect4.getPlayerMouseX()
                && Connect4.getPlayerMouseX() < 521) {
            for (int row = 5; row > -1; row--) {
                //System.out.println(row);
                if (board.getBoard()[row][5] == 0 && Connect4.player1) {
                    board.getBoard()[row][5] = 1;
                    break;
                }
                if (board.getBoard()[row][5] == 0 && !Connect4.player1){
                    board.getBoard()[row][5] = 2;
                    break;
                }
            }

        }
        if (521 < Connect4.getPlayerMouseX()
                && Connect4.getPlayerMouseX() < 592) {

            for (int row = 5; row > -1; row--) {
                //System.out.println(row);
                if (board.getBoard()[row][6] == 0 && Connect4.player1) {
                    board.getBoard()[row][6] = 1;
                    break;
                }
                if (board.getBoard()[row][6] == 0 && !Connect4.player1){
                    board.getBoard()[row][6] = 2;
                    break;
                }
            }

        }
//				for (int i = 0; i < savedTokens.size() - 1 ; i+=2){
//					stroke(255, 0, 0);
//					fill(255,0,0);
//					circle(savedTokens.get(i), savedTokens.get(i+1), 53);
//
//				}
//			}
    }

//            if (100 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 173) {
//                //System.out.println("RAN");
//                int i = board.tokensInCol.get(0);
//
//                if (i < 6) {
//
//                    while (board.col1[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col1[i] = 588;
//                    } else {
//                        //System.out.println(col1[0]);
//                        board.col1[i] = board.col1[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(0);
//                    board.tokensInCol.set(0, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(136, col1[i], 53);
//                    //System.out.println("HERE");
//                    Connect4.tokens[Connect4.numMousePressed].x = 136;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col1[i];
//                    board.savedTokens.add(136);
//                    board.savedTokens.add(board.col1[i]);
//                    //System.out.println("Tokens");
//
//                    for (int row = 5; row > -1; row--){
//                        //System.out.println(row);
//                        if (board.getGrid()[row][0] == 0){
//                            board.getGrid()[row][0] = 1;
//                            break;
//                        }
//                    }
//                }
//            }
//            if (173 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 239) {
//                int i = board.tokensInCol.get(1);
//                if (i < 6) {
//
//                    while (board.col2[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col2[i] = 588;
//                    } else {
//                        //System.out.println(col2[0]);
//                        board.col2[i] = board.col2[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(1);
//                    board.tokensInCol.set(1, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(207, col2[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 207;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col2[i];
//                    board.savedTokens.add(207);
//                    board.savedTokens.add(board.col2[i]);
//                }
//
//            }
//            if (239 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 307) {
//                int i = board.tokensInCol.get(2);
//
//                if (i < 6) {
//
//                    while (board.col3[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col3[i] = 588;
//                    } else {
//                        board.col3[i] = board.col3[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(2);
//                    board.tokensInCol.set(2, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(277, col3[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 277;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col3[i];
//                    board.savedTokens.add(277);
//                    board.savedTokens.add(board.col3[i]);
//                }
//
//            }
//            if (307 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 382) {
//                int i = board.tokensInCol.get(3);
//
//                if (i < 6) {
//
//                    while (board.col4[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col4[i] = 588;
//                    } else {
//                        board.col4[i] = board.col4[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(3);
//                    board.tokensInCol.set(3, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(349, col4[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 349;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col4[i];
//                    board.savedTokens.add(349);
//                    board.savedTokens.add(board.col4[i]);
//
//                }
//
//
//            }
//            if (382 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 452) {
//
//                int i = board.tokensInCol.get(4);
//
//                if (i < 6) {
//
//                    while (board.col5[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col5[i] = 588;
//                    } else {
//                        board.col5[i] = board.col5[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(4);
//                    board.tokensInCol.set(4, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(420, col5[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 420;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col5[i];
//                    board.savedTokens.add(420);
//                    board.savedTokens.add(board.col5[i]);
//
//                }
//
//
//            }
//            if (452 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 521) {
//                int i = board.tokensInCol.get(5);
//
//                if (i < 6) {
//
//                    while (board.col6[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col6[i] = 588;
//                    } else {
//                        board.col6[i] = board.col6[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(5);
//                    board.tokensInCol.set(5, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(491, col6[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 491;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col6[i];
//                    board.savedTokens.add(491);
//                    board.savedTokens.add(board.col6[i]);
//
//                }
//
//            }
//            if (521 < Connect4.tokens[Connect4.numMousePressed].x
//                    && Connect4.tokens[Connect4.numMousePressed].x < 592) {
//
//                int i = board.tokensInCol.get(6);
//
//                if (i < 6) {
//
//                    while (board.col7[i] != 0) {
//                        i++;
//                    }
//                    //i--;
//
//                    if (i == 0) {
//                        board.col7[i] = 588;
//                    } else {
//                        board.col7[i] = board.col7[i - 1] - 70;
//                    }
//
//                    int prev = board.tokensInCol.get(6);
//                    board.tokensInCol.set(6, prev + 1);
//
////                    stroke(255, 0, 0);
////                    fill(255, 0, 0);
////                    circle(562, col7[i], 53);
//                    Connect4.tokens[Connect4.numMousePressed].x = 562;
//                    Connect4.tokens[Connect4.numMousePressed].y = board.col7[i];
//                    board.savedTokens.add(562);
//                    board.savedTokens.add(board.col7[i]);
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
        return board;


    }

    public boolean TestTurn(){
        return true;
    }

    public String getName(){
        return this.name;
    }

}
