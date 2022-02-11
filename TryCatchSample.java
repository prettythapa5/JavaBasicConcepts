import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchSample {

	public static void main(String[] args) {
		/*
		 * try { System.out.println("This is an example of arithmentic Exception " +
		 * (4/0)); }
		 */
		
		try {
		//String fruit[] = {"Apple"}; 
		//System.out.println("This is an example of array out of bounds Exception "+fruit[1]);
		
		//int a = 4/0;
		//System.out.println("This is an example of arithmetic Exception " + a);
		
		//Exception exception = new Exception();
		//throw exception ; // this is an example of genera exception, throwing manually.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("This is an example of InputMismatchException");
		System.out.println("Please enter a number ");
		int num = scan.nextInt();
		System.out.println("You entered "+ num);
		scan.close();
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");}
		//catch(InputMismatchException e) {
			// System.out.println("InputMismatchException occurred"+ e); }
		catch(ArithmeticException e) {
			 System.out.println("An ArithmeticException occurred, \n a number cannot be divided by 0(zero) "+ e); }
		catch(Exception e) {
			System.out.println("This is an example of general Exception catch,\n that catches all exceptions in a program. "+ e);
		}
		
	}
}
