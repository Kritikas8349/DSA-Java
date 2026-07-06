import java.util.Scanner;
public class basicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;

        // System.out.println(arr[0]+" ");


        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.print(arr.length);

        sc.close();
    }
}
