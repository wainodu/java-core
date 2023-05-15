package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static List<Integer> filterLargeNumbers(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> largeNumbers = filterLargeNumbers(numbers, 7);
        System.out.println(largeNumbers);
    }
}
