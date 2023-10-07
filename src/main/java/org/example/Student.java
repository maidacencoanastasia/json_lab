package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String name;
    String facultyId;
    List<String> courseIds;
    // Default constructor
    public Student() {
        // Default constructor needed for deserialization
        this.courseIds = new ArrayList<>();
    }
    public Student(String id, String name, String facultyId) {
        this.id = id;
        this.name = name;
        this.facultyId = facultyId;
        this.courseIds = new ArrayList<>();
    }

    public void addCourse(String courseId) {
        this.courseIds.add(courseId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public List<String> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(List<String> courseIds) {
        this.courseIds = courseIds;
    }
}
