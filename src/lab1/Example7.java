package lab1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input age: ");
        int age = in.nextInt();
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        in.close();
    }
}
