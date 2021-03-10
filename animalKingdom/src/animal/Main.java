package animal;
import java.util.List;
import java.util.ArrayList;
public class Main{

    private static List<Animal> filterAnimals(List<Animal> theList,CheckFilter tester)
    {
      List<Animal> tempList = new ArrayList<>();

      for(Animal a : theList)
      {
          if(tester.test(a))
          {
            tempList.add(a);
          }
      }
    return tempList;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        Mammal m1 = new Mammal("Panda",1869);
        Mammal m2 = new Mammal("Zebra",1778);
        Mammal m3 = new Mammal("Koala",1816);
        Mammal m4 = new Mammal("Sloth",1804);
        Mammal m5 = new Mammal("Armadillo",1758);
        Mammal m6 = new Mammal("Raccoon",1758);
        Mammal m7 = new Mammal("Bigfoot",2021);

        Bird b1 = new Bird("Pigeon",1837);
        Bird b2 = new Bird("Peacock",1821);
        Bird b3 = new Bird("Toucan",1758);
        Bird b4 = new Bird("Parrot",1824);
        Bird b5 = new Bird("Swan",1758);

        Fish f1 = new Fish("Salmon",1758);
        Fish f2 = new Fish("Catfish",1817);
        Fish f3 = new Fish("Perch",1758);

        List<Animal> myList = new ArrayList<>();
        myList.add(m1);
        myList.add(m2);
        myList.add(m3);
        myList.add(m4);
        myList.add(m5);
        myList.add(m6);
        myList.add(m7);
        myList.add(b1);
        myList.add(b2);
        myList.add(b3);
        myList.add(b4);
        myList.add(b5);
        myList.add(f1);
        myList.add(f2);
        myList.add(f3);


      

        System.out.println(myList);
        myList.sort((a1,a2)-> a2.getYear() - a1.getYear());
        myList.forEach((a)-> System.out.println(a));
        System.out.println("\n");
        myList.sort((a1,a2)->a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach((a)-> System.out.println(a));
        System.out.println("\n");
        myList.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach((a)-> System.out.println(a));
        System.out.println("\n");
        List<Animal> filteredList = new ArrayList<>();
        filteredList = filterAnimals(myList,(a)-> a.breath() == "lungs");
        filteredList.forEach((a)-> System.out.println(a));
        System.out.println("\n");
        filteredList = filterAnimals(myList,(a)-> a.breath() == "lungs" && a.getYear()==1758);
        filteredList.forEach((a)-> System.out.println(a));

        System.out.println("\n");
        filteredList = filterAnimals(myList,(a)-> a.reproduce() == "eggs" && a.breath()=="lungs");
        filteredList.forEach((a)-> System.out.println(a));

        System.out.println("\n");
        filteredList = filterAnimals(myList,(a)->  a.getYear()==1758);
        filteredList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((a)-> System.out.println(a));

          System.out.println("\n");
        filteredList = filterAnimals(myList,(a)-> a instanceof Mammal);
        filteredList.forEach((a)-> System.out.println(a));
    }
}

// javac animal/*.java
// jar cvfe animal.jar animal.Main animal/*.class
// java -jar animal.jar