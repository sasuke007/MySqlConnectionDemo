package dev.rohit.mysqlconnectiondemo.web.rest.controllers;

import dev.rohit.mysqlconnectiondemo.entities.Student;
import dev.rohit.mysqlconnectiondemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student", method = RequestMethod.GET)
public class StudentController{

  private StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping(path = "/{email}")
  public ResponseEntity<Student> getStudentByName(@PathVariable final String email){
    return ResponseEntity.ok().body(studentService.getStudent(email));
  }
}
