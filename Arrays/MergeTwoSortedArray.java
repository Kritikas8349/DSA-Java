import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        
        int[] arr = {11,23,45,78};
        int[] brr = {13,26,55,98};
        int[] crr = new int[arr.length+brr.length];

        int i =0;
        int j =0;
        int k =0;

        while(i<arr.length && j<brr.length){
            if(arr[i]<=brr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }

            else{
                crr[k] = brr[j];
                j++;
                k++;
            }
        }

        if(i==arr.length){
            while(j<brr.length){
                crr[k] = brr[j];
                j++; k++;
            }
        }

        if(j==brr.length){
            while(i<arr.length){
                crr[k] = arr[i];
                i++; k++;
            }
        }

        System.out.print(Arrays.toString(crr));

        // int[] arr = {1,2,3,0,0,0};
        // int[] brr = {4,5,6};

        // int m = 3;   
        // int n = 3;   

        // int i = m - 1;           
        // int j = n - 1;           
        // int k = m + n - 1;       

        // while(i >= 0 && j >= 0){
        //     if(arr[i] > brr[j]){
        //         arr[k] = arr[i];
        //         i--;
        //     } else {
        //         arr[k] = brr[j];
        //         j--;
        //     }
        //     k--;
        // }

        // // agar brr bacha ho
        // while(j >= 0){
        //     arr[k] = brr[j];
        //     j--; k--;
        // }

        // System.out.print(Arrays.toString(arr));

    }
}
