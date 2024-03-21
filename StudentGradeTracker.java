import java.util.Scanner;
class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students
        int numSubjects = scanner.nextInt();
        System.out.println("Entered number of subjects of each student: " + numSubjects);

        // Create an array to store the grades
        double[] grades = new double[numSubjects];

        // Input grades
        for (int i = 0; i < numSubjects; i++) {
            grades[i] = scanner.nextDouble();
            System.out.println("Entered grade for subject " + (i + 1) + ": " + grades[i]);
        }

        // Compute average
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / numSubjects;

        // Find highest and lowest grades
        double highestGrade = grades[0];
        double lowestGrade = grades[0];
        for (int i = 1; i < numSubjects; i++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
        }

        // Output results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        scanner.close();
  }
}