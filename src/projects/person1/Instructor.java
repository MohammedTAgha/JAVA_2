
package projects.person1;

public class Instructor extends Person{
    private double salary;

    public Instructor(String name, String yearofbirth , double salary) {
        super(name, yearofbirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString()+
                "major='" + getSalary() + '\'' +
                '}';
    }
}
