import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter mark for subject %d (out of 100): ", i + 1);
            totalMarks += scanner.nextInt();
        }

        double averagePercentage = (double) totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);

        System.out.printf("Total Marks: %d%n", totalMarks);
        System.out.printf("Average Percentage: %.2f%%%n", averagePercentage);
        System.out.printf("Grade: %c%n", grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) return 'A';
        if (averagePercentage >= 80) return 'B';
        if (averagePercentage >= 70) return 'C';
        if (averagePercentage >= 60) return 'D';
        return 'F';
    }
}