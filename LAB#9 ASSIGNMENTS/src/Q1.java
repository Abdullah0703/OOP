class Job{
    private String role;
    private float id,salary;

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public float getId() {
        return id;
    }
    public void setId(float id) {
        this.id = id;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Person{

    public Person() {
        super();
        Job j=new Job();
        j.setSalary(10000);
        System.out.println(j.getSalary());
    }
}
public class Q1 {
    public static void main(String[] args) {
        Person p =new Person();
    }
}
