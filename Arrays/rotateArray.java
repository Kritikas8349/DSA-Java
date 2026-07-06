import java.util.*;

public class rotateArray {

    // reverse function
    public static void reverse(int[] nums, int i, int j){
        while(i <= j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    // rotate function
    public static void rotate(int[] nums, int k){
        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
    }

    // main function (execution starts here)
    public static void main(String[] args) {

        int[] nums = {10,20,30,40,50,60,70};
        int k = 3;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(nums));

        rotate(nums, k);

        System.out.println("Rotated Array:");
        System.out.println(Arrays.toString(nums));
    }
}
