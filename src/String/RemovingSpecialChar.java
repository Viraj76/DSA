package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovingSpecialChar {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        String str = "Bob hit a 2ball, the hit BALL @flew #far after it was hit.";
        String []s  = str.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" ");
        System.out.println(Arrays.toString(s));
    }
}
