package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static List<String> filterAlphabeticStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("worda", "word 1", "word b", "word 2");
        List<String> alphabeticStrings = filterAlphabeticStrings(strings);
        System.out.println(alphabeticStrings);
    }
}
