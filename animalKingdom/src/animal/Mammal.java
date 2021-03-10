package animal;

public class Mammal extends Animal 
{
   
    public Mammal(String name,int year)
    {
        // this.name = name;
        // this.year = year;
        super(name,year);
    }

// @Override
// public String getName()
// {
//     return name;
// }

// @Override 
// public int getYear()
// {
//     return year;
// }

@Override
public String move()
{
    return "walk";
}

@Override
public String breath()
{
    return "lungs";
}

@Override
public String reproduce()
{
    return "live births";
}

}