public class Loop {
    public static void main(String[] args) {

        System.out.println("=== while loop ===");
        int i = 1;
        while (i <= 3) {
            System.out.println("while count: " + i);
            i++;
        }

        System.out.println("=== for loop ===");
        for (int a = 1; a <= 3; a++) {
            System.out.println("for count: " + a);
        }

        System.out.println("=== do-while loop ===");
        int j = 1;
        do {
            System.out.println("do-while count: " + j);
            j++;
        } while (j <= 3);
    }
}
