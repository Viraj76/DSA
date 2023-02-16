package String;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        /*
        String str = "  Viraj  ";
        System.out.println(str.length());
        System.out.println(str.substring(2,2));
        System.out.println(str.length());

         */

        String []str = {"fl","fao","flow"};
        Arrays.sort(str);
        for(String s: str){
            System.out.println(s);
        }

        String st = "Viraj";
        System.out.println(st.substring(0,3));

    }
}
