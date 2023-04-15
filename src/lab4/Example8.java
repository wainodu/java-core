package lab4;

public class Example8 {
    public class Main {
        public static void m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } catch (RuntimeException e) {
            } finally {
                System.out.println("1");
            }
        }
    }

    public static void main(String[] args) {
        Main.m();
    }

}
