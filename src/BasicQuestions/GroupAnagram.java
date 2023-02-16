package BasicQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupAnagram {
    public static void main(String[] args) {

        String [] strs ={"eat","tea","tan","ate","nat","bat"};

            List<List<String>> res = new ArrayList<>();
            int n = strs.length;
        int []mark =new int[n];
        for (int i = 0; i < n; i++) {
                List<String> list = new ArrayList<>();
                for (int j = i + 1; j < n; j++) {
                    //{"eat","tea","tan","ate","nat","bat"};
                    if (!strs[i].equals("A")&& !strs[j].equals("A")){
                        if (isAnagram(strs[i], strs[j])) {
                            list.add(strs[j]);
                            strs[j] ="A";
                        }
                    }

                }
                if (strs[i].equals("A")) continue;
                else  list.add(strs[i]);
                res.add(list);
            }
        System.out.println(res);

    }
        public static boolean isAnagram (String str1, String str2){
            if (str1.length() != str2.length()) return false;
            int[] store = new int[26];
            for (int i = 0; i < str1.length(); i++) {
                store[str1.charAt(i) - 'a']++;
                store[str2.charAt(i) - 'a']--;
            }
            for (int a : store) if (a != 0) return false;
            return true;

        }
    }