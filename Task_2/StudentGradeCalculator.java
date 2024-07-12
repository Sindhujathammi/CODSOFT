import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for each subject
        System.out.println("Enter marks for 1st subject out of 100: ");
        int subject1 = sc.nextInt();
        
        System.out.println("Enter marks for 2nd subject out of 100: ");
        int subject2 = sc.nextInt();
        
        System.out.println("Enter marks for 3rd subject out of 100: ");
        int subject3 = sc.nextInt();
        
        System.out.println("Enter marks for 4th subject out of 100: ");
        int subject4 = sc.nextInt();
        
        System.out.println("Enter marks for 5th subject out of 100: ");
        int subject5 = sc.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

        // Calculate average percentage
        double averagePercentage = totalMarks / 5.0;

        // Calculate grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        sc.close();
    }
}
