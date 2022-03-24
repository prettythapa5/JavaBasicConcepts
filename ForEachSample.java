import java.util.ArrayList;

public class ForEachSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		System.out.println(arr);
		
		for(int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.println();
		arr.stream().forEach(System.out::print);
		
		arr.forEach(e -> {arr.set(3, 600);});
		System.out.println();
		for(int a : arr) {
			System.out.print(a + ", ");
		}
		
	}
}
