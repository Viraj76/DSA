package Stack;

import java.util.Stack;

public class AccessingElements {
    public static void main(String[] args) {
        Stack<Integer>  stk = new Stack<>();
        stk.push(1);
        stk.push(5);
        stk.push(3);
        stk.push(8);
        stk.push(2);
        stk.push(2);
        System.out.println(stk.get(stk.size()-2));
        int ans=0;
        for(int i =0; i<stk.size(); i++){
            int nm = stk.get(i);
            ans += nm;

        }
        System.out.println(ans);
    }
}
