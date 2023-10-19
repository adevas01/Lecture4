import java.util.Scanner;
public class RectangleProg{
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter width: ");
    double width = scanner.nextDouble();
    System.out.print("Enter height: ");
    double height = scanner.nextDouble();
    double area = area(width, height);
    System.out.println("The total area is " + area);


  }
  public static double area(double width, double height) {
    return width * height;
  }
}