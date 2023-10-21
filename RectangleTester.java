import java.util.Scanner;
public class RectangleTester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please, enter the width: ");
    double width = scanner.nextDouble();
    System.out.println("Please, enter the height: ");
    double height = scanner.nextDouble();

    Rectangle r1 = new Rectangle(width, height);
    System.out.println(r1.area());

    r1.setWidth(width);
    r1.setHeight(height);
    System.out.println("The width is: " +  r1.getWidth() + " and the heigth is: " + r1.getHeight());
    System.out.println("The total area is: " + r1.area());


  }  
}
