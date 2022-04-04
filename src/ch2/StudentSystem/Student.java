package ch2.StudentSystem;

public class Student {
    int id ;
    int age ;
    String name ;
    String major ;
    double avg ;
    int passed ;
    double tawjehi_score ;
    public Student(int id, String name ,int age , String major, double tawjehi_score) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.major = major;
        this.tawjehi_score=tawjehi_score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }
}
