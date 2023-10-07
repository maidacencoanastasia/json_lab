package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    List<Faculty> faculties;
    Map<String, Student> students;

    public University() {
        this.faculties = new ArrayList<>();
        this.students = new HashMap<>();
    }

    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    public void addStudent(Student student) {
        this.students.put(student.id, student);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }
}
