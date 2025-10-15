
public class ComparableStudent extends Student 
    implements Comparable<ComparableStudent> {
  public ComparableStudent(float gpa, String name) {
    super(gpa, name);
  }
  
  @Override
  public int compareTo(ComparableStudent o) {
    if (getGPA() > o.getGPA())
      return 1;
    else if (getGPA() < o.getGPA())
      return -1;
    else
      return 0;
  }
  
}
