import java.util.Arrays;

public class AdditionalTask_06_12 {
        public static void main(String[] args) {
            String string = "hello hello world hello";
            findMostFrequentWord(string);
            System.out.println(findMostFrequentWord(string));
        }
        public static String findMostFrequentWord(String text) {
            String[] str = text.split(" ");
            ArrayList <String> newArray = new ArrayList<>();
            ArrayList <String> newArray2 = new ArrayList<>();
            ArrayList <String> newArray3 = new ArrayList<>();


            for (int i = 0; i < str.length; i++) {
                if (str[0].equalsIgnoreCase(str[i])) {
                    newArray.add(str[i]);
                }
                if (str[1].equalsIgnoreCase(str[i])) {
                    newArray2.add(str[i]);
                }
                if (str[2].equalsIgnoreCase(str[i])) {
                    newArray3.add(str[i]);
                }
            }
            int a = newArray.toArray().length;
            int b = newArray2.toArray().length;
            int c = newArray3.toArray().length;

            int max = a > b ? (a > c ? a : c) : b > c ? b : c;

            if (max == a) {
                for (String i : newArray) {
                    return i;
                }
            } else if (max == b) {
                for (String i : newArray2) {
                    return i;
                }
            } else if (max == c) {
                for (String i : newArray3) {
                    return i;
                }
            }
            return null;
        }
    }