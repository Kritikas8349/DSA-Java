public class PeakMountainIndex {
    public static void main(String[] args) {
        int[] arr = {10,20,60,50,60,20,10};
        int n = arr.length;

        for(int i=1; i<=n-2; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])  System.out.println(i);
        }
    }
} 
