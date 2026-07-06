import java.util.Arrays;

public class sortZerosOnes {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,0,0,1,0};

        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left]==0) left++;
            else if(arr[right]==1) right--;

            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // for(int x : arr){
        //     System.out.print(x+" ");
        // }

        System.out.print(Arrays.toString(arr));





        // int n = arr.length;
        // int noOfZeroes = 0;

        // for(int i=0; i<n; i++){
        //     if(arr[i]==0) {
        //         noOfZeroes++;
        //     }
        // }

        // for(int i=0; i<n; i++){
        //    if(i<noOfZeroes) arr[i]=0;
        //    else arr[i]=1;
        // }

        
    }
}
