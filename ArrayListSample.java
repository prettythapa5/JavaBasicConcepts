import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		
	//Typical way of using an array, we need to know the specific index to add an item.
	String[] fruits = {"apple", "pineapple", "papaya", "banana"};
	System.out.println(fruits[1]);
	
	//ArrayList can be used to add or remove item easily
	//This way also works. it's a generic type of array, kind of raw data, though it works too
	ArrayList fruitsList= new ArrayList();
	fruitsList.add("Avocado");
	fruitsList.add(1);
	fruitsList.add(22);
	fruitsList.add("watermelon");
	System.out.println(fruitsList);
	
	//It's been classified specifically using <String> type
	ArrayList<String> fruitsList1= new ArrayList<String>();
	fruitsList1.add("Muskmelon");
	fruitsList1.add("Litchi");
	fruitsList1.add("Grapes");
	fruitsList1.add("Passion fruit");
	
	fruitsList1.remove("Grapes");
	
	System.out.println(fruitsList1);
	System.out.println(fruitsList1.contains("Grapes"));
	System.out.println(fruitsList1);
	fruitsList1.clear();
	System.out.println("After clearing teh array :"+fruitsList1);
	}

}
