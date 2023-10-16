package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The {@code University} class represents a university with a list of faculties and a collection of students.
 * It provides methods to get and set these attributes, as well as add faculties and students to the university.
 */
public class University {

    /**
     * The list of faculties associated with the university.
     */
    List<Faculty> faculties;

    /**
     * A collection of students associated with the university, where each student is identified by their unique ID.
     */
    Map<String, Student> students;

    /**
     * Default constructor.
     * Initializes collections to avoid null references during deserialization.
     */
    public University() {
        this.faculties = new ArrayList<>();
        this.students = new HashMap<>();
    }

    /**
     * Adds a faculty to the university.
     *
     * @param faculty the faculty to be added.
     */
    public void addFaculty(Faculty faculty) {
        this.faculties.add(faculty);
    }

    /**
     * Adds a student to the university.
     *
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        this.students.put(student.getId(), student);
    }

    /**
     * Gets the list of faculties associated with the university.
     *
     * @return the list of faculties associated with the university.
     */
    public List<Faculty> getFaculties() {
        return faculties;
    }

    /**
     * Sets the list of faculties associated with the university.
     *
     * @param faculties the new list of faculties for the university.
     */
    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    /**
     * Gets the collection of students associated with the university.
     *
     * @return the collection of students associated with the university.
     */
    public Map<String, Student> getStudents() {
        return students;
    }

    /**
     * Sets the collection of students associated with the university.
     *
     * @param students the new collection of students for the university.
     */
    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }
}
