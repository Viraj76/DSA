package BasicQuestions;

public class IsStringANumber {
    public static void main(String[] args) {
        String str="b";
        int n=0;
        char c =' ';
        try{
             n = Integer.parseInt(str);
        }
        catch (NumberFormatException nfm){
             c = str.charAt(0);
        }
        System.out.println(n);
        System.out.println(c);
    }
}
