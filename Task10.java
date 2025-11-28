public class Task10{
  class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
    }
    
  }
  public class TaskSheet10{
    public static void main (String[] args){
      Student [] studnets = new Student []{
        new Student ("Morgan", "Freemaan"),
        new Student ("Brad", "Pitt"),
        new Student ("Kevin", Spaacey"),
      };
      for (Students s: students){
        s.printFullName();
      }
    }
  }
