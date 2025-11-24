package exercises;

import java.time.LocalDate;

public class Student {
    String studName;
    final int rollNumber;
    int studGrade;
    LocalDate birthday;
    float marksInEnglish;
    float marksInMaths;
    float marksInScience;
    static String schoolName = "School A"; // All students share the same school (But the school name may change)

    // Constructors should be public so as to create objects elsewhere
    public Student(String studName, int rollNumber, int studGrade, LocalDate birthday) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.studGrade = studGrade;
        this.birthday = birthday;
    } // For a new student with no marks (Bare minimum)

    // Fully-loaded constructor (Has everything - Basically just an overloaded constructor)
    public Student(String studName, int rollNumber, int studGrade, LocalDate birthday, float marksInEnglish, float marksInMaths,
            float marksInScience) {
        this.studName = studName;
        this.rollNumber = rollNumber;
        this.studGrade = studGrade;
        this.birthday = birthday;
        this.marksInEnglish = marksInEnglish;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    @Override
    public String toString() {
        return "Student [studName=" + studName + ", rollNumber=" + rollNumber + ", studGrade=" + studGrade
                + ", birthday=" + birthday + ", marksInEnglish=" + marksInEnglish + ", marksInMaths=" + marksInMaths
                + ", marksInScience=" + marksInScience + "]";
    }

    

}
