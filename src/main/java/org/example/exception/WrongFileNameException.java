package org.example.exception;

public class WrongFileNameException extends Exception{
    public WrongFileNameException(String exp) {
        super(exp);
    }
}
