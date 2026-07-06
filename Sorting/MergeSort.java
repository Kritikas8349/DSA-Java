import java.util.Arrays;

public class MergeSort {

    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] a, int[] b, int[] arr){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length){

            if(a[i] <= b[j]){          //<= is used to make the merge sort stable
                arr[k++] = a[i++];     
            }else{
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

    public static void mergesort(int[] arr){       //O(nlogn) time complexity

        int n = arr.length;

        if(n == 1){
            return;
        }

        int[] a = new int[n/2];
        int[] b = new int[n - a.length];

        for(int i = 0; i < a.length; i++){
            a[i] = arr[i];
        }

        for(int i = a.length; i < n; i++){
            b[i - a.length] = arr[i];
        }

        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
    }

    public static void main(String[] args) {           

        int[] arr = {80,40,70,10,50,20,60,30};

        print(arr);

        mergesort(arr);

        print(arr);       
        
        //O(n) space complexity because of the extra array used for merging
    }
}