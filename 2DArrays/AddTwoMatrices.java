import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] brr = new int[3][3];

        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[m][n]; 
        
        System.out.println("Enter Matrix A:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Matrix B
        System.out.println("Enter Matrix B:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                brr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
    
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j] = arr[i][j] + brr[i][j];
                System.out.println();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        
    
        sc.close();
    
       } 
}
