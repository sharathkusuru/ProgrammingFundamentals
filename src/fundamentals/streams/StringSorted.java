package fundamentals.streams;

import java.util.Arrays;

public class StringSorted {
    public static void main(String[] args) {
        String [] names = {"sharath","sudhakar","varun","raghu"};
      Arrays.stream(names).filter(n->n.length()>5).sorted().forEach(System.out::println);

    }
}
