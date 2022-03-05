import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		
		q.add("a");
		q.add("b");
		q.add("c");
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.contains("c"));
		System.out.println(q.toArray()[1]);
		

	}

}

