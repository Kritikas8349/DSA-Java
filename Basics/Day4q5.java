import java.util.Scanner;
public class Day4q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int a = sc.nextInt();

        if((a%4==0 && a%100!=0) || (a%400==0))
        {
            System.out.println("It is a leap year.");
        }

        else{
            System.out.println("It is not a leap year.");
        }
        sc.close();
    }
}
