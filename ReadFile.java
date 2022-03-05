import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Program to read a file in java
public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File file = new File("C:/Users/../Documents/textFile.txt");
	Scanner scan = new Scanner(file);
	
	String content = "";
	while(scan.hasNextLine()) {
		content = content.concat(scan.nextLine() + "\n");
	//System.out.println(scan.nextLine());
	}
	scan.close();
	FileWriter fw = new FileWriter("C:/Users/pretty.thapa/Documents/textFileCopied1.txt");
	fw.write(content);
	fw.close();
	}

}
