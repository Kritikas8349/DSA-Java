// import java.util.Scanner;

public class marksStudent {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the marks: ");

        int[] arr = {45,23,42,36,31};
        boolean first = true;

        System.out.print("Roll no of students with < 35 marks: ");
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]<35){
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(i);
                first=false;
            }
        }
        // sc.close();
    }   
}
