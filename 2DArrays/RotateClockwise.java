import java.util.Scanner;

public class RotateClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n]; 
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0; i<m; i++){
            for(int j=0; j<=i; j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        

        for(int i=0; i<m; i++){
            int a=0, b = m-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr [i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }

        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
