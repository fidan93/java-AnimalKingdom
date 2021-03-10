package animal;

abstract class Animal 
{

    private static int maxId = -1;
    protected int id;
    protected String name;
    protected int year;

    public Animal(String name,int year)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

 
public String getName()
{
    return name;
}

public int getYear()
{
    return year;
}
    abstract String move();
    abstract String breath();
    abstract String reproduce();

      @Override 
    public String toString()
    {
      return "Animals{id="+id +", name=" + name +", yearNamed="+ year + "}";
    }

}