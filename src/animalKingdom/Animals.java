package animalKingdom;

abstract class Animals 
{
private static int maxId = 0;
private int id;
private String name;
private int yearDiscovered;

public Animals(String name,int yearDiscovered)
{
 maxId++;
 this.name = name;
 this.yearDiscovered = yearDiscovered;
 this.id = maxId;
}

abstract String move();
abstract String breath();
abstract String reproduce();
public String getName()
{
    return name;
}
public int getYearDiscovered()
{
    return yearDiscovered;
}

public int getId()
{
    return id;
}

 @Override
   public String toString()
   {
     return "Animals{id=" + id + ", name=" + name +", yearNamed=" + yearDiscovered + "}";
   }
}