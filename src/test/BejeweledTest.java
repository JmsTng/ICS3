import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class BejeweledTest {
    public static void main(String[] args) {
        testPlay();
    }

    public static void printBoard(Bejeweled game) {
        for (int row = 0; row < game.NUM_ROWS; row++) {
            for (int col = 0; col < game.NUM_COLS; col++) {
                System.out.print(game.board[row][col] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testInitBoard() {
        Bejeweled game = new Bejeweled();
        game.initBoard();

        assert game.board.length == game.NUM_ROWS;
        for (int row = 0; row < game.NUM_ROWS; row++) {
            assert game.board[row].length == game.NUM_COLS;
            for (int col = 0; col < game.NUM_COLS; col++) {
                assert game.board[row][col] >= 'a' && game.board[row][col] <= 'h';
            }
        }
    }

    @Test
    public void testAdjSlots() {
        Bejeweled game = new Bejeweled();

        assertTrue(game.adjSlots(0, 0, 0, 1));
        assertFalse(game.adjSlots(0, 1, 0, 1));
        assertTrue(game.adjSlots(0, 2, 0, 1));
        assertFalse(game.adjSlots(0, 0, 1, 1));
        assertFalse(game.adjSlots(1, 0, 1, 0));
    }

    @Test
    public void testCount() {
        Bejeweled game = new Bejeweled();
        game.initBoard();
        game.board = new char[][] {
            {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
            {'B', 'B', 'A', 'B', 'B', 'B', 'B', 'B'},
            {'C', 'C', 'A', 'C', 'C', 'C', 'C', 'C'},
            {'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D'},
            {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
            {'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F'},
            {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
            {'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H'}
        };
        System.out.println("Count:");
        System.out.println(Arrays.toString(game.count(0, 2)));
        System.out.println(Arrays.toString(game.count(1, 4)));
        System.out.println(Arrays.toString(game.count(2, 2)));
        System.out.println(Arrays.toString(game.count(3, 0)));
        System.out.println(Arrays.toString(game.count(4, 0)));
        System.out.println(Arrays.toString(game.count(5, 0)));
        System.out.println(Arrays.toString(game.count(6, 0)));
        System.out.println(Arrays.toString(game.count(7, 0)));
    }

    public static void testDeletes() {
        Bejeweled game = new Bejeweled();
        game.initBoard();
        game.board = new char[][]{
                {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
                {'B', 'B', 'A', 'B', 'B', 'B', 'B', 'B'},
                {'C', 'C', 'A', 'C', 'C', 'C', 'C', 'C'},
                {'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D'},
                {'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E'},
                {'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H'}
        };

        System.out.println("Deletes:");
        game.deleteLeft(0, 3, 3);
        printBoard(game);
        System.out.println();
        game.deleteRight(0, 3, 3);
        printBoard(game);
        System.out.println();
        game.deleteUp(7, 7, 7);
        printBoard(game);
    }

    @Test
    public void testUpdate() {
        Bejeweled game = new Bejeweled();
        game.initBoard();
        game.board = new char[][]{
                {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
                {'B', 'B', 'I', 'B', 'B', 'B', 'B', 'B'},
                {'C', 'C', 'A', 'C', 'C', 'C', 'I', 'I'},
                {'D', 'D', 'D', 'D', 'I', 'I', 'D', 'D'},
                {'E', 'E', 'E', 'E', 'I', 'E', 'E', 'I'},
                {'F', 'F', 'F', 'I', 'F', 'F', 'F', 'I'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'I', 'I', 'H', 'H', 'H', 'H', 'H', 'H'}
        };

        printBoard(game);
        System.out.println();

        // Call the update method
        game.update();
        printBoard(game);

        boolean full = true;

        for (int row = 0; row < game.NUM_ROWS; row++) {
            for (int col = 0; col < game.NUM_COLS; col++) {
                if (game.board[row][col] == game.EMPTY) {
                    full = false;
                    break;
                }
            }
        }

        assertTrue(full);
    }

    @Test
    public void testSave() {
        Bejeweled game = new Bejeweled();
        game.initBoard();
        game.board = new char[][]{
                {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
                {'B', 'B', 'I', 'B', 'B', 'B', 'B', 'B'},
                {'C', 'C', 'A', 'C', 'C', 'C', 'I', 'I'},
                {'D', 'D', 'D', 'D', 'I', 'I', 'D', 'D'},
                {'E', 'E', 'E', 'E', 'I', 'E', 'E', 'I'},
                {'F', 'F', 'F', 'I', 'F', 'F', 'F', 'I'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'I', 'I', 'H', 'H', 'H', 'H', 'H', 'H'}
        };

        assertTrue(game.save("test.txt"));
        assertArrayEquals(new char[][]{
                {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
                {'B', 'B', 'I', 'B', 'B', 'B', 'B', 'B'},
                {'C', 'C', 'A', 'C', 'C', 'C', 'I', 'I'},
                {'D', 'D', 'D', 'D', 'I', 'I', 'D', 'D'},
                {'E', 'E', 'E', 'E', 'I', 'E', 'E', 'I'},
                {'F', 'F', 'F', 'I', 'F', 'F', 'F', 'I'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'I', 'I', 'H', 'H', 'H', 'H', 'H', 'H'}
        }, game.board);
    }

//    @Test
    public static void testPlay() {
        Bejeweled game = new Bejeweled();
        game.initBoard();
        game.board = new char[][]{
                {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
                {'B', 'B', 'I', 'B', 'B', 'B', 'B', 'B'},
                {'C', 'C', 'A', 'C', 'C', 'C', 'I', 'I'},
                {'D', 'D', 'D', 'D', 'I', 'I', 'D', 'D'},
                {'E', 'E', 'E', 'E', 'I', 'E', 'E', 'I'},
                {'F', 'F', 'F', 'I', 'F', 'F', 'F', 'I'},
                {'G', 'G', 'G', 'G', 'G', 'G', 'G', 'G'},
                {'I', 'I', 'H', 'H', 'H', 'H', 'H', 'H'}
        };

        game.play();
    }
}
