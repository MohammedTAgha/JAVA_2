
package projects.person1;

public class Student extends Person {
    private String major;
    public Student(String name, String yearofbirth ,String major) {
        super(name, yearofbirth);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString()+
                "major='" + getMajor() + '\'' +
                '}';
    }
}
