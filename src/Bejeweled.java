/*
 * TITLE: ICS Culminating Activity - Bejeweled
 * NAME: James Tung
 * DATE: 2024-01-15
 * DESCRIPTION: A simplified implementation of the game Bejeweled.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bejeweled {
    /* Constants */
    final int MAIN_MENU_CHOICE = -1;
    final int CHAIN_REQ = 3;
    final int NUM_MOVES = 10;
    final int PIECE_STYLES = 7;
    final int NUM_ROWS = 8;
    final int NUM_COLS = 8;
    final char EMPTY = '-';
    final String SAVE_FOLDER = "saves\\";

    /* Globals */
    char[][] board;
    int score, moves;

    public static void main(String[] args) {
        Bejeweled game = new Bejeweled();
        game.start();
    }

    /* Helper Methods */
    public static int requestInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        String input;

        do {  // Loop until valid input is received
            System.out.print(prompt);
            input = sc.next().strip();
            if (input.equals("-1")) {
                return -1;
            }
        } while (!input.matches("\\d+") || Integer.parseInt(input) < min || Integer.parseInt(input) > max);  // Check if input is an integer within range

        return Integer.parseInt(input);
    }

    /* Game Methods */
    public void initBoard() {
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                // Generate random piece
                board[row][col] = (char) (Math.random() * PIECE_STYLES + 'a');
            }
        }
    }

    public boolean adjSlots(int x1, int y1, int x2, int y2) {
        // Distance formula to check for adjacency
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) == 1;
    }

    public int[] count(int row, int col) {
        int[] counts = new int[6];  // left, right, up, down, horizontal, vertical

        // Count left/right
        for (int i = 0; i < NUM_COLS; i++) {
            if (i != col && board[row][i] == board[row][col]) {
                counts[i < col ? 0 : 1]++;  // If i < col, counting left; else, counting right
            } else {
                if (i < col) {  // If a break is found on the left, reset count
                    counts[0] = 0;
                } else if (i > col) {  // If a break is found on the right, stop counting
                    break;
                }
            }
        }

        // Count up/down
        for (int i = 0; i < NUM_ROWS; i++) {
            if (i != row && board[i][col] == board[row][col]) {
                counts[i < row ? 2 : 3]++;  // If i < row, counting up; else, counting down
            } else {
                if (i < row) {  // If a break is found above, reset count
                    counts[2] = 0;
                } else if (i > row) {  // If a break is found below, stop counting
                    break;
                }
            }
        }

        counts[4] = counts[0] + counts[1];  // horizontal
        counts[5] = counts[2] + counts[3];  // vertical

        return counts;
    }

    public void swap(int x1, int y1, int x2, int y2) {
        // Swap pieces
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    public void toggleMark(int row, int col) {
        if (Character.isUpperCase(board[row][col])) {  // If marked, unmark
            board[row][col] = Character.toLowerCase(board[row][col]);
        } else {  // If unmarked, mark
            board[row][col] = Character.toUpperCase(board[row][col]);
        }
    }

    public void delete(int row, int col) {
        // Set piece to empty
        board[row][col] = EMPTY;
    }

    public void deleteLeft(int row, int col, int count) {
        for (int i = col - 1; i >= col - count; i--) {
            board[row][i] = EMPTY;
        }
    }

    public void deleteRight(int row, int col, int count) {
        for (int i = col + 1; i <= col + count; i++) {
            board[row][i] = EMPTY;
        }
    }

    public void deleteUp(int row, int col, int count) {
        for (int i = row - 1; i >= row - count; i--) {
            board[i][col] = EMPTY;
        }
    }

    public void deleteDown(int row, int col, int count) {
        for (int i = row + 1; i <= row + count; i++) {
            board[i][col] = EMPTY;
        }
    }

    public void update() {
        int depth;

        // Delete pieces
        for (int col = 0; col < NUM_COLS; col++) {
            for (int row = NUM_ROWS - 1; row >= 0; row--) {
                if (board[row][col] == EMPTY) {
                    depth = count(row, col)[2] + 1;

                    if (row - depth >= 0) {  // If there are pieces to drop
                        board[row][col] = board[row - depth][col];
                        board[row - depth][col] = EMPTY;
                    } else {  // If no more pieces to drop; generate new piece
                        board[row][col] = (char) (Math.random() * PIECE_STYLES + 'a');
                    }
                }
            }
        }
    }

    public boolean save(String filename) {
        Scanner sc = new Scanner(System.in);
        String path = SAVE_FOLDER + filename;
        File file = new File(path);
        BufferedWriter writer;

        if (file.exists()) {
            System.out.print("File already exists. Are you sure you want to overwrite it? (y/n)\n > ");
            if (sc.next().strip().equalsIgnoreCase("n")) return false;
        }

        try {
            file.getParentFile().mkdirs();
            file.setWritable(true);
            file.createNewFile();
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(displayBoard(true));
            writer.close();

            return true;
        } catch(IOException e){
            System.out.println("Error saving file.");
            return false;
        }
    }

        public boolean load(String filename) {
        // Variables
        String path = SAVE_FOLDER + filename;  // Path to file
        File file = new File(path);
        Scanner sc;

        if (file.exists()) {
            try {
                sc = new Scanner(file);
                score = sc.nextInt();
                moves = sc.nextInt();

                for (int row = 0; row < NUM_ROWS; row++) {
                    for (int col = 0; col < NUM_COLS; col++) {
                        // Get piece from save file
                        board[row][col] = sc.next().charAt(0);
                    }
                }
                sc.close();

                return true;
            } catch (Exception e) {
                System.out.println("Error loading file.");
                return false;
            }
        } else {
            System.out.println("File does not exist.");
            return false;
        }
    }

    public String displayBoard(boolean save) {
        // Output string
        String output = "";

        if (save) {
            // If output is for saving, include score and moves
            output += score + "\n";
            output += moves + "\n";
        } else {
            // If output is for displaying, include column numbers
            output += BColours.BOLD + "  0 1 2 3 4 5 6 7\n" + BColours.RESET;
        }

        for (int row = 0; row < NUM_ROWS; row++) {
            if (!save) {
                // If output is for displaying, include row numbers
                output += BColours.BOLD + row + BColours.RESET;
            }

            for (int col = 0; col < NUM_COLS; col++) {
                output += " " + board[row][col];
            }
            output += "\n";
        }

        return output;
    }

    public boolean play() {
        int x1, y1, x2, y2;
        int[] c1, c2;
        int addScore;

        while (moves > 0) {
            addScore = 0;

            // Game Status
            System.out.println("Total Score: " + score);
            System.out.println("Remaining Moves: " + moves);
            System.out.println(displayBoard(false));

            // Get user input (1/2)
            System.out.println("Enter -1 at any time to return to the main menu.");
            if ((x1 = requestInt("Enter coordinate X1: ", 0, NUM_ROWS - 1)) == MAIN_MENU_CHOICE) return false;
            if ((y1 = requestInt("Enter coordinate Y1: ", 0, NUM_COLS - 1)) == MAIN_MENU_CHOICE) return false;

            // Display board with marked piece
            toggleMark(x1, y1);
            System.out.println(displayBoard(false));
            toggleMark(x1, y1);  // Unmark for future equality checks

            // Get user input (2/2)
            if ((x2 = requestInt("Enter coordinate X2: ", 0, NUM_ROWS - 1)) == MAIN_MENU_CHOICE) return false;
            if ((y2 = requestInt("Enter coordinate Y2: ", 0, NUM_COLS - 1)) == MAIN_MENU_CHOICE) return false;

            if (!adjSlots(x1, y1, x2, y2)) {  // Check if coordinates are adjacent
                System.out.println("Coordinates are not adjacent.");
            } else {
                // Swap pieces
                swap(x1, y1, x2, y2);
                moves--;

                // Check for chains
                c1 = count(x1, y1);
                c2 = count(x2, y2);

                if (c1[4] + 1 >= CHAIN_REQ || c1[5] + 1 >= CHAIN_REQ || c2[4] + 1 >= CHAIN_REQ || c2[5] + 1 >= CHAIN_REQ) {
                    // Delete pieces
                    if (c1[4] + 1 >= CHAIN_REQ) {
                        deleteLeft(x1, y1, c1[0]);
                        deleteRight(x1, y1, c1[1]);
                        addScore += c1[4];
                    }
                    if (c1[5] + 1 >= CHAIN_REQ) {
                        deleteUp(x1, y1, c1[2]);
                        deleteDown(x1, y1, c1[3]);
                        addScore += c1[5];
                    }
                    if (c2[4] + 1 >= CHAIN_REQ) {
                        deleteLeft(x2, y2, c2[0]);
                        deleteRight(x2, y2, c2[1]);
                        addScore += c2[4];
                    }
                    if (c2[5] + 1 >= CHAIN_REQ) {
                        deleteUp(x2, y2, c2[2]);
                        deleteDown(x2, y2, c2[3]);
                        addScore += c2[5];
                    }
                    delete(x1, y1);
                    delete(x2, y2);

                    // Update score
                    if (board[x1][y1] == board[x2][y2]) score += addScore / 2 + 1;
                    else                                score += addScore + 1;

                    // Update board
                    update();
                } else {
                    System.out.println("No chains formed. (Minimum size: " + CHAIN_REQ + ")");
                    swap(x1, y1, x2, y2);
                    moves++;
                }
            }
        }

        // Game over
        System.out.println("No more moves remaining.");
        System.out.println("Final Score: " + score);
        System.out.println(displayBoard(false));
        System.out.println("Returning to main menu...\n");

        return true;
    }

    public void start() {
        // Variables
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean inGame = false;

        // Initialize globals
        score = 0;
        moves = NUM_MOVES;
        board = new char[NUM_ROWS][NUM_COLS];

        do {
            if (inGame) {
                // Display in-game menu options
                System.out.println("1. Continue");
                System.out.println("2. Save Game");
                System.out.println("3. Load Game");
                System.out.println("4. Exit Game");
                choice = requestInt("Enter choice: ", 1, 4);
            } else {
                // Display main menu options
                System.out.println("1. New Game");
                System.out.println("2. Load Game");
                System.out.println("3. Exit");
                choice = requestInt("Enter choice: ", 1, 3);
            }

            switch (choice) {
                case 1:
                    if (!inGame) {  // If the user enters 1 and is not in game, create a new board
                        initBoard();
                    }

                    // Play game
                    inGame = !play();
                    break;
                case 2:
                    System.out.print("File: ");
                    if (inGame) {  // If the user enters 2 and is in game, save the game
                        save(sc.next());
                    } else {  // If the user enters 2 and is not in game, load a game
                        load(sc.next());
                        inGame = !play();
                    }
                    break;
                case 3:
                    if (inGame) {  // If the user enters 3 and is in game, load a game
                        System.out.print("File: ");
                        load(sc.next());
                    } else {  // If the user enters 3 and is not in game, exit the program
                        System.out.println("Exiting game...");
                        choice = -1;
                    }
                    break;
                case 4:  // Only available when in game
                    // Exit the program
                    System.out.println("Thank you for playing!");
                    choice = -1;
                    break;
            }
        } while (choice != -1);
    }
}

class BColours {
    public static final String RESET = "\0x1B[0m";

    public static final String BOLD = "\0x1B[1m";
    public static final String ITALIC = "\0x1B[3m";
    public static final String UNDERLINE = "\0x1B[4m";

    public static final String BLACK = "\0x1B[30m";
    public static final String ERROR = "\0x1B[31m";
    public static final String OK = "\0x1B[32m";
    public static final String WARN = "\0x1B[33m";
    public static final String WHISPER = "\0x1B[38m";
}
