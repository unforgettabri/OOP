package activity2;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Brianna", "T.", "Bustamante", "Female", "brianna.bustamante@lorma.edu",
                2510236);
        Student student2 = new Student("Janiyah", "V.", "Tan", "Female", "janiyah.tan@lorma.edu", 2511049);
        Student student3 = new Student("Multo", "N.", "Sinauna", "Unknown", "N/A", 199500);

        Student.getTotalStudents();

        System.out.print("""
                Behold the student that lurks around
                the walls of LORmA at night:
                        """);
        student3.displayStudentInfo();

        Course.getSchoolName();

        Course course1 = new Course("CS101", "Introduction to Programming");

        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

        System.out.println("---------------------");
        System.out.print("""
                anD the students she follows home:
                """);
        course1.displayCourseInfo();
    }
}
