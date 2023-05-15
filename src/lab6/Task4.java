package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static List<Integer> squareList(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = squareList(numbers);
        System.out.println(squares);
    }
}
