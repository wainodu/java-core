package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static List<Integer> filterDivisibleNumbers(List<Integer> numbers, int divisor) {
        return numbers.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> divisibleNumbers = filterDivisibleNumbers(numbers, 2);
        System.out.println(divisibleNumbers);
    }
}
