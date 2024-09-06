import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author prabha
 */
public class DuplicateCharAndOccurrenceDetail {

    public static void main(String[] args) {
        //duplicate character and its occurrence
        String input ="Java And Angular";

        Map<String, Long> duplicateAndOcc = findDuplicateCharacterAndOccurance(input);
        System.out.println(duplicateAndOcc);

    }

    private static Map<String, Long> findDuplicateCharacterAndOccurance(String input) {

        //Split the string to char
        List<String> spiltString = Arrays.stream(input.split("")).collect(Collectors.toList());
        System.out.println(spiltString);
        //group by each char with count
        HashMap<String, Long> groupedChar = spiltString.stream().collect(Collectors.groupingBy(ch -> ch, HashMap::new, Collectors.counting()));

        System.out.println(groupedChar);

        return groupedChar.entrySet().stream()
                .filter(gc -> gc.getValue() >1).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

    }


}
