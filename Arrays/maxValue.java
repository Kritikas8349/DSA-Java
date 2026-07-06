import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the values: ");
        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }  

        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            // if(arr[i]>max){
            //     max = arr[i];
            // }

            max = Math.max(max,arr[i]);
        }

        System.out.println("The maximum value is: "+max);

        sc.close();
    }
    
}
