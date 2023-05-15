package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static List<String> filterLongStrings(List<String> strings, int length) {
        return strings.stream()
                .filter(s -> s.length() > length)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("word", "word1", "word12", "word123");
        List<String> longStrings = filterLongStrings(strings, 5);
        System.out.println(longStrings);

    }
}
