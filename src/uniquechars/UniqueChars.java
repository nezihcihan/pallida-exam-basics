package uniquechars;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        //System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]

        String sample = "anagram";
        System.out.println(uniqueCharacters(sample));
    }
    public static ArrayList<String> uniqueCharacters(String sample) {
        String newString = sample.replaceAll("[aeiouAEIOU]", "");
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : newString.toCharArray()) {
            chars.add(c);
        }
        for (int i = 0; i < chars.size(); i++) {
            list.add(chars.get(i).toString());
        }
        return list;
    }
}
