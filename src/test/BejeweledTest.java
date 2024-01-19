public class BejeweledTest {
    public static void main(String[] args) {
//        testBoard();
//        testAdjSlots();
//        testCountLeft();
        testDeletes();
    }

    public static void printBoard(Bejeweled game) {
        for (int row = 0; row < game.NUM_ROWS; row++) {
            for (int col = 0; col < game.NUM_COLS; col++) {
                System.out.print(game.board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void testBoard() {
        Bejeweled game = new Bejeweled();
        game.initBoard();
        System.out.println("Board:");
        printBoard(game);
    }

    public static void testAdjSlots() {
        Bejeweled game = new Bejeweled();
        System.out.println("AdjSlots:");
        System.out.println(game.adjSlots(0, 0, 0, 1));
        System.out.println(game.adjSlots(0, 1, 0, 1));
        System.out.println(game.adjSlots(0, 2, 0, 1));
        System.out.println(game.adjSlots(0, 0, 1, 1));
        System.out.println(game.adjSlots(1, 0, 1, 0));
    }

    public static void testCountLeft() {
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
        System.out.println("CountLeft:");
        System.out.println(game.countLeft(0, 7));
        System.out.println(game.countLeft(1, 7));
        System.out.println(game.countLeft(2, 2));
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
}
