package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@code Faculty} class represents a faculty with basic information such as ID, name, and a collection of courses.
 * It provides methods to get and set these attributes, as well as add courses to the faculty.
 */
public class Faculty {

    /**
     * The unique identifier for the faculty.
     */
    String id;

    /**
     * The name of the faculty.
     */
    String name;

    /**
     * A collection of courses associated with the faculty, where each course is identified by its unique ID.
     */
    Map<String, Course> courses;

    /**
     * Default constructor.
     * Initializes collections to avoid null references during deserialization.
     */
    public Faculty() {
        this.courses = new HashMap<>();
    }

    /**
     * Constructs a new Faculty with the specified ID and name.
     *
     * @param id   the unique identifier for the faculty.
     * @param name the name of the faculty.
     */
    public Faculty(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashMap<>();
    }

    /**
     * Adds a course to the faculty.
     *
     * @param course the course to be added.
     */
    public void addCourse(Course course) {
        this.courses.put(course.getId(), course);
    }

    /**
     * Gets the unique identifier for the faculty.
     *
     * @return the unique identifier for the faculty.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the faculty.
     *
     * @param id the new unique identifier for the faculty.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the faculty.
     *
     * @return the name of the faculty.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the faculty.
     *
     * @param name the new name for the faculty.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the collection of courses associated with the faculty.
     *
     * @return the collection of courses associated with the faculty.
     */
    public Map<String, Course> getCourses() {
        return courses;
    }

    /**
     * Sets the collection of courses associated with the faculty.
     *
     * @param courses the new collection of courses for the faculty.
     */
    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }
}
