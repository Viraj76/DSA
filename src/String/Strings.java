package String;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a="Hey";
        String b="Hey";
//        System.out.println(a==b); // will give us true because of the same string pool
        String name1=new String("Viraj");
        String name2=new String("Viraj");
//        System.out.println(name1==name2);  //will give us  false, because not in the string pool but in the heap

        // SO FOR CHECKING THE VALUES USE "equals()"
//        System.out.println(name1.quals(name2));   // will be concern only about the values



        /*here println function is overloaded , because internally it is calling different func
         to print the values , but it is printing ultimately a string value*/
//        System.out.println(56);
//        System.out.println("Viraj");
//        System.out.println(Arrays.toString(new int[]{2, 45, 6, 7}));

        // Applying operators on String and char
//        System.out.println('a'+'b');
//        System.out.println("a"+"b");
//        System.out.println((char)('a'+3));

//        System.out.println("a"+1);  //will call its wrappers class then toString() func will be called
//        System.out.println("a"+'a');
//
//        String ans=new Integer(45)+""+new ArrayList<>();
//        System.out.println(ans);

        String str="viraj";
        String newStr=str.substring(0,3);
        System.out.println(newStr);
    }
}
