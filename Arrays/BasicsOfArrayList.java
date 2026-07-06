// import java.util.Scanner;
import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); //arr[0]=10
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);

        // System.out.println(arr);

        // for(int i=0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        System.out.print(arr);

        System.out.println();
        arr.set(2,300);
        // for(int i=0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        System.out.print(arr);

        arr.add(4,50);
        System.out.println();
        arr.set(2,300);
        // for(int i=0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
        // }
        System.out.print(arr);
    }
}
