package lab5;

import java.util.stream.IntStream;

public class Task6 {
    static int[] array = {1, 4, 3, 2};

    static class MyThread extends Thread {
        public MyThread(String s) {
            super(s);
        }

        @Override
        public synchronized void run() {
            int sum = IntStream.of(array).sum();
            System.out.println(sum);
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
    }
}