import java.util.Arrays;

public class InversionCount {

    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    static long count = 0;

    public static long inversionCount(int[] arr) {
        count = 0;
        mergesort(arr);
        return count;
    }

    public static void merge(int[] a, int[] b, int[] arr){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){

            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }else{
                count += (a.length - i);
                arr[k++] = b[j++];
            }
        }

        while(i < a.length){
            arr[k++] = a[i++];
        }

        while(j < b.length){
            arr[k++] = b[j++];
        }
    }

    public static void mergesort(int[] arr){

        int n = arr.length;

        if(n <= 1){
            return;
        }

        int[] a = new int[n/2];
        int[] b = new int[n - n/2];

        for(int i = 0; i < a.length; i++){
            a[i] = arr[i]; // Copy the first half of the array to the left array
        }

        for(int i = a.length; i < n; i++){
            b[i - a.length] = arr[i]; // Copy the second half of the array to the right array       
        }

        mergesort(a);
        mergesort(b);
        merge(a, b, arr);
    }

    public static void main(String[] args) {
        int[] arr = {8,2,5,3,4,1};
        print(arr);
        long ans = inversionCount(arr);
        System.out.println("Inversion Count = " + ans);
        print(arr); 
    }
}