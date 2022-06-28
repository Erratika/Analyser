import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LexicalAnalyserTest {
    LexicalAnalyser la = new LexicalAnalyser();

    @Test
    void testLetterCount(){
        assertEquals(11,la.letterCount("This is a test."));

    }
    @Test
    void testWordCount(){
        assertEquals(4,la.wordCount("This is a test."));
    }

    @Test
    void testWordCountSpecial(){
        assertEquals(10,la.wordCount("This is a test that # also includes () some special characters!"));
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
    }

}