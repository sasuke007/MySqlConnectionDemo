package dev.rohit.mysqlconnectiondemo.util;

public class QueryUtil {

    private QueryUtil(){}

    public static final String GET_STUDENT_BY_NAME = """
            select name,email from student s where s.email = :email""";
}
