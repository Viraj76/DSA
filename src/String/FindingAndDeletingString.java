package String;

import java.util.ArrayList;
import java.util.List;

public class FindingAndDeletingString {
    public static void main(String[] args) {
        String s = "cars";

        List<String> wordDict = new ArrayList<>();
        wordDict.add("car");
        wordDict.add("ca");   //"car","ca","rs"
        wordDict.add("rs");
        for (int i=0; i<wordDict.size(); i++) {
            if (s.contains(wordDict.get(i))) {
                s = s.replace(wordDict.get(i), "");
            }
        }
        System.out.println(s);
//        if(s.isEmpty()) System.out.println(true);;
//        else System.out.println(false);;
    }
}
