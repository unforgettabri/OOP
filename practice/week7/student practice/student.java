public class student extends Person {
    private String course;
    private String studentId;
    private int year;

    // super(person attributes) - basta kasjay

    public String getCourse() {
        return course;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getYear() {
        return year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // override kano - basta kasjay ueuewuehueheuwueehwuehwuueueueue
    public String getInfo(String format) {
        if (format.equals("U"))
            return getInfo(format).toUpperCase();

        return getInfo(format);
    }
}