import java.util.Stack;
public class MaxRectamgleInBinaryMatrix {

    public static int maximalRectangle(char[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] height = new int[cols];
        int maxArea = 0;

        
        for (int i = 0; i < rows; i++) {

            // Update histogram heights
            for (int j = 0; j < cols; j++) {

                if (matrix[i][j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }

            // Find largest rectangle for current histogram
            int area = largestRectangleArea(height);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static int largestRectangleArea(int[] height) {

        int n = height.length;

        int[] nse = new int[n];
        int[] pse = new int[n];

        Stack<Integer> st = new Stack<>();

        // Next Smaller Element 
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && height[st.peek()] >= height[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = nse[i] - pse[i] - 1;
            int area = height[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        char[][] matrix = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        System.out.println(maximalRectangle(matrix));
    }
}

 