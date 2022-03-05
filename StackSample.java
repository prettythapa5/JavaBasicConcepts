import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		
		Stack<String> s= new Stack<String>();
		s.add("KK");
		s.add("22");
		s.add("MM");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.push("33"));
		System.out.println(s);
		System.out.println(s.isEmpty());
	}

}
