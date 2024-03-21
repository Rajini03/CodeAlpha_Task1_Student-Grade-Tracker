import java.util.Scanner;

//For store student details along with their grades
class Student {
    private String name;
    private int id;
    private double[] grades;

    public Student(String name, int id, int numSubjects) {
        this.name = name;
        this.id = id;
        this.grades = new double[numSubjects];
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setGrade(int index, double grade) {
        grades[index] = grade;
    }

    public double[] getGrades() {
        return grades;
    }
}

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students
        int numStudents = scanner.nextInt();
        System.out.println("Enter the number of students: " + numStudents);
        
        // Prompt for the number of subjects
        int numSubjects = scanner.nextInt();
        System.out.print("Enter the number of subjects: " + numSubjects);
         
        // Create an array to store student objects
        Student[] students = new Student[numStudents];

         // Input student details name, id
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            
            //Read the student name
            String name = scanner.next();
            System.out.print("Name: " + name);
            
            //Read the student id
            int id = scanner.nextInt();
             System.out.print("\nID: " + id);
            
             students[i] = new Student(name, id, numSubjects);

            // Input grades for the student
            for (int j = 0; j < numSubjects; j++) {
                double grade = scanner.nextDouble();
                System.out.print("\nEnter grade for subject " + (j + 1) + ": " + grade);
                 students[i].setGrade(j, grade);
            }
            System.out.print("\n");
        }
       
        // Output results
        for (int i = 0; i < numStudents; i++) {
            Student student = students[i];
            double[] grades = student.getGrades();
            double total = 0;

            // Calculate total grade
            for (double grade : grades) {
                total += grade;
            }

            // Calculate average grade
            double average = total / numSubjects;

            System.out.println("\nStudent: " + student.getName() + ", ID: " + student.getId());
             
        // print the average grade
        System.out.println("Average grade: " + average);
        
        // Find highest and lowest grades
        double highestGrade = grades[0];
        double lowestGrade = grades[0];
        for (int j = 1; j < numSubjects; j++) {
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
        }
        
        //print the highest and lowest grade
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
            
    }
        scanner.close();
  }
}

/* Example of input for excute the code
2
2
Ravi 2 5.6 3.4
Ramu 1 7.2 6.5
*/