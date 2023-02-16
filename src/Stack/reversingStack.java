package Stack;

import java.util.Stack;
public class reversingStack {
     static Stack<Integer> st=new Stack<>();


     static void insertAtBottom(int x){
         if(st.isEmpty())
             st.push(x);
         else {

         }
     }
     static void reverse(){
         if (st.size()>0) {
             int x = st.peek();
             st.pop();
             insertAtBottom( x);
         }
     }
    public static void main(String[] args) {
        st.push(8);
        st.push(6);
        st.push(56);
        System.out.println(st);
        reverse();
    }
}
