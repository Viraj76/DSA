package BasicQuestions;

public class Anagram {
    public static void main(String[] args) {
        String st1= "eat";
        String st2= "ate";
        int []store = new int[26];
        for(int i=0; i<st1.length(); i++){
            store[st1.charAt(i)-'a']++;
            store[st2.charAt(i)-'a']--;
        }
        for(int e : store) if(e!=0) System.out.println(false);
        System.out.println(true);
    }
}
