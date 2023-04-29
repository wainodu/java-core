package lab5;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread number1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 0);
        });
        Thread number2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 1);
        });
        Thread number3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 2);
        });
        Thread number4 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 3);
        });
        Thread number5 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 4);
        });
        Thread number6 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 5);
        });
        Thread number7 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 6);
        });
        Thread number8 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 7);
        });
        Thread number9 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 8);
        });
        Thread number10 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + ": " + 9);
        });
        number1.start();
        number2.start();
        number3.start();
        number4.start();
        number5.start();
        number6.start();
        number7.start();
        number8.start();
        number9.start();
        number10.start();
    }
}

