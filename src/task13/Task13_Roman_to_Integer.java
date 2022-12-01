package task13;

public class Task13_Roman_to_Integer {
    public static void main(String[] args) {
        if(3 != romanToInt("III")){
            throw new RuntimeException("don't work");
        };
    }


    public static int romanToInt(String s) {
        int res = 0, num = 0, prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (num < prev)
                res -= num;
            else
                res += num;
            prev = num;
        }
        return res;
    }
}
