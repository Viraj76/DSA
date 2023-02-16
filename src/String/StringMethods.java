package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods{
    public static void main(String[] args) {
        String str="Viraj Gupta";

        //CHAR ARRAY
        char []ch=str.toCharArray();
        System.out.println(Arrays.toString(str.toCharArray()));
        for (char c : ch) {
            System.out.print(c+" ");
        }
        System.out.println();

        // SPLIT
        str.split("");
        System.out.println(str);


    }
}
