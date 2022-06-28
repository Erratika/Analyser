import org.junit.jupiter.api.Test;

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

    void testFrequency(){

    }

}