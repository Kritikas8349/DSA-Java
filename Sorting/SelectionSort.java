public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, 8};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int min = arr[i];
            int mindx = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < min){
                    min = arr[j];
                    mindx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }

        // print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}