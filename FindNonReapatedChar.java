import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author prabha
 */
public class FindNonReapatedChar {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";

       //System.out.println(Arrays.stream(input.split("")).distinct().collect(Collectors.toList()));
        input.toLowerCase();

      List<String> linkedSortedInserionOrder =  Arrays.stream(input.toLowerCase().split("")).collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting())).
               entrySet().stream().filter(fc -> fc.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

        List<String> nonDuplicate1 =  Arrays.stream(input.toLowerCase().split("")).collect(Collectors.groupingBy(ch -> ch, HashMap::new, Collectors.counting())).
                entrySet().stream().filter(fc -> fc.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

        //[j, v, t, i, c, l, w, o, m]
        System.out.println(linkedSortedInserionOrder);

        //[c, i, j, l, m, o, t, v, w]
        System.out.println(nonDuplicate1);

        List<Character> seperatedChar = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.toList());

        //[j, a, v, a,  , a, r, t, i, c, l, e, s,  , a, r, e,  , a, w, e, s, o, m, e]
        System.out.println(seperatedChar);

        LinkedHashMap<Character, Long> withCount = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        //{j=1, a=5, v=1,  =3, r=2, t=1, i=1, c=1, l=1, e=4, s=2, w=1, o=1, m=1}
        System.out.println(withCount);

        //Another way
        input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().
                filter(entry -> entry.getValue() > 1L).
                map(entry -> entry.getKey()).
                findFirst().get();

        //j
     System.out.println(linkedSortedInserionOrder.stream().findFirst().get());
    }
}
