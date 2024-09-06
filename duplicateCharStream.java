package streams;

// find the duplicate characters in list of string

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharStream {

    public static void main(String[] args) {

        String input="prabhavathy Kalamegam";
        List<String> duplicateCharacter = findDuplicateCharacter(input);
        System.out.println("Duplicate character::::"+duplicateCharacter);
    }
    private static List<String> findDuplicateCharacter(String input){

        Map<String, Long> gg = Arrays.stream(input.split("")).collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(ch->ch , Collectors.counting()))
                .entrySet().stream().filter(cha->cha.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
    }

}
