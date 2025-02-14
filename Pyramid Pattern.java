public class PyramidPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ".repeat(5 - i) + "*".repeat(2 * i - 1));
        }
    }
}
