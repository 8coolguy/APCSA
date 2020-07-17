public class HW6point5Driver
{
    private final static int SECTIONS = 3;
    private final static int STUDENTS = 5;
    private final static int GRADES = 3;
    
  
    public static void main(String[] args)
    {
        String[] sections = {"Period 1","Period 2","Period 7"};
        
        String[] studentNames = {"Beyonce","Eminem","Willie Nelson","Frank Sinatra",
            "Britney Spears","Joe Montana","Tom Brady","Serena Williams","Lindsey Vonn",
            "Danica Patrick","Cat Woman","Mickey Mouse", "Poison Ivy","Itchy","Scratchy"};
        
        char[] studentSex = {'f','m','m','m','f','m','m','f','f','f','f','f','f','m','m'};
        
        int[] score = {80,90,75,85,70,90,95,90,85,70,70,75,80,70,90,
                       65,90,70,75,75,80,85,90,75,60,95,80,70,75,95,
                       75,95,95,90,85,80,70,75,70,75,80,85,90,75,90};
        
        char[] category = {'h','t','f','h','t','f','h','t','f','h','t','f',
            'h','t','f','h','t','f','h','t','f','h','t','f','h','t','f',
            'h','t','f','h','t','f','h','t','f','h','t','f','h','t','f',
            'h','t','f'};
             

        
        SectionList sectionList = new SectionList(SECTIONS);
        Section section;
        Student student;
        Grade grade;
        double accumulutive=0.0;
        double femalehigh =0;
        double malelow =100;
        int female2count =0;
        double sum1=0;
        double sum2=0;
        double sum3=0;
        for (int i = 0; i<SECTIONS; i++)
        {
            section = new Section(sections[i], 5);
            sectionList.addSection(section, i);
        
            for (int j = 0; j < STUDENTS; j++)
            { 
                student = new Student(studentNames[j+(i*SECTIONS)],
                    studentSex[j+(i*SECTIONS)], GRADES);
                section.addStudent(student,j);
                for (int k = 0;  k < GRADES; k++)
                {
                   grade = new Grade(score[k+(j*STUDENTS)+(i*SECTIONS)], 
                        100, category[k+(j*STUDENTS)+(i*SECTIONS)]);
                   student.addGrade(grade,k);
                   
                }
            }
        }
        System.out.println();
        for (int i = 0; i < SECTIONS; i++)  {
            section = sectionList.getSection(i);
            System.out.println(section.getName());
            for (int j = 0; j < STUDENTS; j++)  {
                student = section.getStudent(j);
                System.out.println("\t" + student.getName());
                accumulutive =0;
                
                for (int k = 0; k < GRADES; k++)  {
                    grade = student.getGrade(k);
                    System.out.println("\t\t" + grade.getScore() +" " + grade.getCategory());
                        if(grade.getCategory()==('f'))
                            accumulutive=accumulutive + .5*grade.getScore();
                        if(grade.getCategory()==('h'))
                            accumulutive=accumulutive + .2*grade.getScore();
                        if(grade.getCategory()==('t'))
                            accumulutive=accumulutive + .3*grade.getScore();
                       

                  
                }
                        if(accumulutive >90){
                            System.out.println("Grade: A "+accumulutive );
                            if((i==1) && (studentSex[j]==('f')))
                                   female2count++;
                        }
                        else if(accumulutive >80){
                            System.out.println("Grade: B " +accumulutive);
                            if((i==1) && (studentSex[j]==('f')))
                                female2count++;
                        }
                        else if(accumulutive >70)
                            System.out.println("Grade: C "+accumulutive);
                        else if(accumulutive >60)
                            System.out.println("Grade: D "+accumulutive);
                        else System.out.println("Grade: F "+accumulutive); 
                        if(studentSex[j]==('m'))
                            if(malelow>accumulutive)
                                malelow=accumulutive;
                        if(studentSex[j]==('f'))
                                if(accumulutive>femalehigh)
                                    femalehigh=accumulutive;
                        if (i==0)
                            sum1= sum1+accumulutive;
                        if (i==1)
                            sum2= sum2+accumulutive;
                        if (i==2)
                            sum3= sum3+accumulutive;
                        
                            
            }
            System.out.println("Low: " +malelow);
            System.out.println("High: " +femalehigh);
            System.out.println("S1Average: " +sum1/(5));
            System.out.println("S2Average: " + sum2/(5));
            System.out.println("S3Average: " +sum3/(5));
            System.out.println("Number of Female Students with a B or higher: "+female2count);
        }
        
    }
}