import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
//Chapter 17
class FileTest {
	
	
	private static void populatePersons(File file, List<Person> persons) throws IOException {
		PrintWriter out = new PrintWriter(file);
		
		for (Person p: persons) {
			String line = String.format("%s;%s;%d", p.firstName, p.lastName, p.age); 
			
			out.println(line);
		}
		
		out.close();
	}
	
	public static void main(String args[]) {
		File file1 = new File("persons.csv");

		List<Person> somePersons = new LinkedList<Person>();
		
		somePersons.add(new Person("Test1", "Test2", 20));
		somePersons.add(new Person("Test1", "Test2", 20));
		somePersons.add(new Person("Test1", "Test2", 20));
		somePersons.add(new Person("Test1", "Test2", 20));
		somePersons.add(new Person("Test1", "Test2", 20));
		somePersons.add(new Person("Test1", "Test2", 20));
		somePersons.add(new Person("Test1", "Test2", 20));
		
		try {
			populatePersons(file1, somePersons);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
			//try to write
			//writeTest(file1);
			//try to read
			//readTest(file1);	
//		} catch (IOException e) {
			//e.printStackTrace();
//		}
	}
	
	/*
	private static void readTest(File inputFile) throws IOException {
		Scanner input = new Scanner(inputFile);
		
		String line = input.nextLine();
		
		System.out.printf("Line:%s\n", line);	
	}
	
	private static void writeTest(File outputFile) throws IOException {
		PrintWriter out = new PrintWriter(outputFile);
		
		out.println("Hello class!!!");
		
		out.close();
	
	}
	*/
	
	
	
	
} 
