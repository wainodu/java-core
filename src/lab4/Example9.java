package lab4;

public class Example9 {
    public class Main {
        public static int m() {
            try {
                System.out.println("0");
                return 55;
            } finally {
                System.out.println("1");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.m());
    }

}
