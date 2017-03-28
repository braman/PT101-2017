import java.util.Scanner;


//from https://github.com/braman/PT101-2017/
public class GradeBook {

	private String courseName;
	private int[] grades;
	
	
	public GradeBook(String courseName, int courseGrades[]) {
		this.courseName = courseName;
		grades = courseGrades;
	}
	
	public void setCourseName(String name) {
		courseName = name;
	}
	public String getCourseName() {
		return courseName;
	}

	public int displayMessage() {
		System.out.printf("Welcome to the %s!\n", courseName);
		return 0;
	}
	
	public void processGrades() {
		outputGrades();
		
		printAverage();
		printMax();	
		printMin();
		
		outputBarChart();
	}
	
	public void outputGrades() {
		for (int i=0;i<grades.length;i++) {
			System.out.printf("Student %2d has grade %3d\n", i + 1, grades[i]);
		}
	}
	
	public void printAverage() {
		double sum = 0;
		for(int i = 0; i < grades.length; i++){
			sum += grades[i];
		}
		double average = sum / grades.length;
			System.out.printf("Average grade of all students is %.1f \n", average);
	}
	public void printMax() {
		double max = 0; 
		for(int i = 0; i < grades.length; i++){
			if(max<grades[i]){
				max = grades[i];
			}
		}
		System.out.printf("Maximum grade of all students is %.1f\n", max);
	}
	
	public void printMin() {
		int min = grades[0];
		for(int i =0; i<grades.length-1;i++)
			if (grades[i]>grades[i+1]){
				min=grades[i+1];
			}
		System.out.printf("Minimum grade of all students is %d", min);	
	}
	
	public void outputBarChart() {
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