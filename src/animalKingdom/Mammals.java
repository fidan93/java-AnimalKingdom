package animalKingdom;

public class Mammals extends Animals
{
   
//    private int id;

   public Mammals(String name, int yearDiscovered)
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
       return "lungs";
   }

    @Override 
   public String reproduce()
   {
       return "live births";
   }
   
  
 
}