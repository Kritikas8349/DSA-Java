import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args) {

        Stack<Character> st = new Stack<>();

        String str = "{[()]";

        for (char ch : str.toCharArray()) {

            // If opening bracket, push into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // Stack is empty
                if (st.isEmpty()) {
                    System.out.println("Unbalanced");
                    return;
                }

                // Check matching brackets
                if ((ch == ')' && st.peek() != '(') ||
                    (ch == '}' && st.peek() != '{') ||
                    (ch == ']' && st.peek() != '[')) {

                    System.out.println("Unbalanced");
                    return;
                }

                // Matching bracket found
                st.pop();
            }
        }

        // After processing all characters
        if (st.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }
}