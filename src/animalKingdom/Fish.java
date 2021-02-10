package animalKingdom;

public class Fish extends Animals
{

    public Fish(String name,int yearDiscovered)
    {
     super(name,yearDiscovered);
    }

     @Override 
   public String move()
   {
       return "walk";
   }

    @Override 
   public String breath()
   {
       return "gills";
   }

    @Override 
   public String reproduce()
   {
       return "eggs";
   }


}