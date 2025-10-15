public class SortStudents {
  public static void main(String[] args) {
    ComparableStudent[] students = {
      new ComparableStudent(2.5f, "Tim"),
      new ComparableStudent(3.4f, "Ari"), 
      new ComparableStudent(4.00f, "Zach"),
      new ComparableStudent(3.75f, "Hoover")};
    java.util.Arrays.sort(students);
    for (Student student: students) {
      System.out.print(student + " " ); 
      System.out.println();
    }
  }
}
