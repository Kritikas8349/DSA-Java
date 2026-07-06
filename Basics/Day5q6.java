public class Day5q6 {
    public static void main(String[] args) {
        
        int n = 12055;
        int rev = 0;
        

        while(n>0){

            int sum = n%10;
            rev = (rev*10)+sum;
            n = n/10;
        }

        System.out.println(rev);
    }
}
 