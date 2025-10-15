package GeometricObject;

public class TestGeometricObject {
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two geometric objects
    Object r1 = new ComparableRectangle(10, 50);
    Object r2 = new ComparableRectangle(4, 8);

    System.out.printf("Comparing R1 to R2\n");
    int comparisonResult = ((ComparableRectangle) r1).compareTo((ComparableRectangle) r2);
    System.out.println("Comparison result: " + comparisonResult);
  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject object1,
      GeometricObject object2) {
    return object1.getArea() == object2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricObject(GeometricObject object) {
    System.out.println();
    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
  }
}