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
        // end game variable
        int end = 0;
        do {
            // check to end while loop
            int check = 1;

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

                System.out.println(grid[0]+" | "+grid[1]+ "| " +grid[2]+"\n" +
                        "\n" +
                        "--------------\n" +
                        grid[3]+" | "+grid[4]+ "| " +grid[5]+"\n" +
                        "--------------\n" +
                        grid[6]+" | "+grid[7]+ "| " +grid[8]+"\n");

                System.out.println("What is your next move? (1-9)");
                String again = new Scanner(System.in).nextLine(); // clear buffer for scanner.

                // Check if answer is filled already
                for (int i = 0; i < grid.length; i++) {
                    if (grid[i]== computer) {
                        System.out.println("The computer has chosen this space already.");
                        System.out.println("Please Choose again.");
                        again = new Scanner(System.in).nextLine();
                    }
                }

                grid[Integer.parseInt(again)].equalsIgnoreCase(player);

                // Win conditions
                // Horizontal Wins
                for (int i = 0; i < 3; i++){
                    if (grid[0+i].equalsIgnoreCase(player)){
                        if (grid[1+i].equalsIgnoreCase(player)){
                            if (grid[2+i].equalsIgnoreCase(player)){
                                System.out.println("Congratulations, you Win!!!");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")){
                                end = 1;
                                check = 0;
                                }
                                else{
                                check = 0;
                                }
                            }
                        }
                    }
                }

                // Vertical Wins
                for (int i = 0; i < 3; i++) {
                    if (grid[0 + i].equalsIgnoreCase(player)) {
                        if (grid[3 + i].equalsIgnoreCase(player)) {
                            if (grid[6 + i].equalsIgnoreCase(player)) {
                                System.out.println("Congratulations, you Win!!!");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                } else {
                                    check = 0;
                                }
                            }
                        }
                    }
                }

                // Diagonal Wins
                for (int i = 0; i < 3; i++) {
                    if (grid[0].equalsIgnoreCase(player)) {
                        if (grid[4].equalsIgnoreCase(player)) {
                            if (grid[8].equalsIgnoreCase(player)) {
                                System.out.println("Congratulations, you Win!!!");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                } else {
                                    check = 0;
                                }
                            }
                        }
                    }
                }

                for (int i = 0; i < 3; i++) {
                    if (grid[2].equalsIgnoreCase(player)) {
                        if (grid[4].equalsIgnoreCase(player)) {
                            if (grid[6].equalsIgnoreCase(player)) {
                                System.out.println("Congratulations, you Win!!!");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                } else {
                                    check = 0;
                                }
                            }
                        }
                    }
                }


                //Lose Conditions







            }



        }while (end == 1);


    }
}
