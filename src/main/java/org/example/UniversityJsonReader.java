package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UniversityJsonReader {
    public static void main(String[] args) {
        // Read JSON data from file
        String fileName = "university.json";
        String json = readJsonFromFile(fileName);

        if (json != null) {
            // Convert JSON data to University object
            University university = convertJsonToUniversity(json);

            // Display the University object
            displayUniversity(university);
        } else {
            System.out.println("Error reading JSON from file.");
        }
    }

    private static String readJsonFromFile(String fileName) {
        try {
            Path path = Paths.get(fileName);
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static University convertJsonToUniversity(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void displayUniversity(University university) {
        if (university != null) {
            System.out.println("University Faculties:");
            for (Faculty faculty : university.faculties) {
                System.out.println("Faculty ID: " + faculty.id + ", Name: " + faculty.name);
                System.out.println("Courses:");
                for (Course course : faculty.courses.values()) {
                    System.out.println("  Course ID: " + course.id + ", Name: " + course.name + ", Professor: " + course.professor);
                }
                System.out.println();
            }

            System.out.println("University Students:");
            for (Student student : university.students.values()) {
                System.out.println("Student ID: " + student.id + ", Name: " + student.name + ", Faculty ID: " + student.facultyId);
                System.out.println("Enrolled Courses: " + student.courseIds);
                System.out.println();
            }
        } else {
            System.out.println("Error converting JSON to University object.");
        }
    }
}

