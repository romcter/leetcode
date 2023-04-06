package task66;

import java.util.Arrays;

public class Task66_PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static  int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0 ; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;


//        int last = digits[digits.length - 1] + 1;
//        int counter = 1;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (last > 9) {
////                if (digits.length == 1)
////                    digits = new int[i + 1];
//
//                last = digits[digits.length - i - 1] + 1;
//                if(last > 9) {
//                    digits = new int[i + 1];
//                    counter++;
//                    digits[digits.length - i] = 0;
//                    continue;
//                }
//                digits[digits.length - i - 1] = digits[digits.length - i - 1] + 1;
//                digits[digits.length - i] = 0;
//            } else
//                digits[digits.length - i] = last;
//        }
//        return digits;
    }

//    for (int i = digits.length - 1; i >= 0 ; i--) {
//        if(digits[i] < 9){
//            digits[i]++;
//            return digits;
//        }
//        digits[i] = 0;
//    }
//    digits = new int[digits.length + 1];
//    digits[0] = 1;
//        return digits;
}
