
package projects.person1;

public class Person {
    private String name;
    private String yearofbirth;

    public Person(String name, String yearofbirth) {
        this.name = name;
        this.yearofbirth = yearofbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(String yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearofbirth='" + yearofbirth + '\'' +
                '}';
    }
}
