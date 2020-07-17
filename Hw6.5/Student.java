public class Student
{
    private String name;
    private char sex; 
    private Grade[] gradeList;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, char sex, int len)
    {
        this.name = name;
        this.sex = sex;
        this.gradeList = new Grade[len];
    }
    
    public void addGrade(Grade grade, int pos)  {
        this.gradeList[pos] = grade;
    }
   
    public Grade getGrade(int pos) {
        return this.gradeList[pos];
    }
    
    public String getName()  {
        return this.name;
    }
}

