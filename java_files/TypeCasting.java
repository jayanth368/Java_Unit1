public class TypeCasting {
    public static void main(String[] args) {

        int num = 10;
        double d = num;  // Implicit casting
        System.out.println("Implicit Casting (int to double): " + d);

        double value = 9.78;
        int val = (int) value;  // Explicit casting
        System.out.println("Explicit Casting (double to int): " + val);
    }
}
