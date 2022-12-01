package task14;

public class Task14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        for (int i = 0; i <= strs.length - 1; i++) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
        }
        return pre;
    }

//    public static String longestCommonPrefix(String[] strs) {
//        StringBuilder sb = new StringBuilder();
//        int cycleOfLoop = 0;
//        if (strs.length == 0)
//            return "";
//
//        for (int i = 0; i <= strs.length - 1; i++) {
//            if (!strs[i].intern().equals("")) {
//                try {
//
//                    char letter = strs[i].charAt(i);
//                    for (int j = 0; j <= strs.length - 1; j++) {
//                        if (strs[j].charAt(i) != letter)
//                            return sb.toString();
//                    }
//                    sb.append(letter);
//
//                } catch (StringIndexOutOfBoundsException sioobe) {
//                    return sb.toString();
//                }
//            } else return "";
//        }
//        return sb.toString();
//    }
}

