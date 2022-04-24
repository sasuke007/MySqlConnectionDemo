package dev.rohit.mysqlconnectiondemo;

import dev.rohit.mysqlconnectiondemo.entities.Course;
import dev.rohit.mysqlconnectiondemo.entities.Student;
import dev.rohit.mysqlconnectiondemo.repository.CourseRepository;
import dev.rohit.mysqlconnectiondemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySqlConnectionDemoApplication implements CommandLineRunner{

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(MySqlConnectionDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        Course course = Course.builder().duration(6).syllabus("data science").title("edge").build();
       // courseRepository.saveAndFlush(course);
        Student student =
            Student.builder().course(Course.builder().id(22L).build()).email("rohit.pandit@gmail.com").name(
            "rohit").build();
        studentRepository.saveAndFlush(student);
        //courseRepository.deleteById(3L);
        studentRepository.deleteById(25L);
    }
}
