import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author prabha
 */
public class FindNumberStartWith {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10,21,18,19,30);

        List<String> numberStartsWith = number.stream().map(s -> s + "").collect(Collectors.toList());

        number.stream().map(s -> s + "")
                .filter( n -> n.startsWith("1")).forEach(System.out::println);

    }
}
