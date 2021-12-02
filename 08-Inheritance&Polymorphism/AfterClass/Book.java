public class Book {
    private Writer author;
    private String title;
    private int publicationYear;
    private Publisher publisher;
    public Book (Writer author, String title,Publisher publisher, int publicationYear)
    {
        setAuthor(author);
        setTitle(title);
        setPublisher(publisher);
        setPublicationYear(publicationYear);
    }

    public void setAuthor(Writer author)
    {
        this.author=author;
    }
    public String getAuthor()
    {
        return author.toString();
    }
    public void setTitle(String title)
    {
        this.title=title.substring(0,1).toUpperCase()+title.substring(1).toLowerCase();
    }
    public String getTitle()
    {
        return title;
    }
    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear=publicationYear;
    }
    public int getPublicationYear()
    {return publicationYear;}

    public void setPublisher(Publisher publisher)
    {
        this.publisher=publisher;
    }
    public String getPublisher()
    {
        return publisher.toString();
    }

    public String toString()
    {
        return "Author: "+getAuthor()+" Title: "+getTitle()+ " Publisher: " +getPublisher()+" Publication year: "+getPublicationYear();
    }

    public void display()
    {
        System.out.println(toString());
    }
    
}
