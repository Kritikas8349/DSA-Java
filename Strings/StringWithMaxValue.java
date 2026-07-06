public class StringWithMaxValue {
    public static void main(String[] args) {
        String[] str = {"000009567", "345", "680", "5678", "0023"};
        String maxS = str[0];

        for(int i=0; i<str.length; i++){
            maxS = max(maxS,str[i]);
        }
        System.out.println(maxS);
    }

    public static String max(String a, String b) {
        String s = purify(a), t = purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!= t.charAt(i)) {
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }

    public static String purify(String s) {
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!= '0') return s.substring(i);
        }
        return s;
    }
}
