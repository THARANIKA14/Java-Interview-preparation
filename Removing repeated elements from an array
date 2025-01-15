import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static <T> T[] removeDuplicates(T[] array) {
        return new LinkedHashSet<>(Arrays.asList(array)).toArray(array.clone());
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 2, 3, 4, 4, 5};
        String[] strArray = {"apple", "banana", "apple", "orange"};
        
        System.out.println(Arrays.toString(removeDuplicates(intArray)));
        System.out.println(Arrays.toString(removeDuplicates(strArray)));
    }
}
