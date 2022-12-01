package fundamentals.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String > names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        List<String> names1 = Arrays.asList("Reflection","Collection","Stream");
        List<String> result1 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result1);

        List<Integer> number2 = Arrays.asList(2,3,4,5,3);
        Set square2 = number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(square2);

        List<Integer> n = Arrays.asList(2,3,4,5);
        n.stream().map(x->x*x).forEach(y->System.out.println(y));

        List n2 = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
    }

}

