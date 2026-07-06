public class TranformArray {
    public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};
        int x=0 ;
        for(int i=0; i<arr.length; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        for(int i=0; i<arr.length; i++){
            arr[i] *= (-1);
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
