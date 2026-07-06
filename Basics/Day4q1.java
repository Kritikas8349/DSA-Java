import java.util.Scanner;

public class Day4q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a>=0){
            System.out.print("The number is positive");
        }
        else{
            System.out.print("The number is negative");
        }

        sc.close();
    }
}
