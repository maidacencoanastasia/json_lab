package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Student} class represents a student with basic information such as ID, name, faculty ID, and a list of course IDs.
 * It provides methods to get and set these attributes, as well as add courses to the student.
 */
public class Student {

    /**
     * The unique identifier for the student.
     */
    String id;

    /**
     * The name of the student.
     */
    String name;

    /**
     * The unique identifier of the faculty to which the student belongs.
     */
    String facultyId;

    /**
     * A list of unique identifiers for the courses in which the student is enrolled.
     */
    List<String> courseIds;

    /**
     * Default constructor.
     * Initializes collections to avoid null references during deserialization.
     */
    public Student() {
        this.courseIds = new ArrayList<>();
    }

    /**
     * Constructs a new Student with the specified ID, name, and faculty ID.
     *
     * @param id        the unique identifier for the student.
     * @param name      the name of the student.
     * @param facultyId the unique identifier of the faculty to which the student belongs.
     */
    public Student(String id, String name, String facultyId) {
        this.id = id;
        this.name = name;
        this.facultyId = facultyId;
        this.courseIds = new ArrayList<>();
    }

    /**
     * Adds a course to the student's list of enrolled courses.
     *
     * @param courseId the unique identifier of the course to be added.
     */
    public void addCourse(String courseId) {
        this.courseIds.add(courseId);
    }

    /**
     * Gets the unique identifier for the student.
     *
     * @return the unique identifier for the student.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the student.
     *
     * @param id the new unique identifier for the student.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the student.
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name the new name for the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the unique identifier of the faculty to which the student belongs.
     *
     * @return the unique identifier of the faculty to which the student belongs.
     */
    public String getFacultyId() {
        return facultyId;
    }

    /**
     * Sets the unique identifier of the faculty to which the student belongs.
     *
     * @param facultyId the new unique identifier of the faculty for the student.
     */
    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    /**
     * Gets the list of unique identifiers for the courses in which the student is enrolled.
     *
     * @return the list of course IDs for the student.
     */
    public List<String> getCourseIds() {
        return courseIds;
    }

    /**
     * Sets the list of unique identifiers for the courses in which the student is enrolled.
     *
     * @param courseIds the new list of course IDs for the student.
     */
    public void setCourseIds(List<String> courseIds) {
        this.courseIds = courseIds;
    }
}
