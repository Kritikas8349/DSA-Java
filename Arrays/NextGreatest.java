import java.util.Arrays;

public class NextGreatest {
    public static void main(String[] args) {
        int[] arr = {12,8,41,60,2,49,16,28,21};
         int n = arr.length;
         int[] ans = new int[n];
         ans[n-1] = -1;
         int nge = arr[n-1];
         for(int i=n-2; i>=0;i--){
            ans[i]= nge;
            nge = Math.max(nge,arr[i]);
         }

         System.out.print(Arrays.toString(arr));
         System.out.println();
         System.out.print(Arrays.toString(ans));
    }
}
