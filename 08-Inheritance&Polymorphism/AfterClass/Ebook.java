public class Ebook extends Book {
    private String fileName;

    public Ebook(Writer author, String title,Publisher publisher, int publicationYear, String fileName)
    {
        super(author,title,publisher,publicationYear);
        setFileName(fileName);
    }
    public void setFileName(String fileName)
    {
        this.fileName=fileName;
    }
    public String getFileName()
    {
        return fileName;
    }
    public String toString()
    {
        return "Author: "+getAuthor()+" Title: "+getTitle()+ " Publisher: " +getPublisher()+" Publication year: "+getPublicationYear()+" File Name: "+ getFileName();
    }
    @Override public void display()
    {
        System.out.println(toString());
    }
}
