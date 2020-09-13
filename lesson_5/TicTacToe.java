import java.io.*;

public class TicTacToe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int emptySpaces = 9;
        boolean isWin = false, isLost = false, isEnd = false;
        String[][] field = new String[3][3];

        //initialization the field
        for(int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[i].length; j++) {
                field[i][j] = "_";
            }
        }

        System.out.println("Hello this is TicTacToe game!");

        while(true) {
            System.out.println("     Make your choice!");

            //printing our field
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.printf("%2s", field[i][j]);
                }
                System.out.println();
            }

            int row = 0, column = 0;

            while(true) {

                System.out.print("Enter the row from 1 to 3: ");
                row = Integer.parseInt(reader.readLine());

                System.out.print("Enter the column from 1 to 3: ");
                column = Integer.parseInt(reader.readLine());

                if((row >= 1 && row <= 3) &&
                        (column >= 1 && column <= 3) &&
                        field[row-1][column-1].equals("_")) {

                    field[row-1][column-1] = "X";
                    emptySpaces--;
                    break;
                }
            }

            //checking if you are the winner
            if(field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X") ||
                    field[0][2].equals("X") && field[1][1].equals("X") && field[2][0].equals("X") ||
                    field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X") ||
                    field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X") ||
                    field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X") ||
                    field[0][0].equals("X") && field[1][0].equals("X") && field[2][0].equals("X") ||
                    field[0][1].equals("X") && field[1][1].equals("X") && field[2][1].equals("X") ||
                    field[0][2].equals("X") && field[1][2].equals("X") && field[2][2].equals("X")) {
                isWin = true;
                break;
            } else if(emptySpaces == 0) {
                isEnd = true;
                break;
            }

            //computer turn
            while(true) {
                row = (int) (Math.random() * 3);
                column = (int) (Math.random() * 3);

                if(field[row][column].equals("_")) {

                    field[row][column] = "O";
                    emptySpaces--;
                    break;
                }
            }

            //checking if the computer is the winner
            if(field[0][0].equals("O") && field[1][1].equals("O") && field[2][2].equals("O") ||
                    field[0][2].equals("O") && field[1][1].equals("O") && field[2][0].equals("O") ||
                    field[0][0].equals("O") && field[0][1].equals("O") && field[0][2].equals("O") ||
                    field[1][0].equals("O") && field[1][1].equals("O") && field[1][2].equals("O") ||
                    field[2][0].equals("O") && field[2][1].equals("O") && field[2][2].equals("O") ||
                    field[0][0].equals("O") && field[1][0].equals("O") && field[2][0].equals("O") ||
                    field[0][1].equals("O") && field[1][1].equals("O") && field[2][1].equals("O") ||
                    field[0][2].equals("O") && field[1][2].equals("O") && field[2][2].equals("O")) {
                isLost = true;
                break;
            } else if(emptySpaces == 0) {
                isEnd = true;
                break;
            }
        }

        reader.close();

        //printing our field
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%2s", field[i][j]);
            }
            System.out.println();
        }

        //result of the game
        if(isLost) {
            System.out.println("Damn! You lost! Next try will be better!");
        } else if(isEnd) {
            System.out.println("The game is over! There are no more empty spaces. Let's try again!");
        } else if(isWin) {
            System.out.println("Nice job! You are the winner!");
        }
    }
}
