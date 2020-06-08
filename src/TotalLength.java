import java.util.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class TotalLength {

    /*

       Parameter is one Set String

       Get the total length of each String in the Set
       return the total

       Example:
       Set String is "repl" "is" "homework"

       result should be 14

       NOTE : IF RESULT IS EQUAL TO 0 THEN CHANGE IT TO -1

     */

    public int getTotalLength(HashSet<String> mySet) {
        int count = 0, count1 = -1;
        ArrayList<String> myArraySet = new ArrayList<>(mySet);
        for (int i = 0; i < myArraySet.size(); i++) {
            count += myArraySet.get(i).length();
            if (count == 0) {
                count = count1;
                break;
            }
        }
        System.out.println(count);
        return count;

    }

}