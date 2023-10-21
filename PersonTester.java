import java.util.Scanner;
public class PersonTester {
  public static void main(String[] args) {
    System.out.println("Please, enter your name: ");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next(); 
    Person person = new Person(name);
   
    System.out.println(person.getName() + " is having a birthday!");
    person.birthday();
  }  
}