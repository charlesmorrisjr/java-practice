public class Person {
  private String firstName;
  private String lastName;
  private int age;

  // Constructor
  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public void printName() {
    System.out.println("Name: " + this.firstName + " " + this.lastName);
  }

  public void printAge() {
    System.out.println("Age: " + this.age);
  }

  public static void main(String[] args) {
    // Create a person and print their name and age
    Person jSmith = new Person("John", "Smith", 20);
    Person cMorris = new Person("Charles", "Morris", 30);

    jSmith.printName();
    cMorris.printName();
  }
}
