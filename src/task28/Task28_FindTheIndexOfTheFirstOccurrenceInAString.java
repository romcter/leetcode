package task28;

public class Task28_FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }

    public static int strStr(String haystack, String needle) {
        char[] arrayCharacterHaystack = haystack.toCharArray();
        char[] arrayCharacterNeedle = needle.toCharArray();

        if(arrayCharacterNeedle.length > arrayCharacterHaystack.length)
            return -1;

        for (int i = 0; i < arrayCharacterHaystack.length; i++) {
            if(arrayCharacterHaystack[i] == arrayCharacterNeedle[0]){
                int indexInNeedleArray = 0;
                while (arrayCharacterNeedle.length > indexInNeedleArray){
                    if (i + indexInNeedleArray < arrayCharacterHaystack.length && arrayCharacterHaystack[i + indexInNeedleArray] == arrayCharacterNeedle[indexInNeedleArray])
                        indexInNeedleArray++;
                    else break;
                }
                if (arrayCharacterNeedle.length == indexInNeedleArray)
                    return i;
            }
        }
        return -1;
    }
}
