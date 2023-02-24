package lab1;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = in.nextInt();
        int curyear = Year.now().getValue();
        System.out.println("Your year of birth: " + (curyear - age));
    }
}
