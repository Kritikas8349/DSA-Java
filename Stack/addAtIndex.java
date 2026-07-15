
import java.util.Stack;

public class addAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st);

        Stack<Integer> temp = new Stack<>();

        while(st.size()>1){
            int ele = st.pop();
            temp.push(ele);
        }

        int newElement = 15;
        st.push(newElement);

        while(!temp.isEmpty()){
            int ele = temp.pop();
            st.push(ele);
        }

        System.out.println(st);
    }
}
