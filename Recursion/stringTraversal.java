public class stringTraversal {

    public static void skip(int i, String s, String ans){

        if(i == s.length()){
            System.out.println(ans);
            return;
        }

        if(s.charAt(i) != 'i'){
            ans += s.charAt(i);
        }

        skip(i + 1, s, ans);
    }
     public static void main(String[] args) {

        String s = "Kritika Singh";

        skip(0, s, "");
    }
}