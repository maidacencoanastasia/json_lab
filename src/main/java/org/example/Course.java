package org.example;

/**
 * The {@code Course} class represents a course with basic information such as ID, name, and professor.
 * It provides methods to get and set these attributes.
 */
public class Course {

    /**
     * The unique identifier for the course.
     */
    String id;

    /**
     * The name of the course.
     */
    String name;

    /**
     * The professor teaching the course.
     */
    String professor;

    /**
     * Default constructor needed for deserialization.
     */
    public Course() {
        // Default constructor needed for deserialization
    }

    /**
     * Constructs a new Course with the specified ID, name, and professor.
     *
     * @param id        the unique identifier for the course.
     * @param name      the name of the course.
     * @param professor the professor teaching the course.
     */
    public Course(String id, String name, String professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
    }

    /**
     * Gets the name of the course.
     *
     * @return the name of the course.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the course.
     *
     * @param name the new name for the course.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the unique identifier for the course.
     *
     * @return the unique identifier for the course.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the course.
     *
     * @param id the new unique identifier for the course.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the professor teaching the course.
     *
     * @return the professor teaching the course.
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * Sets the professor teaching the course.
     *
     * @param professor the new professor teaching the course.
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
