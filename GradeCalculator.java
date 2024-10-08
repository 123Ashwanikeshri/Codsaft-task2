package Task2;
import java.util.*;

public class GradeCalculator {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        // Loop to take marks for each subject
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Validate marks input (should be between 0 and 100)
            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                marks = scanner.nextInt();
            }

            totalMarks += marks; // Add the marks to total
        }

        // Calculate the average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Assign grade based on the average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F'; // Fail grade
        }

        // Display the total marks, average percentage, and grade
        System.out.println("\n--- Result ---");
        System.out.println("Total marks obtained: " + totalMarks + " out of " + (numberOfSubjects * 100));
        System.out.println("Average percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();

	}

}
