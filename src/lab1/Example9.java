package lab1;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input month: ");
        String month = in.nextLine();
        System.out.println("Input number of days: ");
        int number_of_days = in.nextInt();
        System.out.println(month + " " + "contains" + " " + number_of_days + " " + "days");
        in.close();
    }
}
