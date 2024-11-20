import java.util.ArrayList;
import java.util.Objects;
public class Employee  {
    int id;
    String name;
    Integer salary;
    String designation;
    ArrayList<String> emails = new ArrayList<>();
    Employee(){

    }
    Employee(int salary){
        this.salary = salary;
    }

    Employee(int id,String name,Integer salary, String designation, String email1, String email2){
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.designation = designation;
            emails.add(email1);
            emails.add(email2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); // Use name to compute hashCode, matching equals
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee e2 = (Employee) o;
        return Objects.equals(this.name, e2.name); // Use Objects.equals for null-safe comparison
    }

    public String toString(){
        return this.name +" "+ this.designation +" "+ this.salary +" "+ this.emails;
    }
}

