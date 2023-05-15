package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static List<String> filterUpperCaseStrings(List<String> strings) {
        return strings.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Word1", "word2", "word3", "Word4");
        List<String> upperCaseStrings = filterUpperCaseStrings(strings);
        System.out.println(upperCaseStrings);
    }
}
