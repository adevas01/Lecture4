public class PersonTester {
  public static void main(String[] args) {

    Person person = new Person("John Smith");
    System.out.println(person.getName() + " is having a birthday!");
    person.birthday();
  }  
}