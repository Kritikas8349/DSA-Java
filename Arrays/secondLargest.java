import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the values: ");
        for(int i=0; i<arr.length; i++){
             arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
           max = Math.max(max, arr[i]);
        }

        int secmax = Integer.MIN_VALUE;

        // Find second largest
        for(int i=0; i<arr.length; i++){
            if(arr[i] != max){
                secmax = Math.max(secmax, arr[i]);
            }
        }

        System.out.println("The second maximum value is: "+secmax);

        sc.close();
    }
}
