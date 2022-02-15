import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<String, String> user = new HashMap<String, String>();
		user.put("user1", "Password1");
		user.put("user2", "Password2");
		user.put("user3", "Password3");
		user.put("user4", "Password4");
		
		// This will print false since we are searching for value not key
		System.out.println(user.containsValue("user1"));
		
		// This will print true since we are searching for key and it exists!
		System.out.println(user.containsKey("user1")); 
		
		System.out.println(user.isEmpty());//checking if user list is empty or not.
		user.replace("user1", "Password1", "newuser");
		System.out.println(user);
		user.replace("user1", "Password1");
		System.out.println(user);
		
		user.remove("user1");
		System.out.println(user);
	}

}

/* Output
false
true
false
{user1=newuser, user2=Password2, user3=Password3, user4=Password4}
{user1=Password1, user2=Password2, user3=Password3, user4=Password4}
{user2=Password2, user3=Password3, user4=Password4}
*/
