package TestJava.ExerciseTwo;

public class Student {
    Long id;
    String name;

    public Student(Long studentId, String studentName){
        this.id = studentId;
        this.name = studentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Name: " + name + ", ID: " + id;
    }
}
