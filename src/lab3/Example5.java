package lab3;

public class Example5 {
    public class Recursion {
        public static int fact(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                System.out.println((n - 2) + " " + (n - 1));
                return fact(n - 2) + fact(n - 1);
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(Recursion.fact(5));
    }
}
