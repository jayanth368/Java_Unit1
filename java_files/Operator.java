public class Operator {
    public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        boolean x = true, y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));

        int c = 20;
        c += 5;  // Assignment operator
        System.out.println("c after c += 5 -> " + c);
    }
}
