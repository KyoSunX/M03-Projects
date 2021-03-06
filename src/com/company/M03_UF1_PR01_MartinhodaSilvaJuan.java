package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class M03_UF1_PR01_MartinhodaSilvaJuan {
    /*
    do gameBoard - DONE
    do userMove - DONE
    do computerMove
    do gameBoardUpdated - DONE
    do checkValidPlays - DONE
    do when the game is won - DONE
    do menu - DONE
    do userWins / computerWins (matrix)
    do Bo3 / Bo5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String welcomeGame = "Welcome to Tic Tac Toe game!";
        String gameMenu = "1. Player VS Player Tic Tac Toe Game\n2. Player VS Computer \n3. Exit";
        boolean inputCorrectUser = false, exitMenu = false;
        String nextTurn;

        do {
            boolean winner = false;
            int inputGameMenu;


            System.out.println(welcomeGame);
            do {
                System.out.println(gameMenu);
                inputCorrectUser = input.hasNextInt();
                if (!inputCorrectUser) {
                    System.out.println("Wrong input.\n");
                    input.nextLine();
                }

            } while (!inputCorrectUser);
            inputGameMenu = input.nextInt();
            input.nextLine();


            switch (inputGameMenu) {
                case 1:

                    String[] board = new String[9]; //positions in my Board.
                    String namePlayer1, namePlayer2;
                    // Board
                    System.out.println("\nTicTacToe is here!\nPlayer VS Player MODE\n");
                    System.out.println("Enter your name(Player 1(X)):");
                    namePlayer1 = input.next();
                    input.nextLine();
                    System.out.println("Enter your name(Player 2(O)):");
                    namePlayer2 = input.next();

                    for (int i = 0; i < 9; i++) {
                        board[i] = String.valueOf(i + 1);
                    }

                    System.out.println("+---+---+---+");
                    System.out.print("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
                    System.out.println("\n+---+---+---+");
                    System.out.print("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
                    System.out.println("\n+---+---+---+");
                    System.out.print("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
                    System.out.println("\n+---+---+---+");
                    System.out.println();

                    //Input movements for USER
                    nextTurn = "X";

                    while (!winner) {

                        int numInput = 0;

                        do {
                            System.out.println("Write the position number for your movement..");
                            inputCorrectUser = input.hasNextInt();
                            if (!inputCorrectUser) {
                                input.nextLine();
                            } else {
                                numInput = input.nextInt();
                                input.nextLine();
                            }
                            if (numInput < 1 || numInput > 9) {
                                System.out.println("Between 1 and 9.");
                                inputCorrectUser = false;
                            }
                        } while (!inputCorrectUser);

                        if (board[numInput - 1].equals(String.valueOf(numInput))) { //check error controls between 1 and 9.
                            board[numInput - 1] = nextTurn;

                            if (nextTurn.equals("X")) {
                                nextTurn = "O";
                            } else {
                                nextTurn = "X";
                            }
                            //do gameBoardUpdated

                            System.out.println("+---+---+---+");
                            System.out.print("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.print("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.print("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.println();
                        } else {
                            System.out.println("Position already take it.");
                        }

                        //do when the game is won
                        for (int i = 0; i < 8; i++) {
                            String line = null;
                            switch (i) {
                            /*
                            0 1 2
                            3 4 5
                            6 7 8
                            Look for all chances to win
                             */
                                case 0:
                                    line = board[0] + board[1] + board[2];
                                    break;
                                case 1:
                                    line = board[3] + board[4] + board[5];
                                    break;
                                case 2:
                                    line = board[6] + board[7] + board[8];
                                    break;
                                case 3:
                                    line = board[0] + board[4] + board[8];
                                    break;
                                case 4:
                                    line = board[2] + board[4] + board[6];
                                    break;
                                case 5:
                                    line = board[0] + board[3] + board[6];
                                    break;
                                case 6:
                                    line = board[1] + board[4] + board[7];
                                    break;
                                case 7:
                                    line = board[2] + board[5] + board[8];
                                    break;
                            }
                            if (line.equals("XXX")) {
                                System.out.println(namePlayer1 + " win!");
                                winner = true;

                            } else if (line.equals("OOO")) {
                                System.out.println(namePlayer2 + " win!");
                                winner = true;
                            }
                        }
                        //need draw !(look on internet) https://www.educative.io/edpresso/what-is-the-arraylistcontains-method-in-java  /  https://www.geeksforgeeks.org/arrays-aslist-method-in-java-with-examples/

                        for (int i = 0; i < 9; i++) {
                            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                                break;
                            } else if (i == 8) {
                                System.out.println("Draw!");
                                winner = true;
                            }
                        }
                    }

                    break;
                case 2:

                    Random rand = new Random();

                    board = new String[9];


                    System.out.println("\nTicTacToe is here!\nPlayer VS Computer MODE\n");
                    System.out.print("Enter your name: ");
                    namePlayer1 = input.next();

                    for (int i = 0; i < 9; i++) {
                        board[i] = String.valueOf(i + 1);
                    }

                    System.out.println("+---+---+---+");
                    System.out.print("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
                    System.out.println("\n+---+---+---+");
                    System.out.print("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
                    System.out.println("\n+---+---+---+");
                    System.out.print("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
                    System.out.println("\n+---+---+---+");
                    System.out.println();

                    nextTurn = "X";

                    while (!winner) {

                        int numInput = 0;
                        int computerInput = rand.nextInt(9) + 1;


                        do {
                            System.out.println("Write the position number for your movement..");
                            inputCorrectUser = input.hasNextInt();
                            if (!inputCorrectUser) {
                                input.nextLine();
                            } else {
                                numInput = input.nextInt();
                                input.nextLine();
                            }
                            if (numInput < 1 || numInput > 9) {
                                System.out.println("Between 1 and 9.");
                                inputCorrectUser = false;
                            }
                        } while (!inputCorrectUser);

                        if (board[numInput - 1].equals(String.valueOf(numInput))) { //check error controls between 1 and 9.
                            board[numInput - 1] = nextTurn;

                            if (nextTurn.equals("X")) {
                                nextTurn = "O";
                            } else {
                                nextTurn = "X";
                            }

                            //do gameBoardUpdated
                            System.out.println("+---+---+---+");
                            System.out.print("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.print("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.print("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.println();

                        } else {
                            System.out.println("Position already take it.");
                        }
                        if (board[computerInput - 1].equals(String.valueOf(computerInput))) {
                            board[computerInput - 1] = nextTurn;

                            if (nextTurn.equals("O")) {
                                nextTurn = "X";
                            } else {
                                nextTurn = "O";
                            }

                            System.out.println("+---+---+---+");
                            System.out.print("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.print("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.print("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
                            System.out.println("\n+---+---+---+");
                            System.out.println();
                        }

                        //do when the game is won
                        for (int i = 0; i < 8; i++) {
                            String line = null;
                            switch (i) {
                            /*
                            0 1 2
                            3 4 5
                            6 7 8
                            Look for all chances to win
                             */
                                case 0:
                                    line = board[0] + board[1] + board[2];
                                    break;
                                case 1:
                                    line = board[3] + board[4] + board[5];
                                    break;
                                case 2:
                                    line = board[6] + board[7] + board[8];
                                    break;
                                case 3:
                                    line = board[0] + board[4] + board[8];
                                    break;
                                case 4:
                                    line = board[2] + board[4] + board[6];
                                    break;
                                case 5:
                                    line = board[0] + board[3] + board[6];
                                    break;
                                case 6:
                                    line = board[1] + board[4] + board[7];
                                    break;
                                case 7:
                                    line = board[2] + board[5] + board[8];
                                    break;
                            }
                            if (line.equals("XXX")) {
                                System.out.println(namePlayer1 + " win!");
                                winner = true;

                            } else if (line.equals("OOO")) {
                                System.out.println("Computer win!");
                                winner = true;
                            }
                        }
                        //need draw !(look on internet) https://www.educative.io/edpresso/what-is-the-arraylistcontains-method-in-java  /  https://www.geeksforgeeks.org/arrays-aslist-method-in-java-with-examples/

                        for (int i = 0; i < 9; i++) {
                            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                                break;
                            } else if (i == 8) {
                                System.out.println("Draw!");
                                winner = true;
                            }
                        }
                    }

                    break;
                case 3:
                    System.out.println("See you!");
                    exitMenu = true;
                    break;
                default:
                    System.out.println("Wrong number.");
            }
        } while (!exitMenu);
    }
}