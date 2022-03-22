
public class GettersNSetters {
	String fname;
	String lname;
	int age;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void printDetails(GettersNSetters g) {
		System.out.println("First Name : " + g.getFname() + "\nLast Name : "+g.getLname() + "\nAge : " +g.getAge());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GettersNSetters gns = new GettersNSetters();
		gns.setFname("Percy");
		gns.setLname("Jackson");
		gns.setAge(22);
		printDetails(gns);	
	}

}
