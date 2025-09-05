package springBasics;

public class Teacher implements School {
    private Student student;

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Teacher(){
        System.out.println(getStudent());
    }

    @Override
    public String getSchoolName() {
        return "Sulakhe High School,From Teacher class";
    }
}
