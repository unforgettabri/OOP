package activity2;

public class Course {
    String courseCode, courseTitle;
    int enrollmentCount = 0;
    Student[] enrolledStudents = new Student[50];
    String schoolName = "My University";

    //create a constuructor that accepts courseCode and courseTitle
    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }

    public void enrollStudent(Student student) {
        //should add the provided student to the enrolledStudents array and increment enrollmentCount
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrollmentCount] = student;
            enrollmentCount++;
        } else {
            System.out.println("Enrollment limit reached. Cannot enroll more students.");
        }
    }
}
