public class ComputerFile {
    private String name;
    private String type;
    private String contents;
    private String createDate;
    private String lastChangeDate;
    private double size;
    public ComputerFile(String name, String type,String contents,String createDate,String lastChangeDate, double size)
    {
        setName(name);
        setType(type);
        setContents(contents);
        setCreateDate(createDate);
        setLastChangeDate(lastChangeDate);
        setSize(size);

    }
   
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }
    public void setContents(String contents)
    {
        this.contents=contents;
    }
    public String getContents()
    {
        return contents;
    }
    public void setCreateDate(String createDate)
    {
        this.createDate=createDate;
    }
    public String getCreateDate()
    {
        return createDate;
    }
    public void setLastChangeDate(String lastChangeDate)
    {
        this.lastChangeDate=lastChangeDate;
    }
    public void setLastChangeDate()
    {
        lastChangeDate=createDate;
    }
    public String getLastChangeDate()
    {
        return lastChangeDate;
    }
    public void setSize(double size)
    {
        this.size=size;
    }
    public double getSize()
    {
        return size;
    }
    private void read()
    {System.out.println(getContents());
    }
    private void write(String content, String date)
    {
        setContents(content);
        setLastChangeDate(date);
    }
    private void delete()
    {
        setName(null);
        setType(null);
        setContents(null);
        setCreateDate(null);
        setLastChangeDate(null);
        setSize(0);
    }
    public static void main(String[] args) {
        ComputerFile nowy=new ComputerFile("name", "type", "contents", "createDate", "lastChangeDate", 2.5);
        nowy.read();
        nowy.write("blablabla","datata");
        nowy.read();
    }
    
}
