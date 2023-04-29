package lab5;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task5 {
    static int[] array = {1, 4, 3, 2};
    public static int maxValue = 0;

    static class MyThread extends Thread {
        public MyThread(String s) {
            super(s);
        }

        @Override
        public synchronized void run() {
            OptionalInt max = Arrays.stream(array).max();
            maxValue = max.getAsInt();
            System.out.println(maxValue);
            this.interrupt();
        }
    }

    public static void main(String[] args) {
        final MyThread thread1 = new MyThread("thread1");
        final MyThread thread2 = new MyThread("thread2");
        final MyThread thread3 = new MyThread("thread3");
        final MyThread thread4 = new MyThread("thread4");
        final MyThread thread5 = new MyThread("thread5");
        final MyThread thread6 = new MyThread("thread6");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        if (maxValue != 0) {
            System.out.println(maxValue);
            thread1.interrupt();
            thread2.interrupt();
            thread3.interrupt();
            thread4.interrupt();
            thread5.interrupt();
            thread6.interrupt();
        }
    }
}
//public class Task5 {
//    static int[] array = {1, 4, 3, 2};
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread(() -> {
//            OptionalInt max = Arrays.stream(array).max();
//            System.out.println(max.getAsInt());
//        });
//        Thread t2 = new Thread(() -> {
//            OptionalInt max = Arrays.stream(array).max();
//            System.out.println(max.getAsInt());
//        });
//        Thread t3 = new Thread(() -> {
//            OptionalInt max = Arrays.stream(array).max();
//            System.out.println(max.getAsInt());
//        });
//        Thread t4 = new Thread(() -> {
//            OptionalInt max = Arrays.stream(array).max();
//            System.out.println(max.getAsInt());
//        });
//        Thread t5 = new Thread(() -> {
//            OptionalInt max = Arrays.stream(array).max();
//            System.out.println(max.getAsInt());
//        });
//        Thread t6 = new Thread(() -> {
//            OptionalInt max = Arrays.stream(array).max();
//            System.out.println(max.getAsInt());
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//    }
//}