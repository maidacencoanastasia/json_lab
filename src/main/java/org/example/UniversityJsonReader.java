package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The {@code UniversityJsonReader} class reads JSON data from a file, converts it to a University object,
 * and displays information about faculties, courses, and students.
 */
public class UniversityJsonReader {

    /**
     * The main method reads JSON data from a file, converts it to a University object,
     * and displays information about faculties, courses, and students.
     *
     * @param args the command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        String fileName = "university.json";
        String json = readJsonFromFile(fileName);

        if (json != null) {
            University university = convertJsonToUniversity(json);

            if (university != null) {
                displayUniversity(university);
            } else {
                System.out.println("Error converting JSON to University object.");
            }
        } else {
            System.out.println("Error reading JSON from file.");
        }
    }

    /**
     * Reads JSON data from a file and returns the content as a String.
     *
     * @param fileName the name of the file containing JSON data.
     * @return the JSON data as a String, or null if an error occurs.
     */
    private static String readJsonFromFile(String fileName) {
        try {
            Path path = Paths.get(fileName);
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            return null;
        }
    }

    /**
     * Converts JSON data to a University object using Jackson ObjectMapper.
     *
     * @param json the JSON data to be converted.
     * @return the University object, or null if an error occurs during conversion.
     */
    private static University convertJsonToUniversity(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, University.class);
        } catch (IOException e) {
            System.err.println("Error converting JSON to University object: " + e.getMessage());
            return null;
        }
    }

    /**
     * Displays information about faculties, courses, and students in the given University object.
     *
     * @param university the University object to display information about.
     */
    private static void displayUniversity(University university) {
        if (university != null) {
            displayFaculties(university);
            displayStudents(university);
        }
    }

    /**
     * Displays information about faculties and their associated courses in the given University object.
     *
     * @param university the University object to display information about.
     */
    private static void displayFaculties(University university) {
        System.out.println("University Faculties:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("Faculty ID: " + faculty.getId() + ", Name: " + faculty.getName());
            System.out.println("Courses:");
            faculty.getCourses().values().forEach(course ->
                    System.out.println("  Course ID: " + course.getId() + ", Name: " + course.getName() + ", Professor: " + course.getProfessor())
            );
            System.out.println();
        }
    }

    /**
     * Displays information about students and their enrolled courses in the given University object.
     *
     * @param university the University object to display information about.
     */
    private static void displayStudents(University university) {
        System.out.println("University Students:");
        for (Student student : university.getStudents().values()) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName() + ", Faculty ID: " + student.getFacultyId());
            System.out.println("Enrolled Courses: " + student.getCourseIds());
            System.out.println();
        }
    }
}
