import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LexicalAnalyserTest {
    LexicalAnalyser la = new LexicalAnalyser();

    @Test
    void testLetterCount(){
        String testString = "This is a test.";
        assertEquals(11,la.letterCount(testString));
        assertNotEquals(13, la.letterCount(testString));

        testString = "";
        assertEquals(0,la.letterCount(testString));


        testString = "This is a test that # also includes () some special characters!";
        assertEquals(48,la.letterCount(testString));



    }
    @Test
    void testWordCount() {
        String testString = "This is a test.";
        assertEquals(4, la.wordCount(testString));
        assertNotEquals(2, la.wordCount(testString));

        testString = "";
        assertEquals(0, la.letterCount(testString));

        //TODO Fails with special Characters.
        testString = "This is a test that # also includes () some special characters!";
        assertEquals(10, la.wordCount(testString));


    }

    @Test
    void testFrequency(){
        String testString = "This is our test String.";
        Map<Character,Integer> testMap = new HashMap<>();
        testMap.put('t',4);
        testMap.put('h',1);
        testMap.put('i',3);
        testMap.put('s',4);
        testMap.put('o',1);
        testMap.put('u',1);
        testMap.put('r',2);
        testMap.put('e',1);
        testMap.put('n',1);
        testMap.put('g',1);
        assertEquals(testMap, la.letterFrequency(testString));

        Map<Character,Integer> falseTestMap = new HashMap<>();
        falseTestMap.put('g',4);
        falseTestMap.put('h',1);
        falseTestMap.put('e',3);
        falseTestMap.put('k',4);
        falseTestMap.put('o',1);
        falseTestMap.put('r',1);
        assertNotEquals(falseTestMap, la.letterFrequency(testString));

        testString = "Dont Include Special!";
        testMap = new HashMap<>();
        testMap.put('d',2);
        testMap.put('o',1);
        testMap.put('n',2);
        testMap.put('t',1);
        testMap.put('i',2);
        testMap.put('c',2);
        testMap.put('l',2);
        testMap.put('u',1);
        testMap.put('e',2);
        testMap.put('s',1);
        testMap.put('p',1);
        testMap.put('a',1);
        assertEquals(testMap, la.letterFrequency(testString));

        testString = "";
        testMap = new HashMap<>();
        assertEquals(testMap, la.letterFrequency(testString));
    }

}