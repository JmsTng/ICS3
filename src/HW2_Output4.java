public class HW2_Output4 {
    public static void main(String[] args) {
        StringBuilder res = new StringBuilder();
        res.append("Num     Square\n");
        res.append("***     ******\n");
        for (int i = 1; i <= 5; i++) {
            res.append("%d     %3d\n".formatted(i, i * i));
        }
        for (int i = 1; i <= 5; i++) {
            res.append(i + " * " + i + " =  " + i * i + "\n");
        }
        System.out.println(res);
    }
}