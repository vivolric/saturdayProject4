import java.util.Arrays;

public class PalindromeNumber {

      /*
        Given a method name is returnNum
        Parameter is one int
        Return type is int

        Reverse the parameter int and return it

        Example:
        int  = 1234

        return should be 4321
     */


    public static int returnNum(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        // System.out.println(reversed);
        return reversed;
    }


    /*
        Given palindromeNum method
        Parameter is one int (num1)
        Return type is one int

        Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"

       Add num1 and reverse of num1, find the result.
       Check if the result is a palindrome or not.
       If the result is not a palindrome number, find the reverse of the result.
       And add the result and reverse of the result, find the new total.
       Check if the new total is a palindrome or not.
       Do the same steps until you reach a palindrome number in your result.
       After you reached the palindrome number, find the count that how many times you did the same operation to reach a palindrome number.
       Return the count

        Example:
            num1 = 349  --> 349  + 943 =1292     Note : since 1292 is not palindrome do the same step for this  // first operation
                            1292 + 2921 = 4213   Note : 4213 is not palindrome  do the same step for this // second operation
                            4213 + 3124 = 7337   Note : 7337 is palindrome // third operation  you reached the palindrome so count is 3

        return should be 3
        HINT: You better use while loop for this question

     */


    public static int palindromeNum(int num) {
        int counter = 0;
        while (num > 0) {
            if (num != returnNum(num)) {
                num += returnNum(num);
                counter++;
            } else if (num == returnNum(num)) {
                break;
            }

        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args) {
        // returnNum(1234);
        palindromeNum(1234);

    }
}