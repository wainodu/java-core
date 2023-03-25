package timus.task_1001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()) {
            long a = in.nextLong();
            list.add(a);
        }
        in.close();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt((double) list.get(i)));
        }
    }
}

