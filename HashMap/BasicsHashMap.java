import java.util.HashMap;

public class BasicsHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Kritika",100);
        map.put("Varun",80);
        map.put("Rakesh",50);
        map.put("Amrita",70);
        map.put("Mohit",100);

        System.out.println(map);
        // System.out.println(map.containsKey("Kritika"));
        // System.out.println(map.get("Kritika"));
        // System.out.println(map.remove("Kritika"));
        // System.out.println(map);
        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.entrySet());
        map.put("Alok",20);
        System.out.println(map);

    }
}
