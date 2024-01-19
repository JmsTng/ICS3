/*
 * TITLE: Homework Set XX - Bejeweled
 * NAME: James Tung
 * DATE: 2024-01-15
 * DESCRIPTION:
 */

public class Bejeweled {
    final int MAIN_MENU_CHOICE = -1;
    final int CHAIN_REQ = 3;
    final int NUM_MOVES = 10;
    final int PIECE_STYLES = 7;
    final int NUM_ROWS = 8;
    final int NUM_COLS = 8;
    final char EMPTY = PIECE_STYLES + 1 + 'A';
    final String SAVE_FOLDER = "saves/";

    char[][] board = new char[NUM_ROWS][NUM_COLS];
    int score = 0;
    int moves = NUM_MOVES;

    public void initBoard() {
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                board[row][col] = (char) (Math.random() * PIECE_STYLES + 'A');
            }
        }
    }

    public boolean adjSlots(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)) == 1;
    }

    public int countLeft(int row, int col) {
        int count = 0;
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == board[row][col]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int countRight(int row, int col) {
        int count = 0;
        for (int i = col + 1; i < NUM_COLS; i++) {
            if (board[row][i] == board[row][col]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int countUp(int row, int col) {
        int count = 0;
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == board[row][col]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public int countDown(int row, int col) {
        int count = 0;
        for (int i = row + 1; i < NUM_ROWS; i++) {
            if (board[i][col] == board[row][col]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public void swap(int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    public void toggleMark(int row, int col) {
        if (Character.isUpperCase(board[row][col])) {
            board[row][col] = Character.toLowerCase(board[row][col]);
        } else {
            board[row][col] = Character.toUpperCase(board[row][col]);
        }
    }

    public void delete(int row, int col) {
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
        int[] empties = new int[28];

        // Delete pieces
        // loop backwards
        for (int row = NUM_ROWS - 1; row >= 0; row--) {
            for (int col = NUM_COLS - 1; col >= 0; col--) {
                if (board[row][col] == EMPTY) {
                    empties[row * NUM_COLS + col] = 1;
                    int count = 0;
                    for (int i = row - 1; i >= 0; i--) {
                        if (board[i][col] == EMPTY) {
                            count++;
                        } else {
                            break;
                        }
                    }
                    for (int i = row; i >= 0; i--) {
                        if (i - count >= 0) {
                            board[i][col] = board[i - count][col];
                        } else {
                            board[i][col] = (char) (Math.random() * PIECE_STYLES + 'A');
                        }
                    }
                }
            }
        }
    }
}
