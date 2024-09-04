import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author prabha
 */
public class EveneNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);


        List<Integer> evenNumber =  numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());

           System.out.println("Even Numbers List: " + evenNumber);

        Integer[] ff = numbers.stream().filter(n -> n % 2 == 0).toArray(Integer[]::new);

         for (Integer i : ff) {
             System.out.println("Even Numbers Array: " + i);
        }


        Stream<Integer> randomNumbers = Stream
                .generate(() -> (new Random()).nextInt(400));

        System.out.println("bound tp 100: " + randomNumbers);

        randomNumbers.limit(2).forEach(System.out::println);

        System.out.println("EBound to 20: " + randomNumbers);

        Stream<String> stream = Stream.of("A$B$C".split("\\$"));
        stream.forEach(p -> System.out.println(p));


        List<String> member = Arrays.asList("Ami","Abi","Pra","Balu");

        List<String>  gg =   member.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());

        gg.stream().forEach(g -> System.out.println(g));

       member.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

       member.stream().filter(s -> s.startsWith("P")).map(String::toUpperCase).forEach(System.out::println);

        member.stream().sorted().forEach(System.out::println);

        member.stream().anyMatch(s ->s.startsWith("P"));


    }



}
