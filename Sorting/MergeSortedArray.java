import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] arr, int[] brr, int[] crr) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr.length && j < brr.length) {

            if (arr[i] <= brr[j]) {
                crr[k++] = arr[i++];
            } else {
                crr[k++] = brr[j++];
            }
        }

        while (i < arr.length) {
            crr[k++] = arr[i++];
        }

        while (j < brr.length) {
            crr[k++] = brr[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int[] brr = {2, 4, 6, 8, 10};

        int[] crr = new int[arr.length + brr.length];

        merge(arr, brr, crr);

        System.out.println(Arrays.toString(crr));
    }
}