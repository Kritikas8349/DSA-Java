import java.util.Scanner;

public class AP1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        int a = 4;
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a+=3;
        }
        sc.close();
    }
}