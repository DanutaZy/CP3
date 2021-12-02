

public class Audiobook extends Book {
    private int minutes;
    private int seconds;
    public Audiobook (Writer author, String title,Publisher publisher, int publicationYear, int minutes, int seconds)
    {
        super(author,title,publisher,publicationYear);
        setMinutes(minutes);
        setSeconds(seconds);
    }
    public void setMinutes(int minutes)
    {
        this.minutes=minutes;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public void setSeconds(int seconds)
    {
        if(seconds<=59)
        {this.seconds=seconds;}
        else{
            System.out.println("ERROR");
        }
    }
    public int getSeconds()
    {return seconds;}
    public String toString()
    {
        return "Author: "+getAuthor()+" Title: "+getTitle()+ " Publisher: " +getPublisher()+" Publication year: "+getPublicationYear()+" Length: "+getMinutes()+":"+getSeconds();
    }
    @Override public void display()
    {
        System.out.println(toString());
    }

}
