public class HW2_Output2 {
    public static void main(String[] args) {
        char v = '|';
        char h = '-';
        char c = '+';

        int cell_height = 4;
        int cell_width = 11;
        String l = Character.toString(h).repeat(cell_width);
        for (int line = 1; line <= cell_height * 3 - 1; line++) {
            if (line == 6) {
                System.out.println(" ".repeat(cell_width) + v + " ".repeat((cell_width-1)/2) + "X" + " ".repeat((cell_width-1)/2) + "|");
            } else if (line % cell_height != 0) {
                System.out.println((" ".repeat(cell_width) + v).repeat(2));
            } else {
                System.out.println(l + c + l + c + l);
            }
        }
    }
}