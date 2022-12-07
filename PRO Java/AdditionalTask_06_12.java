import java.util.Arrays;

public class AdditionalTask_06_12 {
    public static void main(String[] args) {
        String string = "hello world world";
        findMostFrequentWord(string);
        //System.out.println(findMostFrequentWord(string));
    }
    public static void findMostFrequentWord(String text) {
        String[] str = text.split(" ");
        int count = 0;
        String newStr = null;
        for (int i = 0; i < str.length; i++) {
            for(int j = 0; j < str.length - 1; j++) {
                if (str[i].equalsIgnoreCase(str[j++])) {
                    newStr = str[j];
                    count++;
                    break;
                }
            }
        }
        System.out.printf(newStr + " %d", count);
    }
}