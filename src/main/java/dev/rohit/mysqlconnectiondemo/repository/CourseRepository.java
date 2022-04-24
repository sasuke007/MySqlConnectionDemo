package dev.rohit.mysqlconnectiondemo.repository;

import dev.rohit.mysqlconnectiondemo.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{

  void deleteById(Long id);
}
