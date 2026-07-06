import java.util.Arrays;

public class pivotArray {
    public static void main(String[] args) {
        int[] arr = {9,12,5,10,14,3,10};
        int pivot = 10;

        int n = arr.length;
        int[] ans = new int[n];

        int i = 0;     int left = 0;
        int j = n-1;   int right = n-1;

        while(i<n){
            if(arr[i]<pivot)  {
                ans[left] = arr[i];
                left++;
            }
            if(arr[j]>pivot){
                ans[right] = arr[j];
                right--;
            }
            i++;
            j--;
        }

        while(left<=right){
            ans[left] = pivot;
            left++;
        }
 
        System.out.println(Arrays.toString(ans));
    }
}
