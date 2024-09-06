package streams;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharByMap {

    public static void main(String[] args) {

        String input = "prabhavathy Kalamegam";

        findDuplicateCharacters(input);
    }

    private static void findDuplicateCharacters(String input) {

        Map<Character, Integer> charCountMap = new HashMap<>();


        // Count the occurrences of each character
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print characters that appear more than once
        System.out.println("Duplicate characters in the string:");

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
