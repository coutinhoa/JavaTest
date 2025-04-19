package TestJava.ExerciseTwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRelativePath {

    public static List<Student> importStudents(String filePath){
        List<Student> students = new ArrayList<>();

        try{
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);

            for (int i=1; i< lines.size();i++) {
                String[] parts = lines.get(i).split(",");
                students.add(new Student(Long.parseLong(parts[0]), parts[1]));
            }
        } catch (IOException exception){
            System.out.println("Error reading file: "+ exception.getMessage());
        }

        return students;
    }

    public static void main(String[] args){
        Path path = Paths.get("src/TestJava/ExerciseTwo/students.csv").toAbsolutePath();
        List<Student> students= importStudents(String.valueOf(path));
        students.sort(Comparator.comparing(Student::getName));

        for(Student student: students){
           System.out.println(student.toString());
        }
    }
}
