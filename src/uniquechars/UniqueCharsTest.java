package uniquechars;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {
    UniqueChars object = new UniqueChars();

    @Test
    public void uniqueCharacters1() throws Exception {
        ArrayList<String> expected1 = new ArrayList<>();
        expected1.add("n");
        expected1.add("g");
        expected1.add("r");
        expected1.add("m");
        assertEquals(expected1,object.uniqueCharacters("anagram") );
    }
    @Test
    public void uniqueCharacters2() throws Exception {
        ArrayList<String> expected2 = new ArrayList<>();
        expected2.add(" ");

        assertEquals(expected2,object.uniqueCharacters(" ") );
    }
    @Test
    public void uniqueCharacters3() throws Exception {
        ArrayList<String> expected3 = new ArrayList<>();
        assertEquals(expected3,object.uniqueCharacters("aeiuo") );
    }
}