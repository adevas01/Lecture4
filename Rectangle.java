public class Rectangle {
  //Access modifiers
  private double width;
  private double height;
  
  //Constructor
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  //methods
  public double area() {
    return width * height; 
  }
}