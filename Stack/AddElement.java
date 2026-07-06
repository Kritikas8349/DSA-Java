import java.util.Stack;

public class AddElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);

        System.out.println(st);

        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty()){
            int ele = st.pop();
            temp.push(ele);
        }

        System.out.println(temp);

        int newElement = 50;
        st.push(newElement);

        while(!temp.isEmpty()){
            int ele = temp.pop();
            st.push(ele);
        }

        System.out.println(st);
    }
}
