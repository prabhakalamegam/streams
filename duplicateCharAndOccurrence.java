package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class duplicateCharAndOccurrence {

    public static void main(String[] args) {
        //duplicate character and its occurrence
        String input ="prabhavathy kalamegam";
        Map<String, Long> ff = findDuplicateCharacterAndOccurance(input);


    }
    private static Map<String,Long> findDuplicateCharacterAndOccurance(String input){

        LinkedHashMap<String, Long> dd = Arrays.stream(input.split("")).collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()));
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(ch->ch , LinkedHashMap::new, Collectors.counting())).entrySet().
                stream().filter(a->a.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

}
