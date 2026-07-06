import java.util.ArrayList;

public class Permutation {

    static ArrayList<String> arr =
            new ArrayList<>();

    public static void printPer(
            String ans,
            String s
    ) {

        if(s.length() == 0) {
            arr.add(ans);
            return;
        }

        for(int i = 0; i < s.length(); i++) {

            String left =
                    s.substring(0, i);

            String right =
                    s.substring(i + 1);

            printPer(
                    ans + s.charAt(i),
                    left + right
            );
        }
    }

    public static void main(String[] args) {

        String s = "abc";

        printPer("", s);

        System.out.println(arr);
    }
}