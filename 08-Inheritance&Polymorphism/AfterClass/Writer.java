public class Writer {
    private String name;
    private String surname;
    private String genre;
    public Writer(String name, String surname, String genre)
    {
        setName(name);
        setSurname(surname);
        setGenre(genre);
    }

    public void setName(String name)
    {
        this.name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public String getName()
    {
        return name;
    }
    public void setSurname(String surname)
    {
        this.surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
    }
    public String getSurname()
    {
        return surname;
    }
    public void setGenre(String genre)
    {
        this.genre=genre.toLowerCase();
    }
    public String getGenre()
    {
        return genre;
    }
    public String toString()
    {
        return "Author: "+getName()+" "+getSurname()+" Genre: "+getGenre();
    }
}
