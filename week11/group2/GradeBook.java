import java.util.Scanner;


//from https://github.com/braman/PT101-2017/
public class GradeBook {

	private String courseName;
	private int[][] grades;
	
	
	public GradeBook(String courseName, int courseGrades[][]) {
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
		
		printMax();	
		printMin();
		
		outputBarChart();
	}
	
	public double findAverage(int array[]) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		
		return sum / array.length;
	}
	
	public void outputGrades() {
		
		System.out.println("The grades are: ");
		
		System.out.print("               ");
		
		for (int i=0;i<grades[0].length;i++) {
			System.out.printf("Test %d ", i+1);
		}
		
		System.out.print(" Average");
		
		
		System.out.println();
		
		for (int i=0;i<grades.length;i++) {
			
			System.out.printf("Student %2d ", i + 1); 
			
			for (int j=0;j<grades[i].length;j++) {
				System.out.printf("%8d", grades[i][j]);
			}
			
			double avg = findAverage(grades[i]);
			
			System.out.printf("%9.2f", avg);
			
			
			System.out.println();
		}
	}
	
	public void printMin() {
		int min = grades[0][0];
		for(int i =0; i<grades.length-1;i++) {
			for (int j = 0;j<grades[i].length;j++) {
				if (min > grades[i][j]) {
					min = grades[i][j];
				}	
			}
		}
		System.out.printf("Lowest grade of all students is %d\n", min);	
	}
	
	
	
	
	public void printMax() {
		int max = 0; 
		for(int i = 0; i < grades.length; i++){
			
			for (int j=0;j<grades[i].length;j++) {
				if(max<grades[i][j]){
					max = grades[i][j];
				}
			}
			
		}
		
		System.out.printf("Highest grade of all students is %d\n", max);
	}
	
	
	public void outputBarChart() {
		int[] frequency = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		
		for(int i = 0; i<grades.length; i++){
			for (int j=0;j<grades[i].length;j++) {
				int temp = grades[i][j]/10;
				frequency[temp]++;
			}
		}
		
		System.out.println("Overall grade distribution");
		
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