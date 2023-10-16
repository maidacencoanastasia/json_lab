package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;

/**
 * The {@code UniversityJsonGenerator} class generates a sample University structure and converts it to JSON format.
 */
public class UniversityJsonGenerator {

    /**
     * The main method creates a sample University structure, converts it to JSON, and saves it to a file.
     *
     * @param args the command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Creating an example University structure
        University university = createSampleUniversity();

        // Convert the University object to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(university);
            // Save JSON data to a file
            saveJsonToFile("university.json", json);
            System.out.println("JSON data saved to university.json");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creates and returns a sample University structure with faculties, courses, and students.
     *
     * @return a sample University structure.
     */
    private static University createSampleUniversity() {
        University university = new University();

        Faculty itFaculty = new Faculty("1", "Факультет информационных технологий");
        itFaculty.addCourse(new Course("101", "Введение в программирование", "Иванов И.И."));
        itFaculty.addCourse(new Course("102", "Базы данных", "Петров П.П."));
        university.addFaculty(itFaculty);

        Faculty humanitiesFaculty = new Faculty("2", "Факультет гуманитарных наук");
        humanitiesFaculty.addCourse(new Course("201", "История", "Сидорова С.С."));
        humanitiesFaculty.addCourse(new Course("202", "Литература", "Кузнецова К.К."));
        university.addFaculty(humanitiesFaculty);

        Student student1 = new Student("1", "Иван Иванов", "1");
        student1.addCourse("101");
        student1.addCourse("102");
        university.addStudent(student1);

        Student student2 = new Student("2", "Мария Петрова", "2");
        student2.addCourse("201");
        university.addStudent(student2);

        return university;
    }

    /**
     * Saves the given JSON data to a file with the specified filename.
     *
     * @param fileName the name of the file to save the JSON data.
     * @param json     the JSON data to be saved.
     */
    private static void saveJsonToFile(String fileName, String json) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
