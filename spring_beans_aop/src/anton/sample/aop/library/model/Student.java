package anton.sample.aop.library.model;

import java.util.StringJoiner;

/**
 * User: Sedkov Anton
 * Date: 05.07.2021
 */
public class Student {
    private String name;
    private int course;
    private double avgGrade;

    public Student(String name, int course, double avgGrade) {
        this.name = name;
        this.course = course;
        this.avgGrade = avgGrade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("course=" + course)
                .add("avgRate=" + avgGrade)
                .toString();
    }
}
