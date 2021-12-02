public class Figther {
    private String name;
    private String sex;
    private int age;
    private int won;
    private int lost;
    private double weight;
    private double weightCategory;
    private int overallSkill=0;
    public Figther (String name,String sex, int age,int won, int lost,double weigth,double weightCategory,int overallSkill)
    {
        setName(name);
        setSex(sex);
        setAge(age);
        setWon(won);
        setLost(lost);
        setWeight(weight);
        setWeightCategory(weightCategory);
        setOverallSkill(overallSkill);
       
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {return name;}
    public void setSex(String sex)
    {
        this.sex=sex;
    }
    public String getSex()
    {return sex;}
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {return age;}
    public void setWon(int won)
    {
        this.won=won;
    }
    public int getWon()
    {return won;}
    public void setLost(int lost)
    {
        this.lost=lost;
    }
    public int getLost()
    {return lost;}
    public void setWeight(double weight)
    {
        this.weight=weight;
    }
    public double getWeight()
    {return weight;}
    public void setWeightCategory(double weightCategory)
    {
        this.weightCategory=weightCategory;
    }
    public double getWeightCategory()
    {return weightCategory;}
    public void setOverallSkill(int overallSkill)
    {
        this.overallSkill+=overallSkill;
    }
    public int getOverallSkill()
    {return overallSkill;}
    private int makeWeight()
    {
        if((getWeight()-getWeightCategory())>=5.0)
        {return getOverallSkill();}
        else
        {return getOverallSkill();}
    }
    private void showInfo()
    {
        System.out.println("Name:"+getName()+"Sex:"+getSex()+"Age:"+getAge());
        System.out.println("Weight Category:"+getWeightCategory()+"Record:"+getWon()+":"+getLost());
        System.out.println("Skill:"+getOverallSkill());
    }
    private void developSkills()
    {
        setOverallSkill(1);
    }
    public static void main(String[] args) {
        Figther nolson = new Figther("Nolka","female",23,4,2,60.0,51.7,6);
        nolson.showInfo();
        nolson.makeWeight();
        nolson.showInfo();
        nolson.developSkills();
        nolson.showInfo();
    }
}
