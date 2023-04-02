package lab3;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> test = new HashMap<Integer, String>();
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            test.put(i, "string" + i);
        }
        for (int i : test.keySet()) {
            if (i > 5) {
                System.out.println(test.get(i));
            } else if (i == 0) {
                System.out.println(test.values());
            }
        }
        for (int i : test.keySet()) {
            if (test.get(i).length() > 5) {
                counter *= i;
            }
        }
        System.out.println(counter);
    }
}
