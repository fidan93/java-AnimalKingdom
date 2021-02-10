package animalKingdom;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main 
{
     private static List<Animals> filterAnimals(List<Animals> theList,CheckAnimal tester)
    {
      List<Animals> tempList = new ArrayList<>();
      for(Animals v: theList)
      {
          if(tester.test(v))
          {
              tempList.add(v);
          }
      }
      return tempList;
    }

    public static void main(String[] arg)
    {
     Mammals panda = new Mammals("Panda", 1869);
     Mammals zebra = new Mammals("Zebra", 1778);
     Mammals koala = new Mammals("Koala",1816);
     Mammals sloth = new Mammals("Sloth",1804);
     Mammals armadillo = new Mammals("Armadillo",1758);
     Mammals raccoon = new Mammals("Raccoon",1758);
     Mammals bigfoot = new Mammals("Bigfoot",2021);

     Birds pigeon = new Birds("Pigeon",1837);
     Birds peacock = new Birds("Peacock",1821);
     Birds toucan = new Birds("Toucan",1758);
     Birds parrot = new Birds("Parrot",1824);
     Birds swan = new Birds("Swan",1758);

     Fish salmon = new Fish("Salmon",1758);
     Fish catfish = new Fish("Catfish", 1817);
     Fish perch = new Fish("Perch",1758);
     
     System.out.println(panda);
     System.out.println(zebra);

     List<Animals> myList = new ArrayList<>();
     myList.add(zebra);
     myList.add(panda);
     myList.add(koala);
     myList.add(sloth);
     myList.add(armadillo);
     myList.add(raccoon);
     myList.add(bigfoot);
     myList.add(pigeon);
     myList.add(peacock);
     myList.add(toucan);
     myList.add(parrot);
     myList.add(swan);
     myList.add(salmon);
     myList.add(catfish);
     myList.add(perch);

    
    //  myList.forEach((v) -> v.setId(i++));
    // for( int i = 0; i< myList.size(); i++)
    // {
    //    System.out.println( myList.get(i));
    // }
System.out.println("list all the animals alphabetically \n");
     myList.sort((v1,v2)-> v1.getName().compareToIgnoreCase(v2.getName()));
     myList.forEach((v) -> System.out.println(v));

 System.out.println("list all the animals by date \n");
     myList.sort((v1,v2)-> v2.getYearDiscovered()-v1.getYearDiscovered());
     myList.forEach((v) -> System.out.println(v));

System.out.println("sort by move \n");
     myList.sort((v1,v2)-> v1.move().compareToIgnoreCase(v2.move()));
     myList.forEach((v) -> System.out.println(v));

System.out.println("list all the animals lungs \n");
       List<Animals> filteredList = filterAnimals(myList,(v) -> v.breath() == "lungs");
      filteredList.forEach((v) -> System.out.println(v));

System.out.println("lungs and year");
      filteredList = filterAnimals(myList,(v) -> (v.breath() == "lungs") && (v.getYearDiscovered() == 1758));
      filteredList.forEach((v) -> System.out.println(v));

System.out.println("lungs and eggs");
      filteredList = filterAnimals(myList,(v) -> (v.reproduce() == "eggs") && (v.breath() == "lungs"));
      filteredList.forEach((v) -> System.out.println(v));

System.out.println("1758 alphabetically");
      filteredList = filterAnimals(myList,(v) -> (v.getYearDiscovered() == 1758));
      filteredList.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
      filteredList.forEach((v) -> System.out.println(v));
    }
}

// javac animalKingdom/*.java
// jar cvfe animalKingdom.jar animalKingdom.Main animalKingdom/*.class
// java -jar animalKingdom.jar
