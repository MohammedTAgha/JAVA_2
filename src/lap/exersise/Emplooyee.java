package lap.exersise;

public class Emplooyee extends Member {
    private String specialized;
    private String department;

    public Emplooyee(String name, int age, double salary,String specialized,String department) {
        super(name, age, salary);
        this.specialized=specialized;
        this.department=department;
    }

    public void printSalary(){
        System.out.println("salary :"+this.getSalary()*1.1);
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
        ", salary=" + this.getSpecialized() +
        ", salary=" + this.getDepartment() +
                '}';
    }
}
