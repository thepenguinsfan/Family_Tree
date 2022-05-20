public class Person{
 
  public String name;

  public int id;

  public Person parent;

  public Person(String name, int id, Person parent){
    this.name = name;
    this.id = id;
    this.parent = parent;
  }
    @Override
    public String toString(){
		  return this.name;
  }
}