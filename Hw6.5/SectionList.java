
public class SectionList
{
    private Section[] sectionList;

    public SectionList(int len)
    {
        sectionList = new Section[len];
    }
    
    public void addSection(Section section, int pos)  {
        this.sectionList[pos] = section;
    }
    
    public Section getSection(int pos) {
        return this.sectionList[pos];
    }
}
