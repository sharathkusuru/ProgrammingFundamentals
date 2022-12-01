package fundamentals.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenNumbers {
    public static void main(String[] args) {
         int[] array = {7, 8, 12, 13, 15, 72, 65,10};
       Arrays.stream(array).filter(num ->num %2 == 0).map(i->i*2).forEach(System.out::println);

    }
}
