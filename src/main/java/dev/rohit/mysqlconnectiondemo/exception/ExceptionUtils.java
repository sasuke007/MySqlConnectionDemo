package dev.rohit.mysqlconnectiondemo.exception;

public class ExceptionUtils {

    public static void throwNotFoundException(String error,String message){
        throw new MySqlConnectionDemoException(error,message);
    }
}
