package dev.rohit.mysqlconnectiondemo.repository;

import dev.rohit.mysqlconnectiondemo.entities.Student;
import dev.rohit.mysqlconnectiondemo.util.QueryUtil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(name = QueryUtil.GET_STUDENT_BY_NAME)
    Optional<Student> findStudentByEmail(@Param("email") String email);
}
