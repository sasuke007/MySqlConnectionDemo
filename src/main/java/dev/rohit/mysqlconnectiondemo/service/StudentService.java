package dev.rohit.mysqlconnectiondemo.service;

import dev.rohit.mysqlconnectiondemo.entities.Student;
import dev.rohit.mysqlconnectiondemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static dev.rohit.mysqlconnectiondemo.exception.ExceptionUtils.throwNotFoundException;

@Service
public class StudentService {

    private final String error = "Email %s not found";
    private final String message = "Please register to see your details";
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent(final String email) {
        Optional<Student> student = studentRepository.findStudentByEmail(email);
        if (student.isEmpty()) {
            throwNotFoundException(String.format(error, email), message);
        }
        return student.get();
    }
}
