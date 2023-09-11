public class HW2_Output1 {
    public static void main(String[] args) {
        System.out.println("Num     Square");
        System.out.println("***     ******");
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d     %3d\n", i, i * i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " * " + i + " =  " + i * i);
        }
    }
}