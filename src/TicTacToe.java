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
        //int spotInt = random.nextInt(9);

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < grid.length; i++){
            grid[i] = String.valueOf((i+1));
        }

        String player = "X";
        String computer = "O";
        // end game variable
        int end = 2;

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

            for (int i = 0; i < grid.length; i++){
                grid[i] = String.valueOf((i+1));
            }

            while(check == 1) {
                int spotInt = random.nextInt(9);
                grid[spotInt] = computer;

                // Check if answer is filled by player.
                while (grid[spotInt].equalsIgnoreCase(player)) {
                    for (int i = 0; i < grid.length; i++) {
                        if (grid[i].equalsIgnoreCase(player)) {
                            System.out.println("The player has chosen this space already.");
                            spotInt = random.nextInt(9);
                            grid[spotInt] = computer;
                        }
                    }
                }

                System.out.println(grid[0] + " | " + grid[1] + "| " + grid[2] + "\n" +
                        "\n" +
                        "--------------\n" +
                        grid[3] + " | " + grid[4] + "| " + grid[5] + "\n" +
                        "--------------\n" +
                        grid[6] + " | " + grid[7] + "| " + grid[8] + "\n");

                System.out.println("What is your next move? (1-9)");
                String again = new Scanner(System.in).nextLine(); // clear buffer for scanner.

                // Check if answer is filled already
                boolean filled = false;
                do {
                    if (grid[Integer.parseInt(again) - 1].equalsIgnoreCase(computer)) {
                        System.out.println("The computer has chosen this space already.");
                        System.out.println("Please Choose again.");
                        again = new Scanner(System.in).nextLine();
                    } else if (grid[Integer.parseInt(again) - 1].equalsIgnoreCase(player)) {
                        System.out.println("You have chosen this space already.");
                        System.out.println("Please Choose again.");
                        again = new Scanner(System.in).nextLine();
                    } else if (!grid[Integer.parseInt(again) - 1].equalsIgnoreCase(player)) {
                        grid[(Integer.parseInt(again) - 1)] = player;
                        filled = true;
                    }
                } while (filled == false);


                //grid[(Integer.parseInt(again)-1)] = player;

                // Win conditions
                // Horizontal Wins
                for (int i = 0; i < 3; i++) {
                    if (grid[0 + (i*3)].equalsIgnoreCase(player)) {
                        if (grid[1 + (i*3)].equalsIgnoreCase(player)) {
                            if (grid[2 + (i*3)].equalsIgnoreCase(player)) {
                                System.out.println("Congratulations, you Win!!!");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                    break;
                                } else {
                                    check = 0;
                                    break;
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
                                    break;
                                } else {
                                    check = 0;
                                    break;
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
                                    break;
                                } else {
                                    check = 0;
                                    break;
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
                                    break;
                                } else {
                                    check = 0;
                                    break;
                                }
                            }
                        }
                    }
                }


                //Lose Conditions

                // Horizontal loss
                for (int i = 0; i < 3; i++) {
                    if (grid[0 + (i*3)].equalsIgnoreCase(computer)) {
                        if (grid[1 + (i*3)].equalsIgnoreCase(computer)) {
                            if (grid[2 + (i*3)].equalsIgnoreCase(computer)) {
                                System.out.println("The computer has beaten you! You lose.");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                    break;
                                } else {
                                    check = 0;
                                    break;
                                }
                            }
                        }
                    }
                }

                // Vertical loss
                for (int i = 0; i < 3; i++) {
                    if (grid[0 + i].equalsIgnoreCase(computer)) {
                        if (grid[3 + i].equalsIgnoreCase(computer)) {
                            if (grid[6 + i].equalsIgnoreCase(computer)) {
                                System.out.println("The computer has beaten you! You lose.");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                    break;
                                } else {
                                    check = 0;
                                    break;
                                }
                            }
                        }
                    }
                }

                // Diagonal Wins
                for (int i = 0; i < 3; i++) {
                    if (grid[0].equalsIgnoreCase(computer)) {
                        if (grid[4].equalsIgnoreCase(computer)) {
                            if (grid[8].equalsIgnoreCase(computer)) {
                                System.out.println("The computer has beaten you! You lose.");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                    break;
                                } else {
                                    check = 0;
                                    break;
                                }
                            }
                        }
                    }
                }

                for (int i = 0; i < 3; i++) {
                    if (grid[2].equalsIgnoreCase(computer)) {
                        if (grid[4].equalsIgnoreCase(computer)) {
                            if (grid[6].equalsIgnoreCase(computer)) {
                                System.out.println("The computer has beaten you! You lose.");
                                System.out.println("Do you want to play again?");
                                String winner = new Scanner(System.in).nextLine();
                                if (winner.equalsIgnoreCase("n")) {
                                    end = 1;
                                    check = 0;
                                    break;
                                } else {
                                    check = 0;
                                    break;
                                }
                            }
                        }
                    }
                }


                //Tie conditions
                if (end == 2) {
                    int tie = 0;
                    for (int i = 0; i < grid.length; i++) {
                        if (!grid[i].equalsIgnoreCase(String.valueOf(i+1))) {
                            tie++;
                        }
                    }

                    if (tie == grid.length) {
                        System.out.println("The game is a tie!");
                        System.out.println("Do you want to play again?");
                        String winner = new Scanner(System.in).nextLine();
                        if (winner.equalsIgnoreCase("n")) {
                            end = 1;
                            check = 0;
                            break;
                        } else {
                            check = 0;
                            break;
                        }
                    }
                }

            }

        }while (end == 2);

        System.out.println("Thank you for playing!!!");


    }
}
