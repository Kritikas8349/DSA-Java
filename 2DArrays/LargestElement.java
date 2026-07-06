import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int max = Integer.MIN_VALUE;  //int max = 0;
    
        System.out.print("Enter the 2D array: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    
        System.out.println();
    
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The maximun value is: "+max);
    
        sc.close();
    
       } 
}
