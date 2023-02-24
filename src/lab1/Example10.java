package lab1;

import java.time.Year;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your year of birth: ");
        int year = in.nextInt();
        int curyear = Year.now().getValue();
        int age = curyear - year;
        System.out.println("Your age: " + age);
    }
}
