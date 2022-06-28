import java.util.HashMap;
import java.util.Map;

public class LexicalAnalyser {

    public int letterCount(String s){
        int sum =0;
        for(Character c : s.toCharArray()){
            if (Character.isLetter(c)){
                sum++;
            }
        }
        return sum;
    }

    public int wordCount(String s){
        return s.trim().split("\\s").length;
    }
    public Map<Character,Integer> letterFrequency(String s){
        Map<Character,Integer> letterMap = new HashMap<>();

        for (Character c: s.toLowerCase().toCharArray()){
            if (Character.isLetter(c)){
                if (letterMap.containsKey(c)){
                    letterMap.put(c,letterMap.get(c)+1);
                }
                else {
                    letterMap.put(c,1);
                }
            }
        }
        return letterMap;



    }
}
