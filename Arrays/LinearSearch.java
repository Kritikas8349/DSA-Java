import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the values: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(k == arr[i]){
                System.out.print("Element found at index "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }

        

        sc.close();

    }
}
