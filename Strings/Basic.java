import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str = sc.next();
        // String str = sc.nextLine();    takes the whole input
        System.out.println("Hi "+ str);
        sc.close();
    }
}
