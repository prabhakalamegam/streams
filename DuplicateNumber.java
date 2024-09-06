import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author prabha
 */
public class DuplicateNumber {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(11,33,11,2,76,98);

        //convert integer to string
        // group By counting

        Map<String, Long> duplicateNum = number.stream().map(s -> s + "").
                collect(Collectors.groupingBy(ch -> ch, HashMap::new, Collectors.counting())).entrySet().stream().
                filter(gc -> gc.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

      // {11=2} - o/p
        System.out.println(duplicateNum);


        List<Long> duplicalist = number.stream().map(s -> s + "").
                collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet()
                .stream().filter(g -> g.getValue() > 1).map(Map.Entry::getValue).collect(Collectors.toList());

        //[2]
        System.out.println(duplicalist);

    }
}
