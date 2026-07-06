import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int smallCount = 0;
        // Count elements smaller than pivot
        for(int i = low + 1; i <= high; i++){
            if(arr[i] < pivot){
                smallCount++;
            }
        }
        // Place pivot at its correct position
        int pivotIndex = low + smallCount;
        swap(arr, low, pivotIndex);
        int i = low;
        int j = high;
        while(i < pivotIndex && j > pivotIndex){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] >= pivot){
                j--;
            }
            if(i < pivotIndex && j > pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    public static void quicksort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int pivotIndex = partition(arr, low, high);
        // Sort left part
        quicksort(arr, low, pivotIndex - 1);
        // Sort right part
        quicksort(arr, pivotIndex + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 2, 1, 8, 7, 9, 3};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}