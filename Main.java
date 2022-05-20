import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("The program will find the relationship between 2 of the listed people.");
    var elizabeth = new Person("Elizabeth", 1, null);
    var marj = new Person("Marj", 2, elizabeth);
    var rosanne = new Person("Rosanne", 3, elizabeth);
    var ruthanne = new Person("Ruthanne", 4, elizabeth);
    var donnie = new Person("Donnie", 5, elizabeth);
    var patricia = new Person("Patricia", 6, elizabeth);
    
    var kim = new Person("Kim", 7, marj);
    var monica = new Person("Monica", 8, marj);
    var martin = new Person("Martin", 9, marj);
    var gabe = new Person("Gabe", 10, marj);
    var john = new Person("John", 11, marj);
    var ben = new Person("Ben", 12, marj);
    var jerome = new Person("Jerome", 13, marj);
    
    var johnG = new Person("John G", 14, kim);
    var jamie = new Person("Jamie", 15, kim);
    var julia = new Person("Julia", 16, kim);
    
    var phil = new Person("Phil", 17, kim);
    var alley = new Person("Alley", 18, kim);
    var anna = new Person("Anna", 19, kim);
    var steven = new Person("Steven", 20, kim);
    
    var ellane = new Person("Ellane", 21, gabe);
    var jake = new Person("Jake", 22, gabe);
    
    var veera = new Person("Veera", 23, jerome);
    var precila = new Person("Precila", 24, jerome);
    var clarence = new Person("Clarence", 25, jerome);
    
    var lincoln = new Person("Lincoln", 26, phil);
    
    var mo = new Person("Mo", 27, ellane);
    
    var alex = new Person("Alex", 28, lincoln);

    var people = new ArrayList<Person>();
    people.add(elizabeth);
    people.add(marj);
    people.add(rosanne);
    people.add(ruthanne);
    people.add(donnie);
    people.add(patricia);
    people.add(kim);
    people.add(monica);
    people.add(martin);
    people.add(gabe);
    people.add(john);
    people.add(ben);
    people.add(jerome);
    people.add(johnG);
    people.add(jamie);
    people.add(julia);
    people.add(phil);
    people.add(alley);
    people.add(anna);
    people.add(steven);
    people.add(ellane);
    people.add(jake);
    people.add(veera);
    people.add(precila);
    people.add(clarence);
    people.add(lincoln);
    people.add(mo);
    people.add(alex);

    int n = people.size(); 
    for(int i = 0; i < n; i++) {
      System.out.println(String.format("%d. %s", i, people.get(i)));
          }

    Scanner userSelection = new Scanner (System.in);

    System.out.println("Select First Person:");

    int personA = userSelection.nextInt();

    System.out.println("Select Second Person:");

    int personB = userSelection.nextInt();

    System.out.println(String.format("Finding relationship between %s and %s.", people.get(personA), people.get(personB)));

//algorithm
    
    

      
 }

}

