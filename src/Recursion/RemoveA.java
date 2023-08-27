package Recursion;

import java.util.Objects;

// storing the ans within the function
public class RemoveA {
    public static void main(String[] args) {
        String str = removeA("apoieat");
        System.out.println(str);
    }

    private static String removeA(String str) {
        String s = "";

        if(Objects.equals(str, "")){
            System.out.println(s);
            return "";
        }
        char c = str.charAt(0);
        if (c == 'a'){
            return removeA(str.substring(1));
        }
        return c + removeA(str.substring(1));
    }
}
