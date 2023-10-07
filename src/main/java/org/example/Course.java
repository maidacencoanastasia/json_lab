package org.example;

public class Course {
    String id;
    String name;
    String professor;
    public Course() {
        // Default constructor needed for deserialization
    }

    public Course(String id, String name, String professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
