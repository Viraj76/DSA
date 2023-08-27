package Recursion;

public class RemoveApple {
    public static void main(String[] args) {
        String s = removeApple("virappleajapple");
        System.out.println(s);
    }

    private static String removeApple(String str) {
        String s = "";
        if(str.equals("")) return s;
        char c = str.charAt(0);
        if(!str.startsWith("apple")){
            return c +removeApple(str.substring(1));
        }
        return removeApple(str.substring(5));
    }
}
