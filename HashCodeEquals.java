import java.util.*;

class Student{
  private int id;
  private String name;

  Student(int id,String name)
    {
      this.id=id;
      this.name=name;
    }
  public void setId(int id)
    {
      this.id=id;
    }
  public int getId()
    { return this.id; }


  public void setName(String name)
    {
      this.name=name;
    }
  public String getName()
    { return this.name; }

    @Override                                                         //modified equals method
    public boolean equals(Object obj)
    {
      if ( obj==null ) return false;
      if (!( obj instanceof Student ))
        return false;
      if (obj == this)
        return true;
      return this.getId() == ( (Student) obj ).getId();
    }

    @Override                                                         //modified the hash code
    public int hashCode()
    {
      return id;
    }

}


public class HashCodeEquals{
  public static void main(String[] args)
  {
    ArrayList<Student> std=new ArrayList<Student>();

    Student s1=new Student(29,"Tushar");
    Student s2=new Student(29,"Tushar");

    std.add(s1);
    std.add(s2);

    System.out.println("first one's hashcode "+ s1.hashCode());
    System.out.println("second one's hashcode "+ s2.hashCode());
    System.out.println("Is it equal ? "+s1.equals(s2));
    System.out.println("Contains?"+std.contains(s1));
  }
}
