package lab6;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static int[] intersectArrays(int[] array1, int[] array2) {
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        return Arrays.stream(array2)
                .filter(set1::contains)
                .toArray();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] intersectedArray = intersectArrays(array1, array2);
        System.out.println(Arrays.toString(intersectedArray));
    }
}
