import java.util.ArrayList;

public class MissingNumber {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        int i = 0;

        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            } 
            else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        for(i = 0; i < arr.length; i++){
            if(arr[i] != i + 1){
                ans.add(i + 1);
            }
        }

        System.out.println(ans);
    }
}
