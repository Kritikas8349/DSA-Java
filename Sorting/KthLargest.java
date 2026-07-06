import java.util.Arrays;

public class KthLargest {

     public static void swap(int[] arr, int i, int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }

     public static int partition(int[] arr, int left, int right) {

          int pivot = arr[left];
      
          // Count elements smaller than pivot
          int smallCount = 0;
          for (int i = left + 1; i <= right; i++) {
              if (arr[i] < pivot) {
                  smallCount++;
              }
          }
      
          // Place pivot at its correct position
          int pivotIndex = left + smallCount;
          swap(arr, left, pivotIndex);
      
          // Rearrange elements around pivot
          int i = left;
          int j = right;
      
          while (i < pivotIndex && j > pivotIndex) {
      
              while (arr[i] < pivot) {
                  i++;
              }
      
              while (arr[j] >= pivot) {
                  j--;
              }
      
              if (i < pivotIndex && j > pivotIndex) {
                  swap(arr, i, j);
                  i++;
                  j--;
              }
          }
      
          return pivotIndex;
      }

      public static int quickSelect(int[] arr, int left, int right, int target){

          if(left == right){
              return arr[left];
          }
      
          int pivotIndex = partition(arr, left, right);
      
          if(pivotIndex == target){
              return arr[pivotIndex];
          }
      
          if(pivotIndex > target){
              return quickSelect(arr, left, pivotIndex - 1, target);
          }
      
          return quickSelect(arr, pivotIndex + 1, right, target);
      }
     public static void main(String[] args) {
          int[] arr = {3, 2, 1, 5, 6, 4};

          int k = 2;
      
          int target = arr.length - k;
      
          int ans = quickSelect(
              arr,
              0,
              arr.length - 1,
              target
          );
          System.out.println(Arrays.toString(arr));
     
          System.out.println(ans);
     }
}
