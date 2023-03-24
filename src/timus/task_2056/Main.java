package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int exam_number = in.nextInt();
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        double check;
        for (int i = 0; i < exam_number; i++) {
            int exam_score = in.nextInt();
            if (exam_score == 3) {
                counter3++;
            } else if (exam_score == 4) {
                counter4++;

            } else {
                counter5++;
            }
        }
        check = (counter3 + counter4 + counter5) / exam_number;
        if (counter3 > 0) {
            System.out.println("None");
        } else if (counter5 == exam_number) {
            System.out.println("Named");

        } else if (check >= 4.5 && counter5 < exam_number) {
            System.out.println("High");

        } else {
            System.out.println("Common");
        }

    }
}
