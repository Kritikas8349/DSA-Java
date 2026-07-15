
import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        int[] nse = new int[arr.length];
        int[] pse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nse[i] = arr.length;
            pse[i] = -1;
        }

        Stack<Integer> st = new Stack<>();

        //next smallest element
        for(int i=0; i<arr.length; i++){
            while (true) { 
             if(st.isEmpty()){
                st.push(i);
                break;
             }   
             int idx = st.peek();
             if(arr[i]<arr[idx]){
                nse[idx] = i;
                st.pop();
             }
             else{
                st.push(i);
                break;
             }
            }
        }

        st.clear();

        //previous smallest element
        for(int i=arr.length-1; i>=0; i--){
            while (true) { 
             if(st.isEmpty()){
                st.push(i);
                break;
             }   
             int idx = st.peek();
             if(arr[i]<arr[idx]){
                pse[idx] = i;
                st.pop();
             }
             else{
                st.push(i);
                break;
             }
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]*(nse[i]-pse[i]-1));
        }

    System.out.println(max);

    }
}



// public class Y_Maximum_Area_Histogram {

//     public static void main(String[] args) {

//         int[] arr = {6, 2, 5, 4, 5, 1, 6};
//         int[] right = new int[arr.length];
//         int[] left = new int[arr.length];
//         int max = 0;
//         int width;
//         int area;

//         Stack<Integer> stR = new Stack<>();
//         Stack<Integer> stL = new Stack<>();

//         for(int i = arr.length -1 ; i >=0 ; i--){

//             if(stR.isEmpty()){
//                 right[i] = arr.length;
//             }
//             else if(arr[i] > arr[stR.peek()]){
//                 right[i] = stR.peek();
//             }
//             else if(arr[i] <= arr[stR.peek()]){
//                 while (!stR.isEmpty() &&  arr[i] <= arr[stR.peek()]){
//                     stR.pop();
//                 }
//                 if(stR.isEmpty()){
//                     right[i] = arr.length;
//                 }
//                 else {
//                     right[i] = stR.peek();
//                 }
//             }
//             stR.push(i);
//         }
//         for(int i = 0 ; i<arr.length;i++){
            
//             if(stL.isEmpty()){
//                 left[i] = -1;
//             }
//             else if (arr[i] > arr[stL.peek()]) {
//                 left[i] = stL.peek();
//             }
//             else if (arr[i] <= arr[stL.peek()]) {

//                 while(!stL.isEmpty() && arr[i] <= arr[stL.peek()]){
//                     stL.pop();
//                 }
//                 if(stL.isEmpty()){
//                     left[i] = -1;
//                 }
//                 else {
//                     left[i] = stL.peek();
//                 }
//             }

//             stL.push(i);

//         }
//         for(int ele : right){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         for(int ele : left){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         for(int i = 0 ; i <arr.length ; i++){

//             width = right[i] - left[i] -1;
//             area = width*arr[i];
//             max = Math.max(max,area);
//         }
//         System.out.println(max);

//     }

// }
