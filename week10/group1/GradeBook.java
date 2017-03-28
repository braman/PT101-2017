import java.util.Scanner;

public class GradeBook {
	
	private String courseName;
	private int[] grades;
	
	public GradeBook(String name, int gradesArray[]) {
		courseName = name;
		grades = gradesArray;
	}
	
	public void displayMessage() {	
		System.out.printf("Welcome to the %s!\n", courseName);
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void processGrades() {
		outputGrades();
		
		
		System.out.printf("Average of all students: %.1f\n", getAverage());
		System.out.printf("The minimum of all students : %d\n", getMin());
		System.out.printf("The maximum of all students : %d\n", getMax());
		barChart();
	}
	
	public int getMin(){
		int min = grades[0];
		for(int i = 0; i<grades.length;i++ ){
			if(min>grades[i])
				min=grades[i];
		}
		return min;
	}
	public int getMax(){
		int max = grades[0];
		for(int i = 0; i<grades.length;i++ ){
			if(max<grades[i])
				max=grades[i];
		}
		return max;
	}
	
	public double getAverage() {
		double avg = 0;
		
		for (int g:grades) {
			avg += g;
		}
		
		return avg / grades.length;
	}
	
	
	public void outputGrades() {
		System.out.println("The grades are:");
		
		for (int student=0;student<grades.length;student++) {
			System.out.printf("Student %2d: %3d\n", student+1, grades[student]);
		}
	}
	public void barChart(){
		int[] frequency = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for(int i = 0; i<grades.length; i++){
			int temp = grades[i]/10;
			frequency[temp]++;
		}
		for (int i=0;i<frequency.length;i++) {
			
			if (i == 10) {
				System.out.printf("%5d: ", 100);	
			} else {
				System.out.printf("%02d-%02d: ", i * 10, i*10 + 9);
			}
		for (int stars=0;stars<frequency[i];stars++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
