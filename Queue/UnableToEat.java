import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UnableToEat {

    public int countStudents(int[] students, int[] sandwiches){

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for(int stu : students){
            q.add(stu);
        }

        for(int i = sandwiches.length - 1; i >= 0; i--){
            st.push(sandwiches[i]);
        }

        int rotation = 0;

        while(!q.isEmpty() && !st.isEmpty()){

            if(q.peek().equals(st.peek())){
                q.poll();
                st.pop();
                rotation = 0;
            }
            else{
                q.add(q.poll());
                rotation++;
            }

            if(rotation == q.size()){
                return q.size();
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int[] students = {1,1,0,0,1,1};
        int[] sandwiches = {0,1,0,1,0,0};

        UnableToEat obj = new UnableToEat();
        System.out.println(obj.countStudents(students, sandwiches));
    }
}