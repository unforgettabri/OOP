package activity2;

public class Student {
    String firstName, middleNameString, lastName, gender, email;
    int studentID;

    // create a field to track total number of students
    static int totalStudents = 0;

    // Create a constructor that accepts parameters for studentId, firstName,
    // middleName, lastName, gender, and email
    public Student(String firstName, String middleNameString, String lastName, String gender, String email,
            int studentID) {
        this.firstName = firstName;
        this.middleNameString = middleNameString;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.studentID = studentID;
        totalStudents++;
    }

    // Create a method public void displayStudentInfo() that prints all the details
    // for a specific student.
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleNameString);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
    }

    // Create a method public static int getTotalStudents() that returns the current
    // value of the totalStudents field.
    public static int getTotalStudents() {
        return totalStudents;
    }
}