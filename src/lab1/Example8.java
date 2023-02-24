package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input day of the week: ");
        String day = in.nextLine();
        System.out.println("Input date: ");
        int date = in.nextInt();
        System.out.println("Input month: ");
        in.nextLine();
        String month = in.nextLine();
        System.out.println("Day of the week: " + day + "\n" + "Date:" + " " + date + "\n" + "Month:" + " " + month);
        in.close();
    }
}