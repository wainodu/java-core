package lab1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.println("Input your year of birth: ");
        int year = in.nextInt();
        int curyear = Year.now().getValue();
        System.out.println("Your name: " + name + "\n" + "Your age: " + (curyear - year));
    }
}
