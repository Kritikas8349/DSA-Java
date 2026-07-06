public class ShallowCopyNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a;    
        temp.val = 12;        // shallow copy
        System.out.println(a.val);
    }
}
