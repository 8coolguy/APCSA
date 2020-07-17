public class Section
{
    private String name;
    private Student[] studentList;

    public Section(String name, int len)
    {
        this.name = name;
        this.studentList = new Student[len];
    }

    public void addStudent(Student student, int pos)  {
        this.studentList[pos] = student;
    }
    
    public String getName()  {
        return this.name;
    }

    public Student getStudent(int pos) {
        return studentList[pos];
    }
}
