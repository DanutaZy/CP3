public class Publisher {
    private String name;
    private String city;
    public Publisher(String name, String city)
    {
        setName(name);
        setCity(city);
    }
    public void setName(String name)
    {
        this.name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public String getName()
    {return name;}

    public void setCity(String city)
    {
        this.city=city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
    }
    public String getCity()
    {return city;}

    public String toString()
    {
        return getName()+ " Headquarters: "+getCity(); 
    }
}
