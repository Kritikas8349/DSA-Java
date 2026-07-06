public class Day5q5 {
    public static void main(String[] args) {
        
        int n = 12055;
        

        while(n>0){

            int sum = n%10;
            System.out.print(sum + "");
            n = n/10;
        }

        System.out.println();
    }
}
