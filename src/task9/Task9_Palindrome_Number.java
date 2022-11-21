package task9;

public class Task9_Palindrome_Number {

    static boolean isPalindrome(int x) {
        char[] numberInMassive = String.valueOf(x).trim().toCharArray();
        for (int i = 0; i < numberInMassive.length; i++) {
            if (numberInMassive[i] != numberInMassive[numberInMassive.length - (1 + i)])
                return false;
        }
        return true;
//        Stream<Character> cStream = IntStream.range(0, numberInMassive.length).mapToObj(i -> numberInMassive[i]);
//        return cStream
//                .anyMatch(i -> numberInMassive[i] != numberInMassive[numberInMassive.length - (1 + i)]);

    }
}
