import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCount {


    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */

    public LinkedHashMap<Character, Integer> charCount(String myStr) {

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<Character, Integer>();

        char[] MyStrArray = myStr.toCharArray();

        for (char ch : MyStrArray) {
            if (result.containsKey(ch)) {
                result.put(ch, result.get(ch) + 1);
            } else {
                result.put(ch, 1);
            }
        }
        for (Map.Entry entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return result;
    }


}