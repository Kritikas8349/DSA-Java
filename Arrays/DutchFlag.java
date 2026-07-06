import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
        int[] arr = {0,0,0,2,2,1,0,2,1,0,2};

        int mid = 0;
        int right = arr.length-1;
        int left = 0;

        // while(mid<=right){
        //     if(arr[mid]==0){
        //         int temp = arr[mid];
        //         arr[mid] = arr[left];
        //         arr[left] = temp;
        //         left++;
        //         mid++;
        //     }

        //     else if(arr[mid]==1) mid++;

        //     else {
        //         int temp = arr[mid];
        //         arr[mid] = arr[right];
        //         arr[right] = temp;

        //         right--;
        //     }
        // }

        while(mid <= right){
    switch(arr[mid]){

        case 0:
            int temp0 = arr[mid];
            arr[mid] = arr[left];
            arr[left] = temp0;
            left++;
            mid++;
            break;

        case 1:
            mid++;
            break;

        case 2:
            int temp2 = arr[mid];
            arr[mid] = arr[right];
            arr[right] = temp2;
            right--;
            break;
    }
}

        System.out.print(Arrays.toString(arr));
    }
}
