import java.util.Scanner;

public class sumParameterised {

    public static void sum(int n, int s){
        if(n==0){  //base case
            System.out.println("The sum is: "+s);
            return;
        }
        sum(n-1,s+n); //call and work
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       sum(n,0);
       sc.close();
    }
}

