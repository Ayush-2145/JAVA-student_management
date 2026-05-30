package com.student.service;

import com.student.model.Student;
import java.util.*;

public class StudentService {
    private static Map<Integer, Student> studentDB = new HashMap<>();
    private static int idCounter = 1;

    // GET all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentDB.values());
    }

    
    // GET student by ID
    public Student getStudent(int id) {
        return studentDB.get(id);
    }

    // POST - add student
    public Student addStudent(Student student) {
        student.setId(idCounter++);
        studentDB.put(student.getId(), student);
        return student;
    }

    // PUT - update student
    public Student updateStudent(int id, Student student) {
        student.setId(id);
        studentDB.put(id, student);
        return student;
    }

    // DELETE student
    public boolean deleteStudent(int id) {
        return studentDB.remove(id) != null;
    }
}
