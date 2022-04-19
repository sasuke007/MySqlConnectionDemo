package dev.rohit.mysqlconnectiondemo.exception;

public class MySqlConnectionDemoException extends RuntimeException {

    private String error;
    private String message;

    public MySqlConnectionDemoException(String error, String message) {
        super(error);
        this.error = error;
        this.message = message;
    }
}
