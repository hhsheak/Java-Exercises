package exercises;

import java.util.Scanner;
import java.time.LocalDate;

public class StudentList {
    static Student[] students;
    static Scanner scan;
    public static void main(String[] args) {
        students = new Student[1];
        scan = new Scanner(System.in);
        int grade = 0, id = 0;
        String name = "";

        // Add records
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name: ");
            name = scan.nextLine();
            System.out.print("Enter ID: ");
            id = scan.nextInt(); 
            scan.nextLine();
            System.out.print("Enter grade: ");
            grade = scan.nextInt(); 
            scan.nextLine();
            System.out.print("Enter year of birth: ");
            int yob = scan.nextInt(); 
            scan.nextLine();
            System.out.print("Enter month of birth: ");
            int mob = scan.nextInt(); 
            scan.nextLine();
            System.out.print("Enter date of birth: ");
            int dob = scan.nextInt(); 
            scan.nextLine();
            LocalDate birthday = LocalDate.of(yob, mob, dob);
            students[i] = new Student(name, id, grade, birthday);
        }

        displayRecords();

        // Add marks
        System.out.print("Select a student: ");
        int tmp = scan.nextInt();
        scan.nextLine();
        addMarks(tmp);
        
        displayRecords();

    }

    public static void addMarks(int id) {
        boolean isFound = false;
        for (Student student : students) {
            if (student.rollNumber == id) {
                isFound = true;
                System.out.print("Marks in English: ");
                float m1 = scan.nextFloat();
                scan.nextLine();
                System.out.print("Marks in Maths: ");
                float m2 = scan.nextFloat();
                scan.nextLine();
                System.out.print("Marks in Science: ");
                float m3 = scan.nextFloat();
                scan.nextLine();

                student.marksInEnglish = m1; // Alternatively, students.marksInEnglish = scan.nextFloat()
                student.marksInMaths = m2;
                student.marksInScience = m3;
            } 
        }
        if (!isFound) {
            System.out.println("Student not found.");
        }
        
    }

    static void displayRecords() {
        for (Student student : students) {
            // System.out.println(student.studName + " - " + student.rollNumber + " - " + student.studGrade + " - " + student.marksInEnglish + " - " + student.marksInMaths + " - " + student.marksInScience);
            System.out.println(student); // Invokes toString() (If no toString(), it will print the object's ID)
        }
    }
}
