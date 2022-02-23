import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(3);
		h.add(null);
		h.add(4);
		
		System.out.println(h);
		System.out.println(h.hashCode());
		
		System.out.print("Elements iterated through an iterator -> ");
		Iterator<Integer> it = h.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
			
		}

	}

}
/*
[null, 1, 2, 3, 4]
10
Elements iterated through an iterator -> null 1 2 3 4 
*/
