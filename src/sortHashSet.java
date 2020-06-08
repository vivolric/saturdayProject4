import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class sortHashSet {

    /*
        Given allNumbers Integer Hashset

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */

    public ArrayList<Integer> sort(HashSet<Integer> allNumbers) {

        TreeSet<Integer> sortNumbers = new TreeSet<>(allNumbers);

        ArrayList<Integer> result = new ArrayList<>(sortNumbers);

        return result;
    }

}
