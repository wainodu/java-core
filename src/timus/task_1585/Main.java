package timus.task_1585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int emperor = 0;
        int macaroni = 0;
        int little = 0;
        for (int i = 0; i <= a; i++) {
            String b = in.nextLine();
            if (b.toLowerCase().equals("emperor penguin")){
                emperor++;
            } else if (b.toLowerCase().equals("macaroni penguin")) {
                macaroni++;
            }
            else {
                little++;
            }
        }
        int result = Math.max(Math.max(emperor,macaroni),little);
        System.out.println(result);
    }
}
