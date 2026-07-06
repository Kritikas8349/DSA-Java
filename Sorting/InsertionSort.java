public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, 8};
        int n = arr.length;
        
        //METHOD 1
        for(int i = 1; i < n; i++){
            for(int j = i; j >= 1; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

                else break;
            }
        }

        //METHOD 2
        // for(int i = 1; i < n; i++){
        //     int j=i;
        //     while (j>=1 && arr[j]<arr[j-1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //             j--;
        //     }
        // }

        

        // print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
