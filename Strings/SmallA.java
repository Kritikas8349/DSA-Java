public class SmallA {
    public static void main(String[] args) {
        String s = "Kritika Singh";
        String str = "";

        for(int i=0; i<s.length(); i++){
            if(i%2 == 0 ) str += 'a';
            else str += s.charAt(i);
        }
        s = str;
        System.out.print(str+"");
    }
}
