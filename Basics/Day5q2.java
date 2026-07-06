import java.util.Scanner;

public class Day5q2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int count = 1;

        while (count <= n) {
            System.out.println(count);
            count++;
        }

        sc.close();
    }
}
