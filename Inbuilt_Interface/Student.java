package Inbuilt_Interface;

public class Student {
    private String name;
    private int age;
    private int height;
    private String schoolName;

    public Student(String name, int age, int height, String schoolName) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
