public class Library {

    Book [] lib;
    public static void main(String[] args) {
    Publisher pub = new Publisher("Wydawca","Radom");
    Writer author= new Writer("Geralt","zRivii","FRASZKI");
    Book a = new Book(author,"Title",pub,2004);
    Book b= new Ebook (author,"tytul",pub,2005,"ebuk");
    Book c= new Ebook(author,"nazwa",pub,2003,"ebuk2");
    Book d=new Audiobook (author,"napis",pub,2004,15,20);
    Book e=new Audiobook (author,"dzwiek",pub,2001,45,58);

    Book [] lib={a,b,c,d,e};
        for (int i=0;i<=4;i++)
        {
        lib[i].display();
        }
    }
}
