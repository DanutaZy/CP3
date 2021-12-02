 public class Processor
{
    private String brand;
    private int cache;
    private double frequency;
    public Processor(String brand,int cache,double frequency)
    {
        setBrand(brand);
        setCache(cache);
        setFrequency(frequency);
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand()
    {return brand;}
    public void setCache(int cache)
    {
        if(cache%2!=0)
        {System.out.println("Błędna wartość cache.");}
        else
        {this.cache=cache;}
    }
    public int getCache()
    {return cache;}
    public void setFrequency(double frequency)
    {
        if(frequency>=2.4 && frequency<=4.0)
        {this.frequency=frequency;}
        else
        {System.out.println("Częstotliwość taktowania poza zakresem.");}
    }
    public double getFrequency()
    {return frequency;}
    public String toString()
    {
        return "Processor brand: "+getBrand()+" Cache:"+getCache()+" Frequency:"+getFrequency()+" GHz";
    }
}