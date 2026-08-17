import java.util.HashMap;
// import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kritika",100);
        map.put("Varun",80);
        map.put("Rakesh",50);
        map.put("Amrita",70);
        map.put("Mohit",100);
        // for(Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }

        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        // for(Integer value : map.values()){
        //     System.out.println(value);
        // }
    }
}
