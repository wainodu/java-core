package lab6;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Task5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        return strings.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("word a", "word b", "word c", "word d");
        List<String> filteredStrings = filterStrings(strings, "a");
        System.out.println(filteredStrings);
    }
}
