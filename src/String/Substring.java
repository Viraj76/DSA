package String;

public class Substring {
    public static void main(String[] args) {
        String str = "abcde";
        StringBuilder newStr = new StringBuilder();
        int startFrom = 0, endBefore = 2;// test startFrom and endBefore indices
        for (int i = startFrom; i <= endBefore; i++)
            newStr.append(String.valueOf(str.charAt(i)));
        System.out.println(newStr);
    }
}
