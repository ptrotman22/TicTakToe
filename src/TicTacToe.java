/*
Create grid with Array
Player chooses X or O
Player 1 - X or O
Player 2 - Computer

 */

import java.util.*;
public class TicTacToe {
    public static void main(String[] args){
        //System.out.println("");
        String[] grid = new String[9];
        // Random
        Random random = new Random();
        int spotInt = random.nextInt(9);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < grid.length; i++){
            grid[i] = String.valueOf((i+1));
        }

        String player = "X";
        String computer = "O";

        do {
            int check = 0;
            System.out.println("Welcome to Tic-Tac-Toe!");
            System.out.println("Do you want to be X or O?");
            String chose = input.nextLine();

            if (chose.equalsIgnoreCase("x")){
                player = String.valueOf('X');
                computer = String.valueOf('O');
                System.out.println("You picked X. The Computer will be O");
            }
            else{
                player = String.valueOf('O');
                computer = String.valueOf('X');
                System.out.println("You picked O. The Computer will be X");
            }

            System.out.println("1 | 2 | 3\n" +
                    "\n" +
                    "--------------\n" +
                    "4  | 5  | 6\n" +
                    "--------------\n" +
                    "7 |  8  | 9");

            System.out.println("The computer will go first.");

            while(check == 1){
                int spotInt = random.nextInt(9);
                grid[spotInt] = computer;

                System.out.println("1 | 2 | 3\n" +
                        "\n" +
                        "--------------\n" +
                        "4  | 5  | 6\n" +
                        "--------------\n" +
                        "7 |  8  | 9");


            }



        }while ();


    }
}
