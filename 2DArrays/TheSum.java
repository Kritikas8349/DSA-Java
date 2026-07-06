import java.util.Scanner;

public class TheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 2, cols = 2;
        int[][] arr = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter elements:");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum += arr[i][j];
            }
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }

}
