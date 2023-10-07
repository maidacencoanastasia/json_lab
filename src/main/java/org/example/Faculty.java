package org.example;

import java.util.HashMap;
import java.util.Map;

public class Faculty {
    String id;
    String name;
    Map<String, Course> courses;
    // Default constructor
    public Faculty() {
        // Initialize collections to avoid null references during deserialization
        this.courses = new HashMap<>();
    }

    public Faculty(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashMap<>();
    }

    public void addCourse(Course course) {
        this.courses.put(course.id, course);
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

    public Map<String, Course> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }
}
