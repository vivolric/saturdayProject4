import java.util.ArrayList;

public class DigitPowers {
    /*

          Given one method name is power 4
          Parameter is one int()
          Return type is an int

          Get each digit from the parameter int number
          Take the each number to the power 4
          Sum powered numbers
          Return the result

          Example: parameter int is 1234

          1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

          result should be 354

       */

//        public int power4(int num){
//
//         return 0;
//        }

    public static void main(String[] args) {
        int result = power4(1234);
        System.out.println(result);
    }

    public static int power4(int num) {

        String eachDigit = String.valueOf(num);

        int power = 0;
        for (int i = 0; i < eachDigit.length(); i++) {
            int j = Character.digit(eachDigit.charAt(i), 10);

            power += (int) Math.pow(j, 4);

        }

        return power;


    }
}

