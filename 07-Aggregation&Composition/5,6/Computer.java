public class Computer{
    private String brand;
    private Processor processor;
    private int ram;
    private boolean dedicatedGraficCard;
    private boolean working=false;

    public Computer (String brand,int ram,boolean dedicatedGraficCard,String processorBrand,int cache, double frequency)
    {
        setProcessor(processorBrand,cache,frequency);
        setBrand(brand);
        setRam(ram);
        setDedicatedGraifcCard(dedicatedGraficCard);
    }
    public void setBrand(String brand)
    {
        this.brand=brand.substring(0,1).toUpperCase()+brand.substring(1).toLowerCase();
    }
    public String getBrand()
    {
        return brand;
    }
    public void setProcessor(String processorBrand,int cache, double frequency)
    {
        Processor a = new Processor (processorBrand,cache,frequency);
        this.processor=a;
    }
    public String getProcessor()
    {
        return processor.toString();
    }
    public void setRam(int ram)
    {
        if(ram!=1 && ram!=2 && ram!=4 && ram!=8 && ram!=16 && ram!=32)
        {
            System.out.println("Podano błędną wartość RAM.");
        }
        else 
        {this.ram=ram;}
    }
    public int getRam()
    {
        return ram;
    }
    public void setDedicatedGraifcCard(boolean dedicatedGraficCard)
    {
        this.dedicatedGraficCard=dedicatedGraficCard;
    }
    public boolean getDedicatedGraficCard()
    {
        return dedicatedGraficCard;
    }
    public void setWorking(boolean working)
    {
        this.working=working;
    }
    public boolean getWorking()
    {
        return working;
    }
    private void turnOn()
    {
        setWorking(true);
    }
    private void turnOff()
    {
        setWorking(false);
    }
    public String toString()
    {
        return "Brand:" + getBrand()+ " Processor:"+ getProcessor()+ " RAM: "+getRam()+"GB, has dedicated Grafic Card: "
        +getDedicatedGraficCard()+" Is now working? "+ getWorking();
    }

        public static void main(String[] args) {
        Computer pc1= new Computer ("lenovo", 16, true, "amd", 24, 2.6);
        System.out.println(pc1.toString());
        pc1.turnOn();
        System.out.println(pc1.toString());
        pc1.turnOff();
    }
}