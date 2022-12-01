package fundamentals.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCount {
    public static void main(String[] args) {
        String [] names = {"sharath","sudhakar","varun","raghu"};
        long val= Arrays.stream(names).filter(n -> n.length() > 5).count();
        System.out.println(val);

    }
}
